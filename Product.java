
public class Product {

	public static void main(String args[]) {

		byte warrentyYears = 4;
		short productId = 7657;
		int quantity = 43244;
		long productCode = 7600007808l;
		float rating = 4.5f;
		double price = 45000.00;
		char is_available = 'Y';
		boolean is_active = true;
		
		String productName = "Laptop";
		String productCategory = "Electronics";
		String productBrand = "Dell";

		System.out.println("Product Id : " + productId);
		System.out.println("Product Name : " + productName);
		System.out.println("Product Brand : "+productBrand);
		System.out.println("Product Category : "+productCategory);
		System.out.println("Product Quantity : " + quantity);
		System.out.println("Product Price : "+price);
		System.out.println("Product Code : "+productCode);
		System.out.println("Product rating : "+rating);
		System.out.println("Product Warrenty Years : " + warrentyYears);
		System.out.println("Is Available : "+is_available);
		System.out.println("Is Active : " + is_active);
		
	}
}
