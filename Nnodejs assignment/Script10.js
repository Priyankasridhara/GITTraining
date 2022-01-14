// JavaScript source code
const  http=require('http');
const path=require('path');
const fs=require('');
let contentType="text/html";

switch(extname){
	case".js";
	contentType="text/javascript";
	break;
case ".css":
contentType="text/css";
break;
case:".json":
contentType="application/json";
break;
case".jpg"
contentType="image/jpg";


}