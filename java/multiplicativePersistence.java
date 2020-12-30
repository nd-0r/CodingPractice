public class MultiplicativePersistence {
    
    public static int multiplicativePersistence(int num) {

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

    public static int additivePersistence(int num) {

        int test = 0;
        boolean cont = true;
        int count = 1;
        
        if(num < 10) { return 0; }

        do {
        	
        	test = 0;
            while(num > 0) {
                test += (num % 10);
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

    public static void main(final String[] args) {

        System.out.println(multiplicativePersistence(5789));
        System.out.println(additivePersistence(5789));

    }
}