
package newpackage;


public class StringChallenge {
     public static void main(String[] args) {
        String s = "The quick brown fox jumps over the lazy dog";
        String[] subs = s.split(" ");

        for (String sub : subs) {
            char[] value = sub.toCharArray();
            reverseArray(value);
            String result = new String(value);
            System.out.println(result);
        }
    }

    private static void reverseArray(char[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}  

