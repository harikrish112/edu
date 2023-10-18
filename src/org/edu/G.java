package org.edu;

public class G {
	 public void greensOmr(String order, String type, int number) {
	        System.out.println("Order: " + order + ", Type: " + type + ", Number: " + number);
	    }

	    // Overloaded method greensOmr with type and number
	    public void greensOmr(String type, int number) {
	        System.out.println("Type: " + type + ", Number: " + number);
	    }

	    // Overloaded method greensOmr with order and type
	    public void greensOmr(String order, String type) {
	        System.out.println("Order: " + order + ", Type: " + type);
	    }

	    // Add more overloaded versions of greensOmr as needed
	

    public static void main(String[] args) {
        G greens = new G();

        // Call the overloaded greensOmr methods with different combinations of arguments
        greens.greensOmr("12345", "Online", 10);
        greens.greensOmr("In-Person", 5);
       greens.greensOmr("999", "online");
    
}
}
