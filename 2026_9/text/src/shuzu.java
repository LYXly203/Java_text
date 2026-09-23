import java.util.Scanner;

public class shuzu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        int m=input.nextInt();
        int a=input.nextInt();

        int[] arr = new int[ ]{n,m,a};


        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
