import java.util.Scanner;
public class Exercise03{
    public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a value: ");
    int no = sc.nextInt();
    System.out.println("The result:");
    if((no%2)==0){
        System.out.println("The number "+ no + " is an even number");
    }
    else{
        System.out.println("The number "+ no + " is an odd number");
    }

    }
}