package controller;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import data.Comment;
import data.ConstHolder;
import data.Post;
import data.ReplierEmail;
import data.User;
import network.SynchronicRestCalls;

public class UserFilterImpl implements UserFilter {


    private Gson gson;
    private SynchronicRestCalls restGet;
    
    ConstHolder constHolder = new ConstHolder();
    
    public UserFilterImpl(){
        gson = new Gson();
        restGet = new SynchronicRestCalls();
    }
    

	public List<ReplierEmail> emailReplierInPostComments() throws IOException {
		
		//get all users
		String jsonString = restGet.restGetByURL(constHolder.USER_URL);
		List<User> users = gson.fromJson(jsonString, new TypeToken<List<User>>() {}.getType());
		
		//create a class to hold the new data ( userID, postID, replies eMail )
		List<ReplierEmail> found = new ArrayList<ReplierEmail>();
        
        //loop on all users , their posts and the post comments
	    for(User user : users){
	    	List<Post> posts = gson.fromJson(restGet.restGetByURL(constHolder.USER_POST_URL+user.getUserId()), new TypeToken<List<Post>>() {}.getType());
	    	for(Post post : posts){
	    		List<Comment> comments = gson.fromJson(restGet.restGetByURL(constHolder.POST_COMMENT_URL+post.getId()), new TypeToken<List<Comment>>() {}.getType());
	    		for(Comment comment : comments){
	    			if(comments.size()>0)
	    				found.add(new ReplierEmail(user.getUserId(),post.getId(),comment.getEmail()));
	    		}
	    	}
	    }
		return found;
	}
	
}
