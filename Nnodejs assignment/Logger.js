
const EventEmitter=require('events');
class Logger extends EventEmitter{
log(msg){

this.emit('message',{msg});
}
}
module.exports=Logger;



