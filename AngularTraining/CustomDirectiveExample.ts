import { Directive,ElementRef,Input,OnInit } from "@angular/core";
@Directive({
    selector:'[color]'
})
export class CustomDirectiveExample implements OnInit{
    @Input() color:string | undefined;
    constructor(private e1:ElementRef){

    }
    ngOnInit() {
        this.e1.nativeElement.style.backgroundColor=this.color;
    }
}