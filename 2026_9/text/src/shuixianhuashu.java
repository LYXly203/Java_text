public class shuixianhuashu {
public static void main(String[] args) {
    int number;
    int sum = 0;
    for (int i = 100; i <= 999; i++) {
        number = i;
        int shui1 = number % 10;
        int shui2 = (number / 10) % 10;
        int shui3 = number / 100;
        if (number == (shui1 * shui1 * shui1 + shui2 * shui2 * shui2 + shui3 * shui3 * shui3)) {
            System.out.println(number + "是水仙花数");
            sum++;
        }
    }
    System.out.println("100-999之间水仙花数的个数为: " + sum);
}

}
