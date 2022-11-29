package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int x=1;
        int y=1;
        while (printToInclusive>=x){
            y*=x;
            System.out.println(y);
            x++;
        }
    }

    public static void main(String[] args) {
        FactorialNumbers numbers=new FactorialNumbers();
        numbers.printFactorialRow(10);
    }
}
