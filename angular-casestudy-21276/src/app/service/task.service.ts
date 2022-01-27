import { Injectable } from '@angular/core';
import {ApiResponse} from 'src/app/model/api.response';
import {Task} from 'src/app/model/task.model';
import {HttpClient} from '@angular/common/http';
import {Observable} from "rxjs/index";
import { User } from '@app/model/user.model';


@Injectable({
  providedIn: 'root'
})
export class TaskService {

  constructor(private http:HttpClient) { }
  baseUrl:string='http://localhost:8080/restaddtaskm/';
  baseUrl1:string='http://localhost:8080/restgetalltask';
  updateUrl:string='http://localhost:8080/restgetalltask/updateownerid/{taskid}/{ownerid}';
  statusUrl:string='http://localhost:8080/getalltask/';
  getuser:string='http://localhost:8080/restgetuser/';
  updatestatus:string="http://localhost:8080/updatestatus/";
  getTaskByIdURL:string='http://localhost:8080/restgetAlltask/2126';


  getTasks():Observable<any>{
    return this.http.get<ApiResponse>(this.baseUrl1);
  }
  getUsers():Observable<any>{
    return this.http.get<ApiResponse>(this.getuser);
  }
  createUser(user:User):Observable<ApiResponse>{
    return this.http.post<ApiResponse>(this.getuser,user);
  }
  getTaskById():Observable<any>{
    return this.http.get(this.getTaskByIdURL);
  }
  
  getTaskByIds(taskId:number):Observable<any>{
    return this.http.get(this.getTaskByIdURL+taskId);
  }
  createTask(task:Task):Observable<ApiResponse>{
    return this.http.post<ApiResponse>(this.baseUrl,task);
  }
  updateTask(taskId:number, task:Task):Observable<any>{
    return this.http.put<any>(this.baseUrl+task.taskId,task);
  }
  deleteTask(id:number):Observable<ApiResponse>{
    return this.http.delete<ApiResponse>(this.baseUrl+id);
  }
  getTaskByStatus(status:string):Observable<any>{
    return this.http.get<any>(`http://localhost:8080/getalltask/${status}`);

  }
  updateStatus(id:number,status:string):Observable<any>{
    return this.http.get<ApiResponse>(`http://localhost:8080/getalltask/${id}/${status}`);
  
}
}
