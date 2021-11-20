package data;

public class ConstHolder {
	
	private String BASE_URL = "https://jsonplaceholder.typicode.com/";
	
	public String ALBUM_URL = BASE_URL + "albums/";
	public String PHOTOS_BY_ALBUM_URL = BASE_URL + "photos/?albumId=";
	public String TODO_URL = BASE_URL + "todos/";
	public String TODO_OF_USER_URL = BASE_URL + "todos/?userId=";
	public String USER_URL = BASE_URL + "users";
	public String USER_POST_URL = BASE_URL + "posts/?userId=";
	public String POST_COMMENT_URL = BASE_URL + "comments/?postId=";
}
