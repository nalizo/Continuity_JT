package data;
import java.util.Objects;

public class Album {
    private int userId;
    private int id;
    private String title;
    public Album() {
    }
    public Album(int userId, int id, String title) {
        this.userId = userId;
        this.id = id;
        this.title = title;
    }
    // getters and setters, toString() .... (omitted for brevity)
    public int getUserID() {return userId;};
    public int getAlbumID() {return id;};
    public String getAlbumTitle() {return title;};
    
	@Override
	public int hashCode() {
		return Objects.hash(id, title, userId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Album other = (Album) obj;
		return id == other.id && Objects.equals(title, other.title) && userId == other.userId;
	}
}
