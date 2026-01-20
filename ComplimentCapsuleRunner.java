import java.util.Scanner;

public class ComplimentCapsuleRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int button = scan.nextInt();
        
        ComplimentCapsule capsule = new ComplimentCapsule("Cafeteria");
        
        System.out.println(capsule.dispense(button));
        
        scan.close();
    }
}