import java.util.Scanner;
public class Exercise05{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an item name :-");
        String name = sc.nextLine();
        System.out.print("Enter an item price :-");
        float price = sc.nextFloat();
        System.out.print("Enter the number of items :-");
        int n = sc.nextInt();
        double total = price*n;
        System.out.print("The total price of the " + name + "is " + total);
      
        
    }
}