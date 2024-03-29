import java.util.Scanner;
import java.lang.String;

public class Strings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String A = scanner.nextLine();
        String B = scanner.nextLine();

        scanner.close();
        System.out.println("");

        System.out.println(A.length() + B.length());
        if (A.compareTo(B) > 0)
            System.out.println("Yes");
        else if (A.compareTo(B) == 0)
            System.out.println("Equal");
        else
            System.out.println("No");
        
        System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1) 
                + " " + B.substring(0, 1).toUpperCase()
                + B.substring(1));
    }
}