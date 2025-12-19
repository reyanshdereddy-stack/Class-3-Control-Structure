import java.util.Scanner;
class Activity3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your percentage");
        int num = s.nextInt();
        if(num>=90){
            System.out.println("O");
        
        }
        else if(num<90 && num>=80){
            System.out.println("A+");

        }
        else if(num<80 && num>=70){
            System.out.println("A");
            
        }
        else if(num<70 && num>=60){
            System.out.println("B");
            
        }
       else{
        System.out.println("C");
       }
    }
}
