package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public static void printFactorialRow(int printToInclusive) {
        int factorialNumber = 1;
        int i = 0;
        while (i <= printToInclusive) {
            if (i == 0) {
                System.out.println(1);
                i++;
                continue;
            }
            factorialNumber *= i;
            System.out.println(factorialNumber);
            i++;
        }
    }

    public static void main(String[] args) {
        printFactorialRow(7);
    }
}
