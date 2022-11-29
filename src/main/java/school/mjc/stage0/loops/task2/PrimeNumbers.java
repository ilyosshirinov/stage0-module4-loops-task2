package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        while (printToInclusive >= 0) {
            System.out.println(printToInclusive);
            printToInclusive--;
        }
    }

    public static void main(String[] args) {
        PrimeNumbers numbers = new PrimeNumbers();
        numbers.printPrimeNumbers(10);
    }
}
