package classesWithAttribute;

public class Console {

	public static void main(String[] args) {
		Product product = new Product();
		Product product2 = new Product(2,"masa üstü");
		product.setName("laptop");
		product.setId(1);
		product.setDescription("asus strigs gameing laptop");
		product.setPrice(18000);
		product.setStockAmount(13);
		System.out.println(product.getDescription());
		System.out.println(product2.getId());
		System.out.println(product.getName());
		System.out.println(product.getStockAmount());
		System.out.println(product.getPrice());
	;
		
	}

}