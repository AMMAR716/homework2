import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double r,Area;
        System.out.println("enter the number:");
        r=in.nextFloat();
        double p=3.1459;
        System.out.println("perimeter="+2.0*(p*r));
        System.out.println("area="+p*(r*r));
    }
}
