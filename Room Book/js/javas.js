var p1button=document.getElementById("ext");
var b1=document.getElementById("sub");
var t=document.getElementById("total");
var acc="";
var room1=2000;
var room2 =2500;
var room3 =5000;
var room4 =4000;
var room5=6000;
var room6=10000;
var room7=20000;
var extra_bed=500;
total_price=0;

p1button.addEventListener("click", function(){
total_price=total+price+extra_bed;
p1button.classList.add("winner");
});

b1.addEventListener("click", function(){
total_price=total_price+extra_bed;
t.add(total_price)
alert(total_price)
});