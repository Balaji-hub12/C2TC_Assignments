package EntityClassAssignment2;


	public class ProductDemo {

	    public static void main(String[] args) {
	        Product p1 = new Product("Laptop", 501, 44000.0);
	        Product p2 = new Product("Smartphone", 502, 28000.0);
	        Product p3 = new Product("Playstation", 503, 50000.0);
	        Product p4 = new Product("Airpods", 504, 2000.0);

	        System.out.println("Product Details:");
	        p1.displayProduct();
	        p2.displayProduct();
	        p3.displayProduct();
	        p4.displayProduct();
	    }
	}
