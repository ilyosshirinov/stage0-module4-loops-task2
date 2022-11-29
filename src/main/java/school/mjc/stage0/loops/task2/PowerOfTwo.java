package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        int daraja = 1;
        while (power >= 0) {
            daraja *= Math.pow(2, power);
            power--;
        }
        System.out.println(daraja);
    }

    public static void main(String[] args) {
        PowerOfTwo powerOfTwo = new PowerOfTwo();
        powerOfTwo.printPower(3);
    }
}
