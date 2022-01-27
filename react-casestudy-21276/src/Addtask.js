import React, { Component} from 'react';
import axios from 'axios';

class Addtask extends Component{
    constructor(props){
        super(props)

        this.state={
            ownerId:'',
            taskname:'',
            status:'',
            priority:'',
            description:''
            //body:''
        }
        this.changeHandler=this.changeHandler.bind(this);
        this.submitHandler=this.submitHandler.bind(this);
    }
    changeHandler(e){
        this.setState({[e.target.name]:e.target.value})
    }
    submitHandler(e){
        e.preventDefault()
        console.log(this.state)
        axios
        .post('http://localhost:8080/restaddtaskm',this.state)
        .then(response => {
            console.log(response)
        })
        .catch(error =>{
            console.log(error)
        })
    }
    render(){
        const {ownerId}=this.state
        const {taskname}=this.state
        const {status}=this.state
        const {priority}=this.state
        const {description}=this.state

        return(
            
            <div><h1>CREATE TASK</h1>
                <form onSubmit={this.submitHandler}>
                    <div>
                        Owner ID:
                        <input type="number"
                        name="ownerId"
                        value={ownerId}
                        onChange={this.changeHandler}
                        />
                    </div>
                    <div>
                        Task Name:
                        <input type="text"
                        name="taskName"
                        value={taskname}
                        onChange={this.changeHandler}
                        />
                    </div>
                    <div>
                        Status:
                        <input type="text"
                        name="status"
                        value={status}
                        onChange={this.changeHandler}
                        />
                    </div>
                    <div>
                        priority:
                        <input type="text"
                        name="priority"
                        value={priority}
                        onChange={this.changeHandler}
                        />
                    </div>
                    <div>
                        description:
                        <input type="text"
                        name="description"
                        value={description}
                        onChange={this.changeHandler}
                        />
                    </div>
                    <button type="submit">Submit</button><br></br>
                </form>
            </div>
        )
    }
}
export default Addtask