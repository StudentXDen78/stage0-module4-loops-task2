package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int i = 2;
        while (i <= printToInclusive) {
            int a = 1;
            int isPrime = 0;
            while (a <= i) {
                if (i % a == 0) {
                    isPrime++;
                }
                a++;
            }

            if (isPrime == 2) System.out.println(i);
            i++;
        }
    }
}