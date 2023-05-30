package day0530;

// 1. import
import java.util.Scanner;

/**
 * Scanner
 *
 * InputMisMatchException
 */
public class ScannerTest {
    public static void main(String[] args) {
        // 2. new
        Scanner scan = new Scanner(System.in);

        //3. using
        System.out.println("姓名：(String)");
        String name = scan.next();
        System.out.println(name);

        System.out.println("年龄：(int)");
        int age = scan.nextInt();
        System.out.println(age);

        System.out.println("体重：(double)");
        double weight = scan.nextDouble();
        System.out.println(weight);

        System.out.println("婚否？(boolean)");
        boolean maritalStatus = scan.nextBoolean();
        System.out.println(maritalStatus);

        // missing nextChar()
        System.out.println("性别：(男/女)");
        String gender = scan.next();
        char genderChar = gender.charAt(0);
        System.out.println(genderChar);
    }
}
