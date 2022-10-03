import java.util.Scanner;
public class Exercise04{
    public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a value: ");
    int no = sc.nextInt();
    System.out.println("The result:");
    if(no>=0){
        System.out.println("The number "+ no + " is positive number");
    }
    else{
        System.out.println("The number "+ no + " is negative number");
    }

    }
}