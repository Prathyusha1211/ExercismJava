import java.lang.IllegalArgumentException;
import java.math.BigInteger;

class PrimeCalculator {

    int nth(int nth) {
        if(nth==0) throw new IllegalArgumentException();
        int count = 0;
        int i=2;
        while(true){
            if (isPrime(i)) count++;
            if(count == nth) break;
            else i++;
        }
        return i;
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    private boolean isPrime(int i) {
        int count = 0;
        for (int j = 2; j < i; j++) {
            if(i%j==0) count++;
        }
        if(count==0) return true;
        else return false;
    }

}
