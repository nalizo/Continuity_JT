package data;
import java.util.Objects;

public class Todo {
	private int userId;
	private int id;
	private String title;
	private boolean completed;
    public Todo() {
    }
    public Todo(int userId, int id, String title, boolean completed) {
        this.userId = userId;
        this.id = id;
        this.title = title;
		this.completed = completed;
    }
    // getters and setters, toString() .... (omitted for brevity)
    public int getUserId() {return userId;};
    public int getID() {return id;};
    public String getTitle() {return title;};
    public boolean getCompleted() {return completed;};
    
	@Override
	public int hashCode() {
		return Objects.hash(completed, id, title, userId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Todo other = (Todo) obj;
		return completed == other.completed && id == other.id && Objects.equals(title, other.title)
				&& userId == other.userId;
	}
}