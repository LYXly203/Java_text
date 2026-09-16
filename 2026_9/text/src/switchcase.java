import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        int grade;
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入成绩（0-100）：");
        grade = scanner.nextInt();
        switch (grade / 10) {
            case 9:
                System.out.println("优秀");
                break;
            case 8:
                System.out.println("良好");
                break;
            case 7:
                System.out.println("中等");
                break;
            case 6:
                System.out.println("及格");
                break;
            case 5:
            case 4:
            case 3:
            case 2:
            case 1:
            case 0:
                System.out.println("不及格");
                break;

            default:
                System.out.println("不合法");
                break;
        }
    }
}
