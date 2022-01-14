export class Student1{
    stuID:number=123;
    stuName:string="Rishabh";
    stuClass:number=10
    
    
    constructor(i:number,n:string,c:number){
        this.stuID=i;
        this.stuName=n;
        this.stuClass=c;
    }
    display(){
        console.log(this.stuID);
        console.log(this.stuName);
        console.log(this.stuClass);
    }
    }
    
    var e1=new Student1(124,"Rahul",8);
    e1.display();