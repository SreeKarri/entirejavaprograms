package mutable_Immutable;

public class Building_Dynamic_URL {

	public static void main(String[] args) {
	//Base URL of the website being tested
		String baseUrl="https://grotechminds.com/search";
		
		// Test data or parameters
		String searchQuery="laptop";
		String sortBy="price";
		String order="ascending";
		
		StringBuilder urlBuilder=new StringBuilder("https://grotechminds.com/search");
		urlBuilder.append("?query=");
		urlBuilder.append(searchQuery);
		urlBuilder.append("&sort=");
		urlBuilder.append(sortBy);
		urlBuilder.append("&order=");
		urlBuilder.append(order);
		String fullUrl= urlBuilder.toString();//convert stringBuilder to String to be used in Selenium
		System.out.println("Constructed URL: "+fullUrl);
		

	}

}
