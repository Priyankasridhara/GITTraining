function getArray12<T>(items:T[]):T[]{
return new Array<T>().concat(items);
}
let myNumArr12=getArray12<number>([100,200,300]);
let myStrArr12=getArray12<number>(["Hello", "world"]);
myNumArr12.push(400);
MyStrArr12.push("Hello TupeScript");
//myNumArr12.push("hi");
//myStrArr12.push(400);
console.log(myNumArr12);
console.log(myStrArr12);
