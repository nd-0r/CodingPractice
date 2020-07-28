public class CarryingTheDigits {

    public static int carryDigits(int n1, int n2) {

        if(n1 == 0 || n2 == 0) { return 0; }
        
		int carry = ((n1 % 10) + (n2 % 10)) / 10;
        
        if(carry > 0) {
            return 1 + carryDigits((n1 / 10) + carry, n2 / 10);
        } else { 
            return carryDigits(n1 / 10, n2 / 10);
        }

    }

    public static void main(String[] args) {

        System.out.println(carryDigits(36, 135));

    }

}