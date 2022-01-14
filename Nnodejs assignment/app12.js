// JavaScript source code
const express=require('express');
const app=express();
const members=[
	{
		id:1,
		name:'Priyanka',
		email:'priya@gmail.com',
		status:'active'
	},
	{
		id:2,
		name:'Priy',
		email:'priyas@gmail.com',
		status:'active'
	},
	{
		id:1,
		name:'anka',
		email:'priya@gmail.com',
		status:'active'
	},

];
app.get(`/api/members`,(req,res)=>{
	res.json(members);

});
const PORT=process.env.PORT||5050;
app.listen(PORT,()=>console.log(`server started`));