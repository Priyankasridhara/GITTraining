import { Routes, RouterModule } from '@angular/router';

import { HomeComponent } from './home';
import { AdminComponent } from './admin';
import { LoginComponent } from './login';
import { AuthGuard } from './_helpers';
import { Role } from './_models';
import { CreateTaskComponent } from './task/create-task/create-task.component';
import { TaskListComponent } from './task/task-list/task-list.component';
import { UpdateTaskComponent } from './task/update-task/update-task.component';
import { UserListComponent } from './task/user-list/user-list.component';
import { CreateUserComponent } from './task/create-user/create-user.component';
import { UpdateStatusComponent } from './task/update-statusbyuser/update-statusbyuser.component';
import {TaskListByIdComponent } from './task/task-list-by_id/task-list-by_id.component';


const routes: Routes = [
    {
        path: '',
        component: HomeComponent,
        canActivate: [AuthGuard]
    },
    {
        path: 'admin',
        component: AdminComponent,
        canActivate: [AuthGuard],
        data: { roles: [Role.Admin] },
        
    },
    {
        path: 'login',
        component: LoginComponent
    },
    {path:'add', component:CreateTaskComponent},
    {path:'task', component:TaskListByIdComponent},
    {path:'task', component:TaskListByIdComponent,canActivate: [AuthGuard],
    data: { roles: [Role.Admin]}},
    {path:'tasks', component:TaskListComponent,canActivate: [AuthGuard],
    data: { roles: [Role.Admin]}},
    
   
   
    {path:'update/:id', component:UpdateTaskComponent ,canActivate: [AuthGuard],
    data: { roles: [Role.Admin]}},
    {path:'users', component:UserListComponent,canActivate: [AuthGuard],
    data: { roles: [Role.Admin]}},
    {path:'adduser', component:CreateUserComponent,canActivate: [AuthGuard],
    data: { roles: [Role.Admin]}},
    {path:'update/:id/status', component:UpdateStatusComponent},

    
    // otherwise redirect to home
    { path: '**', redirectTo: '' }
];

export const appRoutingModule = RouterModule.forRoot(routes);