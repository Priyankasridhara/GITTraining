import axios from 'axios';

const Task_BASE_REST_API_URL = 'http://localhost:8080/restgetalltask';
const Tas_BASE_REST_API_URL = 'http://localhost:8080/restaddtaskm';

class TaskService{

    getAllTasks(){
        return axios.get(Task_BASE_REST_API_URL);
    }

    createTask(task){
        return axios.post(Tas_BASE_REST_API_URL, task);
    }

    getTaskById(taskId){
        return axios.get(Task_BASE_REST_API_URL + '/' + taskId);
    }

    updateTask(taskId, task){
        return axios.put(Task_BASE_REST_API_URL + '/' +taskId,task);
    }

    deleteEmployee(taskId){
        return axios.delete(Task_BASE_REST_API_URL + '/' + taskId);
    }
}

export default new TaskService();