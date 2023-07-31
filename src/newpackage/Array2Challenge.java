package newpackage;


  import java.util.Random;


public class Array2Challenge {
    public static void main(String[] args) {
        Random random = new Random();
        String[] orderIDs = new String[5];

        for (int i = 0; i < orderIDs.length; i++) {
            int prefixValue = random.nextInt(5) + 65;
            char prefix = (char) prefixValue;
            String suffix = String.format("%03d", random.nextInt(1000));

            orderIDs[i] = String.valueOf(prefix) + suffix;
        }

        for (String orderID : orderIDs) {
            System.out.println(orderID);
        }
    }
}


