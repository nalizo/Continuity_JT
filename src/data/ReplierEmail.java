package data;
import java.util.Objects;

public class ReplierEmail {
	private int userId;
	private int postId;
	private String email;
	
	public ReplierEmail() {
	}
	
    public ReplierEmail(int userId, int postId, String email) {
        this.userId = userId;
        this.postId = postId;
        this.email = email;
    }
    // getters and setters, toString() .... (omitted for brevity)
    public int getUserId() {return userId;};
    public int getPostId() {return postId;};
    public String getEmail() {return email;};
	@Override
	public int hashCode() {
		return Objects.hash(email, postId, userId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ReplierEmail other = (ReplierEmail) obj;
		return Objects.equals(email, other.email) && postId == other.postId && userId == other.userId;
	}
	
}
