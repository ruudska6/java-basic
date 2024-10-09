package static2.ex;

import static static2.ex.MathArrayUtils.average;
import static static2.ex.MathArrayUtils.max;
import static static2.ex.MathArrayUtils.min;
import static static2.ex.MathArrayUtils.sum;

public class MathArrayUtilsMain {
    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5};
        System.out.println("sum=" + sum(values));
        System.out.println("average=" + average(values));
        System.out.println("min=" + min(values));
        System.out.println("max=" + max(values));
        // MathArrayUtils mathArrayUtils = new MathArrayUtils(); // 이거 어떻게 막지? => 생성자를 private로 막아.
    }
}