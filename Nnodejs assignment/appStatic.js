const express=require('express');

const app=express();

const path=require('path');

app.use(express.static(path.join(__dirname,`Public`)));
const port=process.env.port||4000;

app.listen(port,()=>console.log(`server started on port ${port}`));