import java.util.Random;
import java.util.Scanner;

public class NumGenerator {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        int temp;
        if(a>b){
            temp=a;
            a = b;
            b = temp;
        }
        int interval = a - b;
        Random random = new Random();
        int evenAmount = 0;
        int evenSum = 0;
        for (int i=0; i<10; i++){
            int randomNum = random.nextInt(a, b);
            System.out.println("random number is: " + randomNum);
            if(randomNum % 2 == 0){
                evenAmount += 1;
                evenSum += randomNum;
            }

        }
    }
}
