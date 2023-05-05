import { Component } from '@angular/core';
import { NgForm } from '@angular/forms';
import { HttpclientService } from '../httpclient.service';

@Component({
  selector: 'app-reg',
  templateUrl: './reg.component.html',
  styleUrls: ['./reg.component.css'],
  
})
export class RegComponent {
  constructor(public service:HttpclientService){ }
  getValues(data:any, companyId:any,jobId:any){
    const data_set:any={
      candidateName:data.candidateName,
      candidateEmail:data.candidateEmail,
      candidatePhone:data.candidatePhone,
      highestQualification:data.highestQualification,
      degree:data.Degree,
      communicationAddress:data.communicationAddress,
      currentCity:data.currentCity,
      companyId:companyId,
      jobId:jobId
    }
    this.service.candidateApply(data_set);
  }
}
