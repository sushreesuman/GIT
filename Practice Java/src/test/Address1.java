package test;

public class Address1 {
	private String city, state, country;
	
	public static int counter;

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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Address1(String cityName, String stateName, String coutry) {
		this.city = cityName;
		this.state = stateName;
		this.country = coutry;
		counter++;
	}
	
//	public Address1(String ... args){
//		for (String passedArg : args) {
//			System.out.println(passedArg);	
//		}
//		                 
//		
//		
//	}
}
