import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
	private String email;	
	private String phone;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		if(isEmailValid(email))
			this.email = email;
		
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		if(isPhoneNumberValid(phone))
			this.phone = phone;
	}
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
	
	private boolean isEmailValid(String email){  
        boolean isValid = false;  

        String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";  
        CharSequence inputStr = email;  
        //Make the comparison case-insensitive.  
        Pattern pattern = Pattern.compile(expression,Pattern.CASE_INSENSITIVE);  
        Matcher matcher = pattern.matcher(inputStr);  
        if(matcher.matches()){  
            isValid = true;  
        }  
        return isValid;  
    } 
    
    private boolean isPhoneNumberValid(String phoneNumber){  
        boolean isValid = false;  

        String expression = "^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$";  
        CharSequence inputStr = phoneNumber;  
        Pattern pattern = Pattern.compile(expression);  
        Matcher matcher = pattern.matcher(inputStr);  
        if(matcher.matches()){  
            isValid = true;  
        }  
        return isValid;  
    }  
	
}
