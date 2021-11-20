package data;
import java.util.Objects;

public class Post {
	private int userId;
	private int id;
	private String roles;
	private String body;
    public Post() {
    }
    public Post(int userId, int id, String roles, String body) {
        this.userId = userId;
        this.id = id;
        this.roles = roles;
        this.body = body;
    }
    // getters and setters, toString() .... (omitted for brevity)
    public int getUserId() {return userId;};
    public int getId() {return id;};
    public String getRoles() {return roles;};
    public String getBody() {return body;};
	@Override
	public int hashCode() {
		return Objects.hash(body, id, roles, userId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Post other = (Post) obj;
		return Objects.equals(body, other.body) && id == other.id && Objects.equals(roles, other.roles)
				&& Objects.equals(userId, other.userId);
	}
}
