package data;
import java.util.Objects;

public class Photo {
    private int albumId;
    private int id;
    private String title;
    private String url;
    private String thumbnailUrl;
    public Photo() {
    }
    public Photo(int albumId, int id, String title, String url, String thumbnailUrl) {
        this.albumId = albumId;
        this.id = id;
        this.title = title;
        this.url = url;
		this.thumbnailUrl = thumbnailUrl;
    }
    // getters and setters, toString() .... (omitted for brevity)
    public int getAlbumID() {return albumId;};
    public int getID() {return id;};
    public String getTitle() {return title;};
    public String getUrl() {return url;};
    public String getThumbnailUrl() {return thumbnailUrl;};
	@Override
	public int hashCode() {
		return Objects.hash(albumId, id, thumbnailUrl, title, url);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Photo other = (Photo) obj;
		return albumId == other.albumId && id == other.id && Objects.equals(thumbnailUrl, other.thumbnailUrl)
				&& Objects.equals(title, other.title) && Objects.equals(url, other.url);
	}
}
