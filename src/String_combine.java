import java.util.Scanner;
public class String_combine {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter any two string:");
        String s1= obj.nextLine();
        String s2= obj.nextLine();
        String s3= s1+s2;
        System.out.println("Combine two string:");
        System.out.println(s3);
    }
}
