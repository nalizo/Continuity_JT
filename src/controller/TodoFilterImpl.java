package controller;
import java.io.IOException;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import data.ConstHolder;
import data.Todo;
import network.SynchronicRestCalls;

public class TodoFilterImpl implements TodoFilter {

    private Gson gson;
    private SynchronicRestCalls restGet;
    
    ConstHolder constHolder = new ConstHolder();
    
    public TodoFilterImpl(){
        gson = new Gson();
        restGet = new SynchronicRestCalls();
    }
    
	public List<Todo> uncompletedTasksSummeryForUsers() throws IOException {
				
		//get all todos
		String jsonString = restGet.restGetByURL(constHolder.TODO_URL);
        List<Todo> todos = gson.fromJson(jsonString, new TypeToken<List<Todo>>() {}.getType());
        
        //remove todos that are completed
        todos.removeIf(myList -> myList.getCompleted() == true);
        
		return todos;
	}
	
	public List<Todo> uncompletedTasksOfUser(int userID) throws IOException {
		
		//get all todos
		//gsonRestCalls restGet = new gsonRestCalls();
		String jsonString = restGet.restGetByURL(constHolder.TODO_OF_USER_URL + userID);
        List<Todo> todos = gson.fromJson(jsonString, new TypeToken<List<Todo>>() {}.getType());
        
        //remove todos that are completed
        todos.removeIf(myList -> myList.getCompleted() == true);
        
		return todos;
	}
}
