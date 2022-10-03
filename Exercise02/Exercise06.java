import java.util.Scanner;
public class Exercise06{
    public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a letter:- ");
   char le = sc.next().charAt(0);
    System.out.println("The result:");
    if(le=='a' || le=='e' || le=='i' || le=='O' || le=='u' || le=='A' || le=='E' || le=='I' || le=='O' || le=='U'){
        System.out.println("The letter '"+le+"' is a vowel letter");
    }
    else{
        System.out.println("The letter is '" + le + "' constant");
    }

    }
}
/*import java.util.Scanner;
public class Exercise06{
    Scanner sc = new Scanner();
    System.out.print("Enter the first value: ");
    char ch = sc.next().charAt(0);
    System.out.println("The result:"+le);
   /*if(le=='a' || le=='e' || le=='i' || le=='O' || le=='u' || le=='A' || le=='E' || le=='I' || le=='O' || le=='U'){
        System.out.println("The letter '"+le+"' is a vowel letter");
    }*/