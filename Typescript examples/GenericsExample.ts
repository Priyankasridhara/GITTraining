function getArray(items:any[]):any[]{
return new array().concat(items);
}
let myNumArr=getArray([100,200,300]);
let myStrArr=getArray(["Helo","World"]);

//myNumArr.push("Hi");
myStrArr.push("Hi");
 
console.log(myNumArr);
console.log(myStrArr);