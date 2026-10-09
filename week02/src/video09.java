public class video09 {
    public static void main(String[] args) {
        // problem 1
        for (int i = 100; i >= 0; i = i - 1) {
            System.out.println(i);
        }
        // problem 2
        int sum = 0;
        for (int j = 30; j <= 120; j++) {
            if (j % 3 == 0 && j % 5 == 0) {
                sum = sum + j;
            }
        }
        System.out.println("sum is :" + sum);
    }
}
