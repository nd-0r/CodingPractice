public class MultiplicativePersistence {
    public static int bugger(int num) {

        int test = 1;
        boolean cont = true;
        int count = 1;
        
        if(num < 10) { return 0; }

        do {
        	
        	test = 1;
            while(num > 0) {
                test *= (num % 10);
                num /= 10;
            }
            if(test < 10) {
                cont = false;
            } else {
            	count++;
                num = test;
            }

        } while(cont);
        
        return count;

    }

    public static void main(String[] args) {

        System.out.println(bugger(39));

    }
}