package data;
import java.util.Objects;

//-------------- Nested user-->Company --------------//
public class Company {
	private String name;
	private String catchPhrase;
	private String bs;
    public Company() {
    }
    public Company(String name, String catchPhrase, String bs) {
        this.name = name;
        this.catchPhrase = catchPhrase;
        this.bs = bs;
    }
    // getters and setters, toString() .... (omitted for brevity)
    public String getName() {return name;};
    public String getCatchPhrase() {return catchPhrase;};
    public String getBs() {return bs;}
	@Override
	public int hashCode() {
		return Objects.hash(bs, catchPhrase, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Company other = (Company) obj;
		return Objects.equals(bs, other.bs) && Objects.equals(catchPhrase, other.catchPhrase)
				&& Objects.equals(name, other.name);
	};
}