// JavaScript source code
const express=require('express');
const app=express();
const members=require('./Members');
const logger=(req,res,next)=>{
	console.log(`${req.protocol}://${req.get('host')}${req.originalUrl}`)
next();
}
app.use(logger);
app.get('/api/members',(req,res)=>{
res.json(members);
});

const PORT=process.env.PORT||5050;
app.listen(PORT,()=>console.log('server started...'));