export class Student{
    stuID:number=123;
    stuName:string="Rishabh";
    stuMarks:number=256
    
    
    constructor(i:number,n:string,m:number){
        this.stuID=i;
        this.stuName=n;
        this.stuMarks=m;
    }
    display(){
        console.log(this.stuID);
        console.log(this.stuName);
        console.log(this.stuMarks);
    }
    }
    
    var e1=new Student(124,"Rahul",345);
    e1.display();