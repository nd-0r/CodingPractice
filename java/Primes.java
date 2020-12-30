public class Primes {

    //Prime sieve –– REMEMBER THIS!!!

    /* Based off of the fact that 2 is a prime, and all multiples of a prime number cannot be primes,
    one can determine the prime numbers in a set by process of elimination.  Super cool. */

    public static int primeNumbers(int num) {

        int count = 0;
        boolean[] primes = new boolean[num];

        primes[0]=primes[1]=false;

        for(int i = 2; i < primes.length; i ++) { primes[i] = true; }

        for(int i = 2; i < primes.length; i ++) {
            if(primes[i] == true) {
                count ++;
                for(int j = 1; j*i < primes.length; j ++) {
                    primes[j*i] = false; 
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(primeNumbers(10));
        System.out.println(primeNumbers(20));
        System.out.println(primeNumbers(30));
    }

}