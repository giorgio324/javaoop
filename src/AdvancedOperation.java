import java.util.Scanner;

public abstract class AdvancedOperation{
 private int z;

 public void assignValue(){
     Scanner scanner = new Scanner(System.in);
     this.z = scanner.nextInt();
 }

    public int getZ() {
        return z;
    }

    public abstract int product();
}
