// JavaScript source code

const EventEmitter=require('events');

//Create class

class MyEmitter extends EventEmitter{}

//Init object

const myEmitter=new myEmitter();

//Event Listener

myEmitter.on('event',()=>console.log('Event Fired'));

//init event

myEmitter.emit('event');

myEmitter.emit('event');

myEmitter.emit('event');
