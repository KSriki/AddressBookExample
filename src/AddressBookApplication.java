
public class AddressBookApplication {
	public static void main(String[] args){
		//Note the class name is capitalized but the instance variable, ab, is not.
		AddressBook ab = new AddressBook();
		ab.setName("Bart Simpson");
		ab.setAddress("123 Evergreen St");
		ab.setCity("Evergreen");
		ab.setState("Kentucky");
		ab.setZip("12345");
		System.out.println("The phone number is: " + ab.getPhone());
		//bug with () and -
		ab.setPhone("(301) 324-5252");
		System.out.println("The phone number is: " + ab.getPhone());
		System.out.println("The email is: " + ab.getEmail());
		//bug with () and -
		ab.setEmail("john@smith.com");
		System.out.println("The email is: " + ab.getEmail());
		//When she wants to print the name she would call:
		String mailto = ab.mailLabel();
		System.out.println(mailto);
	}

}
