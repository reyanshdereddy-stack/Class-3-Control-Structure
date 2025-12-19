import java.util.Scanner;
class Activity1{
public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Write your name");
    String str = s.nextLine();
    System.out.println("The message is " +str);
    System.out.println("Write a whole number");
    int num = s.nextInt();
    System.out.println("The number is "+ num);
    System.out.println("Write a number with a decimal");
    float flt = s.nextFloat();
    System.out.println("The value is "+flt);
    s.close();
}
}
