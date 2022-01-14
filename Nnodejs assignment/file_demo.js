const fs= require(`fs`);
const { dirname } = require("path");
const path =require(`path`);

fs.mkdir(path.join(__dirname,`/tests`),{},function(err){
if(err)throw err;
console.log(``)    
})

fs.writeFile(path.join(__dirname,`/tests`,`/hello.txt`),
`My text fie contains`
,(err)=>{
    if(err)throw err;
    console.log(`file writeen to..`);
})

fs.readFile(path.join(__dirname,`/tests`,`hello.txt`),`utf8`,(err,data)=>{
if(err)throw err;
console.log(data);
});