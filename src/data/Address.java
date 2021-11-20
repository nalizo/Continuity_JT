package data;
import java.util.Objects;

//-------------- Nested user-->Address --------------//
public class Address {
	private String street;
	private String suite;
	private String city;
	private String zipcode;
	Geo geo;
    public Address() {
    }
    public Address(String street, String suite, String city, String zipcode) {
        this.street = street;
        this.suite = suite;
        this.city = city;
        this.zipcode = zipcode;
    }
    // getters and setters, toString() .... (omitted for brevity)
    public String getStreet() {return street;};
    public String getSuite() {return suite;};
    public String getCity() {return city;};
    public String getZipcode() {return zipcode;};
	@Override
	public int hashCode() {
		return Objects.hash(city, geo, street, suite, zipcode);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		return Objects.equals(city, other.city) && Objects.equals(geo, other.geo)
				&& Objects.equals(street, other.street) && Objects.equals(suite, other.suite)
				&& Objects.equals(zipcode, other.zipcode);
	}
}