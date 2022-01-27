import React, {useState, useEffect} from 'react'
import { Link } from 'react-router-dom'

import TaskService from '../services/TaskService'
const ListTaskComponent = () => {

    const [tasks, setTasks] = useState([])

    useEffect(() => {

        getAllTasks();
    }, [])

    const getAllTasks = () => {
        TaskService.getAllTasks().then((response) => {
            setTasks(response.data)
            console.log(response.data);
        }).catch(error =>{
            console.log(error);
        })
    }

    const deleteTask = (taskId) => {
       TaskService.deleteTask(taskId).then((response) =>{
        getAllTasks();

       }).catch(error =>{
           console.log(error);
       })
        
    }

    return (
        <div className = "container">
            <h2 className = "text-center"> List Tasks </h2>
            <Link to = "/add-task" className = "btn btn-primary mb-2" > Add Task </Link>
            <table className="table table-bordered table-striped">
                
                <thead>
                <th >Task Id</th>
                    <th >Task Name</th>
                    <th >Description</th>
                    <th >Status</th>
                    <th>Priority</th>
                    <th >Notes</th>
                    <th >Bookmark</th>
                    <th >OwnerId</th>
                    <th >Creator ID</th>
                    <th>Created On</th>
                    <th>Modified On</th>
                    <th>Actions</th>
                </thead>
                <tbody>
                    {
                        tasks.map(
                            task =>
                            <tr key = {task.taskId}> 
                                <td> {task.taskId} </td>
                                <td> {task.taskname} </td>
                                <td>{task.description}</td>
                                <td>{task.status}</td>
                                <td>{task.priority}</td>
                                <td>{task.notes}</td>
                                <td>{task.isBookmarked}</td>
                                <td>{task.ownerId}</td>
                                <td>{task.creatorId}</td>
                                <td>{task.createdOn}</td>
                                <td>{task.modifiedOn}</td>

                                <td>
                                    <Link className="btn btn-info" to={`/edit-employee/${task.taskId}`} >Update</Link>
                                    <button className = "btn btn-danger" onClick = {() => deleteTask(task.taskId)}
                                    style = {{marginLeft:"10px"}}> Delete</button>
                                </td>
                            </tr>
                        )
                    }
                </tbody>
            </table>
        </div>
    )
}

export default ListTaskComponent
