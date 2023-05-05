import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { NgForm } from '@angular/forms';
import { ToastrService } from 'ngx-toastr';
import { Router } from '@angular/router';
// import { Observable } from 'rxjs';
// import { catchError } from 'rxjs/operators';
// import { throwError } from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class HttpclientService {
  public serverUrl = `http://localHost:8080`;
  mydata: any;
  myObject: any;
  userApply: any;
  constructor(public http:HttpClient, public toastr:ToastrService, public router:Router) {  }
  
  async companyReg(data:NgForm) {
    try {
      var res = await this.http.post<any>(`${this.serverUrl}`,data)
                               .toPromise()
                               .then((res)=>{
                                console.log(res)
                                 alert(res.message)
                                 this.router.navigate(['register/login']);
      })
    } catch (error:any) {
      alert(error.error.detail);
    } 
  }
  // companyReg(data: NgForm) {
  //   this.http.post<any>(`${this.serverUrl}`, data).pipe(
  //     catchError((error: any) => {
  //       alert(error.error.detail);
  //       return throwError(error);
  //     })
  //   ).subscribe((res: any) => {
  //     alert(res.message);
  //     this.router.navigate(['register/login']);
  //   });
  // }

  async companyLogin(data:NgForm) {
    try {
      var res = await this.http.post<any>(`${this.serverUrl}`+`/login`,data).toPromise()
        this.mydata=res;
        console.log(this.mydata.responseObject.data.companyName,"hey");
    } catch (error:any) {
      console.log(error.error.string,"errorrr")
      alert(error.error.string);
      this.router.navigate(['']);
    } 
  }

  companyJobpost(data:NgForm){
    this.http.post<any>(`${this.serverUrl}`+`/job_entry`,data).subscribe((res)=>{
      alert(res.message);
      this.router.navigate(['']);
    })
  }
  
  jobSearch(){
    console.log(this.http.get<any>(`${this.serverUrl}`+`/job_search`))
    return this.http.get<any>(`${this.serverUrl}`+`/job_search`)
  }

  candidate(comp:any){
    this.userApply=comp;
    console.log(this.userApply.companyId,"company ID");
  }

  candidateApply(data:NgForm){
    console.log(data);
    this.http.post<any>(`${this.serverUrl}`+`/candidate_apply`,data).subscribe((res)=>{
      alert(res.message);
      this.router.navigate(['']);
    })
  }
}
    
  



