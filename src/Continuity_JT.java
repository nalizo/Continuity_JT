import java.io.IOException;
import java.util.List;

import controller.TodoFilterImpl;
import controller.UserFilter;
import controller.AlbumFilter;
import controller.AlbumFilterImpl;
import controller.TodoFilter;
import controller.UserFilterImpl;
import data.Album;
import data.ReplierEmail;
import data.Todo;



public class Continuity_JT {
    public static void main(String[] args) throws IOException {
    		
    		//answer a
    		TodoFilter todofilter = new TodoFilterImpl();
    		List<Todo> todos = todofilter.uncompletedTasksSummeryForUsers();
    		todos.forEach(todo -> {
    		    System.out.println(todo.getID());
    		});   	
    	
    		//answer b
    		TodoFilter todofilterUnCompleted = new TodoFilterImpl();
    		List<Todo> todosUnCompleted = todofilterUnCompleted.uncompletedTasksOfUser(1);
    		todosUnCompleted.forEach(todoUnCompleted -> {
    		    System.out.println(todoUnCompleted.getID());
    		});       		
    		
    		//answer c
    		UserFilter userfilter = new UserFilterImpl();
    		List<ReplierEmail> comments = userfilter.emailReplierInPostComments();
    		comments.forEach(comment -> {
    		    System.out.println(comment.getPostId());
    		});

    		//answer d
    		AlbumFilter albumfilter = new AlbumFilterImpl();
    		List<Album> albums = albumfilter.usersWithPhotosThreshold(1, 40);
    		albums.forEach(album -> {
    		    System.out.println(album.getAlbumTitle());
    		});
    }
}

