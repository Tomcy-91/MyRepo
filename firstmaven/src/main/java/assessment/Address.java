package assessment;

public class Address {
	
	 String street;
     String city;
     String state;
   
    public Address(String street, String city, String state) {
        this.street = street;
        this.city = city;
        this.state = state;
       
    }

    public String getAddress() {
        return street + ", " + city + ", " + state + " - " ;
    }
}


