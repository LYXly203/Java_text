import java.util.Scanner;

public class example {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("========== 图形打印程序 ==========");
            System.out.println("1. 打印圆形（自定义半径）");
            System.out.println("2. 打印正方形（自定义边长）");
            System.out.println("3. 退出");
            System.out.print("请选择图形类型：");

            int choice = scanner.nextInt();

            if (choice == 3) {
                System.out.println("已退出程序。");
                break;
            }

            switch (choice) {
                case 1:
                    System.out.print("请输入圆的半径：");
                    int radius = scanner.nextInt();
                    printCircle(radius);
                    break;
                case 2:
                    System.out.print("请输入正方形的边长：");
                    int side = scanner.nextInt();
                    printSquare(side);
                    break;
                default:
                    System.out.println("无效的选择，请重新输入！");
            }
            System.out.println();
        }

        scanner.close();
    }

    /**
     * 打印指定边长的正方形（每行每列用 * 号填充）
     */
    public static void printSquare(int side) {
        if (side <= 0) {
            System.out.println("边长必须为正整数！");
            return;
        }
        System.out.println("正方形（边长 " + side + "）：");
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /**
     * 打印指定半径的圆形
     * 原理：遍历每个字符位置，计算到圆心的距离，
     *       距离接近半径时打印 *，否则打印空格。
     *       由于控制台字符高约是宽的两倍，纵坐标按 0.5 缩放以保证圆不变形。
     */
    public static void printCircle(int radius) {
        if (radius <= 0) {
            System.out.println("半径必须为正整数！");
            return;
        }
        System.out.println("圆形（半径 " + radius + "）：");
        double r = radius;
        for (int y = -radius - 1; y <= radius + 1; y++) {
            for (int x = -radius - 1; x <= radius + 1; x++) {
                // 纵向缩放 0.5，补偿字符宽高比
                double dist = Math.sqrt(x * x + (y * 0.5) * (y * 0.5));
                if (Math.abs(dist - r) < 0.55) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
