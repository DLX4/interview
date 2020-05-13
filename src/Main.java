public class Main {

    public int partition(int[] a, int lo, int hi) {
        int i = lo;
        int j = hi + 1;

        // 基准
        int v = a[lo];
        while (true) {
            while (less(a[++i], v)) {
                if (i == hi) {
                    break;
                }
            }

            while (less(v, a[--j])) {
                if (j == lo) {
                    break;
                }
            }

            if (i >= j) {
                break;
            }

            exchange(a, i, j);
        }

        exchange(a, lo, j);

        return j;
    }

    private void exchange(int[] a, int i, int j) {
        int temp = a[j];
        a[j] = a[i];
        a[i] = temp;
    }

    private boolean less(int a, int b) {
        return a < b;
    }


    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
