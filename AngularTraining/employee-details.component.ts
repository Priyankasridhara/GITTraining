import { Component,OnInit } from "@angular/core";
import { EmployeeServiceService } from "./employee-service.service";
import { IEmployee } from "./employee";

@Component({
    selector:'app-employee-details',
    templateUrl:'./employee-details.component.html',
})
export class EmployeeDetailsComponent implements OnInit{
    public employee:IEmployee[] | undefined;
    constructor(private employeeService:EmployeeServiceService){}
    ngOnInit() {
        this.employeeService.getEmployee()
        .subscribe(data=>this.employee=data)
    }
}