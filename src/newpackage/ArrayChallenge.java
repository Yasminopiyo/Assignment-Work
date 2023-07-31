
package newpackage;

/**
 *
 * @author Admin
 */
public class ArrayChallenge {
    public static void main(String[] args) {
        String[] orderIds = {"B123", "C234", "A345", "C15", "B177", "G3003", "C235", "B179"};

        for (String orderId : orderIds) {
            if (orderId.startsWith("B")) {
                System.out.println(orderId);
            }
        }
    }
}
 

