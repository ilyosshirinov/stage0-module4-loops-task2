package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int multiplication = 1;
        int count = 1;
        while (multiplyByAndToInclusive > count) {
            if (multiplyByAndToInclusive % count == 0) {
                multiplication = multiplication * count;
            }
            count++;
            System.out.println(multiplication);
        }
    }

    public static void main(String[] args) {
        Multiplication multiplication = new Multiplication();
        multiplication.printMultiplied(10);
    }
}
