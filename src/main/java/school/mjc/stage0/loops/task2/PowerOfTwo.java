package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        int poweredNumber = 2;
        int i = 0;
        while (i <= power) {
            if (i == 0) {
                System.out.println(1);
                i++;
                continue;
            }
            if (i == 1) {
                System.out.println(poweredNumber);
                i++;
                continue;
            }
            poweredNumber = poweredNumber * 2;
            System.out.println(poweredNumber);
            i++;
        }
    }
}