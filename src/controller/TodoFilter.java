package controller;
import java.io.IOException;
import java.util.List;
import data.Todo;

public interface TodoFilter {
	public List<Todo> uncompletedTasksSummeryForUsers() throws IOException;
	public List<Todo> uncompletedTasksOfUser(int userID) throws IOException;
}
