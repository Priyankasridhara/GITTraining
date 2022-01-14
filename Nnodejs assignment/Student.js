// JavaScript source code
class Student{
	constructor(name,rollno){
		this.name=name;
		this.rollno=rollno;
	}
	greeting(){
		console.log(`My name is ${this.name} and I am ${this.rollno}`);
	}

}
module.exports=Student;