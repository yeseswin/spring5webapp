package guru.springframework.spring5webapp.domain;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Publisher {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	
	private String name;
	private String line1;
	private String city;
	private String state;
	private String zip;
	
	@OneToMany
	@JoinColumn(name = "publisher_id")
	private Set<Book> books = new HashSet<>();
	
	
//	private Address address;
	public Publisher() {
		super();
	}
//	public Publisher(String name, Address address) {
//		super();
//		this.name = name;
//		this.address = address;
//	}
	
	
	
	public String getName() {
		return name;
	}
	public Publisher(String name, String line1, String city, String state, String zip) {
		super();
		this.name = name;
		this.line1 = line1;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	public Set<Book> getBooks() {
		return books;
	}



	public void setBooks(Set<Book> books) {
		this.books = books;
	}



	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getLine1() {
		return line1;
	}
	public void setLine1(String line1) {
		this.line1 = line1;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	//	public Address getAddress() {
//		return address;
//	}
//	public void setAddress(Address address) {
//		this.address = address;
//	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Publisher other = (Publisher) obj;
		return id == other.id;
	}
//	@Override
//	public String toString() {
//		return "Publisher [id=" + id + ", name=" + name + ", address=" + address + "]";
//	}
	



	@Override
	public String toString() {
		return "Publisher [id=" + id + ", name=" + name + ", line1=" + line1 + ", city=" + city + ", state=" + state
				+ ", zip=" + zip + "]";
	}	


}
