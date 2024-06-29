import java.util.Random;
import java.util.Scanner;

public class MathOperation extends AdvancedOperation {
    private int x;
    private int y;

    public MathOperation() {
        System.out.println("hello");
    }

    public void assignValues(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter X: ");
        this.x = scanner.nextInt();
        System.out.println("Enter Y: ");
        this.y = scanner.nextInt();
        System.out.println(x);
        System.out.println(y);
    }

    public void addRandomToX(){
        Random random = new Random();
        this.x += random.nextInt(100);
    }
    public void evenOrOdd(){
        if((this.x+this.y)% 2 == 0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }


    @Override
    public int product() {
        int z = getZ();
        return (x+y)*z;
    }
}
