
public class AddressBookApplication {
	public static void main(String[] args){
		//Note the class name is capitalized but the instance variable, ab, is not.
		AddressBook ab = new AddressBook();
		ab.setName("Bart Simpson");
		ab.setAddress("123 Evergreen St");
		ab.setCity("Evergreen");
		ab.setState("Kentucky");
		ab.setZip("12345");
		//When she wants to print the name she would call:
		String mailto = ab.mailLabel();
		System.out.println(mailto);
	}

}
