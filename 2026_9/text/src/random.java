import java.util.Random;
import java.util.Scanner;

public class random {
    public static void main(String[] args) {

        Random random = new Random();
        int target = random.nextInt(100);

        Scanner scanner = new Scanner(System.in);
        int guess;

        while (true) {
            System.out.print("请输入你猜的数字：");
            guess = scanner.nextInt();

            if (guess > target) {
                System.out.println("猜大了");
            } else if (guess < target) {
                System.out.println("猜小了");
            } else {
                System.out.println("猜对了！");
                break;
            }
        }


    }
}
