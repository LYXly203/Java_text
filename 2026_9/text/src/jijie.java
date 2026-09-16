import java.util.Scanner;
public class jijie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入月份：");
        int month = scanner.nextInt();
        String season;

        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "冬季";
                break;
            case 3:
            case 4:
            case 5:
                season = "春季";
                break;
            case 6:
            case 7:
            case 8:
                season = "夏季";
                break;
            case 9:
            case 10:
            case 11:
                season = "秋季";
                break;
            default:
                season = "不合法";
        }

        System.out.println(month + "月是" + season);
    }
}
