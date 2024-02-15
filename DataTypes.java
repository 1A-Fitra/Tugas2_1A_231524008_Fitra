import java.math.BigInteger;
import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger num[];

        int T = scanner.nextInt();

        num = new BigInteger[T];

        for (int i = 0; i < T; i++) {
           num[i] = scanner.nextBigInteger();
        }
        scanner.close();
        System.err.println("");
        for (int i = 0; i < T; i++) {
            if (num[i].compareTo((BigInteger.valueOf(Long.MAX_VALUE))) > 0) {
                System.out.println(num[i] + " can't be fitted anywhere.");
            } else {
                System.out.println(num[i] + " can be fitted in:");
                if (num[i].compareTo(BigInteger.valueOf(Byte.MIN_VALUE)) > 0 && num[i].compareTo(BigInteger.valueOf(Byte.MAX_VALUE)) < 0) 
                    System.out.println("* byte");
                if (num[i].compareTo(BigInteger.valueOf(Short.MIN_VALUE)) > 0 && num[i].compareTo(BigInteger.valueOf(Short.MAX_VALUE)) < 0) 
                    System.out.println("* short");
                if (num[i].compareTo(BigInteger.valueOf(Integer.MIN_VALUE)) > 0 && num[i].compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) < 0) 
                    System.out.println("* integer");
                if (num[i].compareTo(BigInteger.valueOf(Long.MIN_VALUE)) > 0 && num[i].compareTo(BigInteger.valueOf(Long.MAX_VALUE)) < 0) 
                    System.out.println("* long");
            }
        }
    }
}