package data;
import java.util.Objects;

//-------------- Nested Address-->Geo --------------//
public class Geo {
	private float lat;
	private float lng;
    public Geo() {
    }
    public Geo(float lat, float lng) {
        this.lat = lat;
        this.lng = lng;
    }
    // getters and setters, toString() .... (omitted for brevity)
    public float getLat() {return lat;};
    public float getLng() {return lng;};
	@Override
	public int hashCode() {
		return Objects.hash(lat, lng);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Geo other = (Geo) obj;
		return Float.floatToIntBits(lat) == Float.floatToIntBits(other.lat)
				&& Float.floatToIntBits(lng) == Float.floatToIntBits(other.lng);
	}
}
