package oopsassignment2;

class Address{
 private String addressLine;
 private String city;
 
public Address(String addressLine, String city) {
	super();
	this.addressLine = addressLine;
	this.city = city;
     }


public String getAddressLine() {
	return addressLine;
}
public void setAddressLine(String addressLine) {
	this.addressLine = addressLine;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
String getAddressDetails()
{
	return "1st main HSR Layout,Banglore";
}
}
class Customer {
       String customerName;
	    Address address;
		public Customer() {
			super();
		}
		public Customer(String customerName, Address address) {
			super();
			this.customerName = customerName;
			this.address = address;
		}
		public String getCustomerName() {
			return "Yashodha";
		}
		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}
		public Address getAddress() {
			return address;
		}
		public void setAddress(String string) {
			this.address = address;
		}
	    
		String getCustomerDetails() {
			return "Barakotri road, Dharwad ";
		}
}
public class AggregationEncapsulationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c=new Customer();
		
		System.out.println("Customer name is: "+c.getCustomerName());
		System.out.println("Customer residential address is: "+c.getCustomerDetails());
	}

}
