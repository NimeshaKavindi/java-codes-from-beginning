import java.util.Scanner;
public class Exercise02{
    public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the first value: ");
    int no1 = sc.nextInt();
    System.out.print("Enter the second value: ");
    int no2 = sc.nextInt();
    System.out.println("The result:");
    if(no1>no2){
        System.out.println("The maximum value is :"+ no1);
        System.out.println("The minimum value is :"+ no2);
    }
    else{
        System.out.println("The maximum value is :"+ no2);
        System.out.println("The minimum value is :"+ no2);
    }
    System.out.println("The total value is :"+ (no1+no2));
    System.out.println("The average value is :"+ (no1+no2)/2);

    }
}