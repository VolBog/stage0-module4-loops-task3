package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int greatest = 1;

        for (int i = 1; i <= (Math.max(second, first)); i++) {
            if(first % i == 0 && second % i == 0) {
                greatest = i;
            }
        }
        System.out.println(greatest);
    }
}
