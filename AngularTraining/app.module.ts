import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';


import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FormsModule } from '@angular/forms';
import { forExample} from "./ForExample";
import { SortPipe } from './CustomSortPipe';
import { CustomDirectiveExample } from './CustomDirectiveExample';
import { MyOwnComponent } from './MyOwnComponent';
import { HttpClientModule} from '@angular/common/http';
import { EmployeeDetailsComponent } from './employee-details.component';
import { TaskDetailsComponent } from './task-details.component';
import { FormExample} from './FormExample';
import { FormValidation} from "./FormValidation";
import {ReactiveFormsModule} from "@angular/forms";
import { PostExampleComponent } from './post-example/post-example.component';
import {NewModule} from './NewModule';
import { PostCasestudyComponent } from './post-casestudy/post-casestudy.component';
@NgModule({
  declarations: [
    AppComponent,
    CustomDirectiveExample,
    MyOwnComponent,
    EmployeeDetailsComponent,
    TaskDetailsComponent,
    FormExample,
    FormValidation,
    PostExampleComponent,
    PostCasestudyComponent,
   
    
    

    
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    ReactiveFormsModule,
    NewModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
