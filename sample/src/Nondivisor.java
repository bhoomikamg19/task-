import java.util.Scanner;

public class Nondivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        for(int i=1; i<=num;i++){
            if(num % i != 0){
                System.out.println("Non-Divisor of " + num + ": " + i);
            }
        }
    }
}
