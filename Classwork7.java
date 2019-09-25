import java.util.Scanner;
/**
 * Write a description of class Classwork7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Classwork7
{
    // instance variables - replace the example below with your own
    
    public static void main(String[] args)
    {
        //System.out.print(findSum(2, 3));
        System.out.print(canIDrink(17));
        //System.out.print(canIVote(17));
        Scanner.scan = new Scanner (System.in);
        
        System.out.println("How many points is your player projetced?");
         double points = scan.nextDouble(); 
         System.out.println(projection(points));
         System.out.println("Do you want to start him?");
         //was going to be a yes or no and then confirm if > or < 15
         
         
         
    }
    public static double findSum(int a, int b)
    {
        return a + b;
    }
  
   /*public static String canIVote(int age)
   {
       if (age >= 18)
       return "You can vote!";
       else 
       return "You cant vote";
    }
    */
  public static String canIDrink(int age)
   {
       if (age >= 21)
       return "You can drink!";
       else 
       return "dont tell anyone";
   


    }
}

