public class ConsecutiveNumbers {

    public static int[] sort(int[] arr) {

        for(int i = 0; i < arr.length; i ++) {
            for(int j = i; j > 0; j --) {
                if(arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                } else {
                    break;
                }
            }
        }

        return arr;

    }

    public static boolean cons(int[] arr) {
        
        if(arr == null || arr.length < 2) { return false; }

        int[] sorted = sort(arr);
        int last = sorted[0];

        for(int i = 1; i < sorted.length; i ++) {
            if(sorted[i] == last || sorted[i] != last + 1) {
                return false;
            }
            last = sorted[i];
        } 

        return true;

    }
    
    public static void main(String[] args) {

        System.out.println(cons())

    }

}