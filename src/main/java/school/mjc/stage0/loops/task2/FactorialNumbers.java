package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public  void printFactorialRow(int printToInclusive) {
        int factorialNumber = 1;
        int i = 0;
        while (i <= printToInclusive) {
            if (i == 1) System.out.println(1);
            factorialNumber *= i;
            System.out.println(factorialNumber);
            i++;
        }
    }
}
