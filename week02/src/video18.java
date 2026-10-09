public class video18 {
    public static void main(String[] args) {
        sayhi();
        int sum = getsum(10, 50);
        System.out.println("result:" + sum);
    }

    static int getsum(int x, int y) {
        int sum = x + y;
        return sum;
    }

    static void sayhi() {
        System.out.println("hi");
    }
}
