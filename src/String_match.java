import java.util.Scanner;
public class String_match {
    public static void main(String[] args) {
        int flag = 0;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter any string:");
        String s1 = obj.nextLine();
        System.out.println("Enter new string to compared with old string:");
        String s2 = obj.nextLine();
        if(s1.equals(s2))
        {
            System.out.println("Both strings are match successfully");
        }
        else {
            System.out.println("Both strings are different");
        }

    }
}
