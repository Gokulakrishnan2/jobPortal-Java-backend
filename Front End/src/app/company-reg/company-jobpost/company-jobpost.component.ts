import { Component } from '@angular/core';
import { NgForm } from '@angular/forms';
import { HttpclientService } from 'src/app/httpclient.service';

@Component({
  selector: 'app-company-jobpost',
  templateUrl: './company-jobpost.component.html',
  styleUrls: ['./company-jobpost.component.css']
})
export class CompanyJobpostComponent {
  constructor(public service:HttpclientService){  }
 
  getValues(data:any, id:any){
    const {jobRole,jobDescription}=data;
    const data_set:any={
      jobRole:jobRole,
      jobDescription:jobDescription,
      companyId:id
    }
    this.service.companyJobpost(data_set);
  }  
}
