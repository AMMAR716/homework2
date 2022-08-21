import java.util.Scanner;

public class Q3 {


    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        float Area , Length ,Width;
        System.out.println("enter length:");
        Length=in.nextFloat();
        System.out.println("enter width:");
        Width=in.nextFloat();
        Area=Width*Length;
        System.out.println("Area ="+Area);
    }
}
