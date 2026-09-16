import java.util.Scanner;

public class oushu {
    public static void main(String[] args) {
        int number;
        int he = 0;
        for(int i = 1; i <= 100; i++){
            number = i;
            if(number % 2 != 0) {
                continue;
            }
            he+=number;
        }
        System.out.println("偶数之和为: " + he);
    }
}
