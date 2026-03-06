/**
 * 
 */
package feb_25_2026.class_object;
/**
 * 
 */
public class JavaApp {
	public static void execution() {
		Product product1 = new Product(1, "apsara", "Pencil", 29.99);
		System.out.println(product1.toString());
		Product product2 = new Product(1, "apsara", "Pencil", 29.99);
		System.out.println(product2);
		
		System.out.println(product1.equals(product2));
		
		System.out.println(product1.hashCode());
		System.out.println(product2.hashCode());
	}
}