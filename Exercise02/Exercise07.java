import java.util.Scanner;
public class Exercise07{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a value:");
        double bill = sc.nextDouble();
        System.out.println("The result:");
        double dis,fi;
        

       if(bill<2000){
            dis=0;
            fi=bill+dis;
          
        }
        else if((bill>2001.00)&&(bill<4000.00)){
             dis=(bill*0.3)/100;
             fi=bill+dis;
          
        }
         else if((bill>4001.00)&&(bill<6000.00)){
            dis=(bill*0.6)/100;
            fi=bill+dis;
           
        }
         else if((bill>6001.00)&&(bill<9000.00)){
             dis=(bill*0.9)/100;
             fi=bill+dis;
           
        }
         else {
             dis=(bill*1.2)/100;
             fi=bill+dis;
           
        }
       
    
        System.out.println("The new bill value is " + fi);
        System.out.println("The discount amount is "+ dis);
    }
}
