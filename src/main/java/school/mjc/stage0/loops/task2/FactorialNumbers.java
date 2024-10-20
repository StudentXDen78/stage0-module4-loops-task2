package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public  void printFactorialRow(int printToInclusive) {
        int factorialNumber = 1;
        int i = 1;
        while (i <= printToInclusive) {
            factorialNumber *= i;
            System.out.println(factorialNumber);
            i++;
        }
    }
}
