package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        long fac = 1;
        while (printToInclusive > 0) {
            fac = fac * printToInclusive;
            printToInclusive--;
        }
        System.out.println(fac);
    }

    public static void main(String[] args) {
        FactorialNumbers numbers=new FactorialNumbers();
        numbers.printFactorialRow(10);
    }
}
