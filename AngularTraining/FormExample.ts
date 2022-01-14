import {Component} from '@angular/core';
@Component({
  selector:'template-form',
  templateUrl:'./app.formComponent.html'
})
export class FormExample{
  onSubmit(value:any){
    console.log(value);
  }
}
