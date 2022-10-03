import java.util.Scanner;
public class Exercise05{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first value:- ");
        int no1 = sc.nextInt();
        System.out.print("Enter the second value:- ");
        int no2 = sc.nextInt();
        System.out.print("Enter the third value:- ");
        int no3 = sc.nextInt();
        System.out.println("The result:");
        if(no1>no2){
            if(no1>no3){
                System.out.println("The maximum value is "+no1);
               if(no2>no3){
                System.out.println("The minimum value is "+no3);
               }
               else{
                System.out.println("The minimum value is "+no2);
               }

            }
            else{
                System.out.println("The maximum value is " +no3);
                System.out.println("The minimum value is "+no2);
                   
            }
        }
        else{
            if(no2>no3){
                System.out.println("The maximum value is "+no2);
                if(no3>no1){
                  System.out.println("The minimum value is "+no1);  
                }
                else{
                    System.out.println("The minimum value is "+no3);
                }
            }
            else{
                System.out.println("The maximum value is " +no3);
                System.out.println("The minimum value is "+no1);
             
            }
        }

    }
}