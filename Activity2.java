import java.util.Scanner;
class Activity2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = s.nextInt();
        if (num>10) {
            System.out.println("Yes I'm greater!"); 
        }
        else{
            System.out.println("No, sorry I feel bad");
            
        }

    }
}
