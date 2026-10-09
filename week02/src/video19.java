import java.util.Scanner;

public class video19 {
    public static void main(String[] args) {
        int x, y;
        System.out.println(" enter value of x and y:");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        sc.close();
        int r = add(x, y);
        System.out.println("outpuy : " + r);
    }

    static int add(int x, int y) {
        int result = x + y;
        return result;
    }

}
