package data;
import java.util.Objects;

public class User {
	private int id;
	private String name;
	private String username;
	private String email;
	Address address;
	private String phone;
	private String website;
	Company company;
    public User() {
    }
    public User(int id, String name, String username, String email, String phone, String website) {
        this.id = id;
        this.name = name;
		this.username = username;
		this.email = email;
		this.phone = phone;
		this.website = website;
		
    }
    // getters and setters, toString() .... (omitted for brevity)
    public int getUserId() {return id;};
    public String getName() {return name;};
    public String getUsername() {return username;};
    public String getEmail() {return email;};
    public String getPhone() {return phone;};
    public String getWebsite() {return website;};
    
	@Override
	public int hashCode() {
		return Objects.hash(address, company, email, id, name, phone, username, website);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(address, other.address) && Objects.equals(company, other.company)
				&& Objects.equals(email, other.email) && id == other.id && Objects.equals(name, other.name)
				&& Objects.equals(phone, other.phone) && Objects.equals(username, other.username)
				&& Objects.equals(website, other.website);
	}
}

