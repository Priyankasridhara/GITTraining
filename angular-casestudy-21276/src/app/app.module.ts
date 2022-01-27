import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule, HTTP_INTERCEPTORS } from '@angular/common/http';
import { appRoutingModule } from './app.routing';
import { AppComponent } from './app.component';
import { CreateTaskComponent } from './task/create-task/create-task.component';
import { UpdateTaskComponent } from './task/update-task/update-task.component';
import { TaskListComponent } from './task/task-list/task-list.component';
import { UserListComponent } from './task/user-list/user-list.component';
import { UpdateStatusComponent } from './task/update-statusbyuser/update-statusbyuser.component';

import {FormsModule} from '@angular/forms';


// used to create fake backend
import { fakeBackendProvider } from './_helpers';
import { JwtInterceptor, ErrorInterceptor } from './_helpers';
import { HomeComponent } from './home';
import { AdminComponent } from './admin';
import { LoginComponent } from './login';
import { CreateUserComponent } from './task/create-user/create-user.component';
import { DataTablesModule } from 'angular-datatables';



@NgModule({
    imports: [
        BrowserModule,
        ReactiveFormsModule,
        HttpClientModule,
        appRoutingModule,
        FormsModule,
        DataTablesModule
        
        
    ],
    declarations: [
        AppComponent,
        HomeComponent,
        AdminComponent,
        LoginComponent,
        CreateTaskComponent,
        UpdateTaskComponent,
        TaskListComponent,
        UserListComponent,
        CreateUserComponent,
        UpdateStatusComponent
        
       

       
    ],
    providers: [
        { provide: HTTP_INTERCEPTORS, useClass: JwtInterceptor, multi: true },
        { provide: HTTP_INTERCEPTORS, useClass: ErrorInterceptor, multi: true },

        // provider used to create fake backend
        fakeBackendProvider
    ],
    bootstrap: [AppComponent]
})

export class AppModule { }