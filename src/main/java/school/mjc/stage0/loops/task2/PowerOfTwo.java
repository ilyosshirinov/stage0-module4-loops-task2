package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        int x = 0;
        int y = 1;
        while (power >= x) {
            y *= Math.pow(2, x);
            System.out.println(y);
            x++;
            y = 1;
        }
    }

    public static void main(String[] args) {
        PowerOfTwo powerOfTwo = new PowerOfTwo();
        powerOfTwo.printPower(3);
    }
}
