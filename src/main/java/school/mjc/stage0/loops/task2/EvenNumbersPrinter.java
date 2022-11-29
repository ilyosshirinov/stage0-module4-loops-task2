package school.mjc.stage0.loops.task2;

public class EvenNumbersPrinter {
    public void printEvenNumbers(int printTillInclusive) {
        int count = 0;
        int x = printTillInclusive;
        while (count <= x) {
            if (printTillInclusive % 2 == 0) {
                System.out.println(printTillInclusive);
            }
            printTillInclusive--;
            count++;
        }
    }

    public static void main(String[] args) {
        EvenNumbersPrinter printer = new EvenNumbersPrinter();
        printer.printEvenNumbers(10);
    }
}
