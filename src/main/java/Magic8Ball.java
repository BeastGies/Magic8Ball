import java.util.Random;
import java.util.Scanner;

public class Magic8Ball {
    public static void main(String[] args) {
        System.out.println("Ask the all knowing Magic 8 Ball anything.");
        Scanner scanner = new Scanner(System.in);
        String userQuestion = scanner.nextLine();
        int randomNumber = new Random().nextInt(4);
        if(randomNumber == 0){
            System.out.println("Yes.");
        } else if(randomNumber == 1){
            System.out.println("No.");
        } else if(randomNumber == 2){
            System.out.println("Maybe in another Universe ;).");
        } else {
            System.out.println("Hmm, this is tricky...ask again.");
        }
    }
}


