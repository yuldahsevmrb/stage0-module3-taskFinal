package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int result = 0;
        int x = 100;
        while ( number > 0) {
            result += (number % 10 * x);
            x /= 10;
            number /= 10;
        }
        System.out.println(result);
    }
}
