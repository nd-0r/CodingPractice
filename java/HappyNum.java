import java.util.*;

public class HappyNum {

    public static String happyAlgorithm(int num) {

        int count = 0;
        List<Integer> nums = new ArrayList<Integer>();
        int temp = 0;

        do {

            nums.add(num);
            temp = 0;

            while(num != 0) {

                temp += (int) Math.pow(num % 10, 2);
                num /= 10;

            }

            num = temp;
            count++;

        } while(num != 1 && ! (nums.contains(num)));

        if(num == 1) {

            return "HAPPY " + count;

        }

        return "SAD " + count;

    }

    public static void main(String[] args) {

        System.out.println(happyAlgorithm(139));
        System.out.println(happyAlgorithm(67));
        System.out.println(happyAlgorithm(1));
        System.out.println(happyAlgorithm(89));

    }

}