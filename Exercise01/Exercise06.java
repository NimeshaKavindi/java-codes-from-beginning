import java.util.Scanner;
public class Exercise06{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Celsius value :-");
        float x = sc.nextFloat();
        float y = ((9*x)/5) + 32;
        System.out.println("The Fahrenheit value is :-" + y);
        
    }
}