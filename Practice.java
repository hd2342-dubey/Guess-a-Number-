import java.util.Scanner;

public class Practice {

  public static void main(String[] args)
         {
            Scanner sc = new Scanner(System.in);

            int MyNumber = (int)(Math.random()*100);

            int user;

            do{
              System.out.println("Guess a Number (1-100) : ");
              user = sc.nextInt();

              if(user == MyNumber){
                System.out.println("Woo .... Correct Number");
                break;
              }
              else if(user > MyNumber){
                System.out.println("Oops numbr is Larger");
              }
              else{
                System.out.println("The number is Smaller");
              }
            }while(user >= 0);

            System.out.println("My number was : " + MyNumber);
         }
}
