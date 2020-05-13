import java.util.Arrays;

public class Equals {

    public static <T> void equalsFun(T[] a, T[] b) {
        return;
    }

    public static void main(String[] args) {
        Integer[][] a = new Integer[2][];
        Integer[][] b = new Integer[2][];

        equalsFun(a, b);// 证明了T也可以是数组
        // Arrays.fill();
    }

}
