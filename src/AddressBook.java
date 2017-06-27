/*
 * Simple Address Book Representation using OOP
 * Srikant Kumar Kalaputapu
 * June 27th, 2017
 */

public class AddressBook {

	private String name;
	private String address;
	private String city;
	private String state;
	private String zip;
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}
	public String getZip() {
		return zip;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setState(String state) {
		this.state = state;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String mailLabel(){
		String label = String.format("%s\n%s\n%s, %s %s", this.name,this.address, this.city,  this.state, this.zip);
		return label;
	}
	
}
