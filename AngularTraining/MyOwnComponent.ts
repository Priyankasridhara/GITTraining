import { Component } from "@angular/core";
import { MyService } from "./MyService";
@Component({
    selector:'my-own-com',
    template:`
    <div>
    username:<input type="text" name="t1"/><br>
    password:<input type="text" name="t1"/><br>
    <button  type="submit">login</button>
    <p>{{show}}</p>
    </div>
    `
})
export class MyOwnComponent{
    show:string;
    constructor(my:MyService)
    {
        this.show=my.getName();
    }
}