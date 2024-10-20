package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        byte sign = (byte)Math.signum(multiplyByAndToInclusive);
        int i = 0;
        while (i <= (multiplyByAndToInclusive * sign)) {
            System.out.println(multiplyByAndToInclusive * i);
            i++;
        }
    }
}