package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int n1 = 0;
        int n2 = 1;
        int n3;
        for (int i = 0; i < lastFibonacci; i++) {
            n3 = n1 + n2;
            System.out.println(n1);
            n1 = n2;
            n2 = n3;
        }
    }
}
