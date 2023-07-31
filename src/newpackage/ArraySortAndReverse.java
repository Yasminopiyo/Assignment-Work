
package newpackage;

import java.util.Arrays;
import java.util.Collections;
public class ArraySortAndReverse {

    public static void main(String[] args) {
        String[] pallets = {"B14", "A11", "B12", "A13"};
        System.out.println("Sorted ....");
        Arrays.sort(pallets);
        for (String pallet : pallets) {
            System.out.println("--" + pallet);
        }

        System.out.println("Reverse ....");
        Collections.reverse(Arrays.asList(pallets));
        for (String pallet : pallets) {
            System.out.println("--" + pallet);
        }
    }
}


