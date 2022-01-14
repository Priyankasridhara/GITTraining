import { Injectable } from "@angular/core";
import { HttpClient,HttpErrorResponse } from "@angular/common/http";
import { IEmployee } from "./employee";
import { Observable } from "rxjs";
import { share } from "rxjs/operators";



@Injectable({
    providedIn:'root'
})
export class EmployeeServiceService{
    private url: string="/assets/data/employee.json";
    

    constructor(private http:HttpClient){}
        getEmployee(): Observable<IEmployee[]>{
            return this.http.get<IEmployee[]>(this.url);
        }
       
    }


