package ba.bitcamp.generics;

public class Address {
	private String address;
	
	public Address(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return address;
	}
}
