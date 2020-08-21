
public class DifferenceCipher {

    public static int[] encrypt(String str) {

    }

    public static String decrypt(int[] arr) {
        String out = "";
        int last = arr[0];
        for(int i: arr) {
            out += last;
            last = i;
        }
    }

    public static void main(String[] args) {
        int[] in = {72, 29, 7, 0, 3};
        System.out.println(decrypt(in));
    }

}