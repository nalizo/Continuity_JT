package data;
import java.util.Objects;

public class Comment {
	private int postId;
	private int id;
	private String name;
	private String email;
	private String body;
    public Comment() {
    }
    public Comment(int postId, int id, String name, String email, String body) {
        this.postId = postId;
        this.id = id;
        this.name = name;
        this.email = email;
		this.body = body;
    }
    // getters and setters, toString() .... (omitted for brevity)
    public int getPostId() {return postId;};
    public int getId() {return id;};
    public String getName() {return name;};
    public String getEmail() {return email;};
    public String getBody() {return body;};
    
	@Override
	public int hashCode() {
		return Objects.hash(body, email, id, name, postId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Comment other = (Comment) obj;
		return Objects.equals(body, other.body) && Objects.equals(email, other.email) && id == other.id
				&& Objects.equals(name, other.name) && postId == other.postId;
	}
}