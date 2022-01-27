import React, {useState, useEffect} from 'react'
import {Link, useHistory, useParams } from 'react-router-dom';

import TaskService from '../services/TaskService'
const AddTaskComponent = () => {

    const [taskId, setTaskId] = useState('')
    const [taskname, setTaskName] = useState('')
    const [description, setDescription] = useState('')
    const history = useHistory();
    const {id} = useParams();

    const saveOrUpdateTask = (e) => {
        e.preventDefault();

        const task = {taskId, taskname, description}

        if(id){
            TaskService.updateTask(id, task).then((_response) => {
                history.push('/tasks')
            }).catch(error => {
                console.log(error)
            })

        }else{
            TaskService.createTask(task).then((response) =>{

                console.log(response.data)
    
                history.push('/tasks');
    
            }).catch(error => {
                console.log(error)
            })
        }
        
    }

    useEffect(() => {

        TaskService.getTaskById(id).then((response) =>{
           setTaskId(response.data.taskId)
            setTaskName(response.data.taskname)
            setDescription(response.data.description)
        }).catch(error => {
            console.log(error)
        })
    }, [])

    const title = () => {

        if(id){
            return <h2 className = "text-center">UpdateTask</h2>
        }else{
            return <h2 className = "text-center">Add Task</h2>
        }
    }

    return (
        <div>
           <br /><br />
           <div className = "container">
                <div className = "row">
                    <div className = "card col-md-6 offset-md-3 offset-md-3">
                       {
                           title()
                       }
                        <div className = "card-body">
                            <form>
                                <div className = "form-group mb-2">
                                    <label className = "form-label"> Task id :</label>
                                    <input
                                        type = "number"
                                        placeholder = "Enter task id"
                                        name = "taskid"
                                        className = "form-control"
                                        value = {taskId}
                                        onChange = {(e) => setTaskId(e.target.value)}
                                    >
                                    </input>
                                </div>

                                <div className = "form-group mb-2">
                                    <label className = "form-label"> Task Name :</label>
                                    <input
                                        type = "text"
                                        placeholder = "Enter task name"
                                        name = "taskName"
                                        className = "form-control"
                                        value = {taskname}
                                        onChange = {(e) => setTaskName(e.target.value)}
                                    >
                                    </input>
                                </div>

                                <div className = "form-group mb-2">
                                    <label className = "form-label"> Description :</label>
                                    <input
                                        type = "text"
                                        placeholder = "Enter desciption"
                                        name = "description"
                                        className = "form-control"
                                        value = {description}
                                        onChange = {(e) => setDescription(e.target.value)}
                                    >
                                    </input>
                                </div>

                                <button className = "btn btn-success" onClick = {(e) => saveOrUpdateTask(e)} >Submit </button>
                                <Link to="/tasks" className="btn btn-danger"> Cancel </Link>
                            </form>

                        </div>
                    </div>
                </div>

           </div>

        </div>
    )
}



export default AddTaskComponent
