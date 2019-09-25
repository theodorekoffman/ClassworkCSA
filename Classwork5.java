import java.util.Scanner;
/**
 * Write a description of class Classwork5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Classwork5
{
   public static void main(String[] args)
  {
       //for (int i=0; i<1; i+=111)
       
           /**
           double dice1 = (int)(Math.random()*7)+1;
           double dice2 = (int)(Math.random()*7)+1;
           double randNum = dice1 + dice2;
         
           //double randNum2 = (int)(Math.random()*7);
           if (randNum == 3)
         System.out.println("You rolled a "+ randNum);
            else if (randNum == 5)
         System.out.println("bruh mode "+ randNum);
            else if (randNum == 11)
         System.out.println("hey number, "+ randNum);
         else
           //double randInt = randNum*10 
           System.out.println("You rolled a "+ randNum);
           */
          
          /**
          Scanner scan = new Scanner(System.in); 
          
          System.out.println("How many sides do you want your dice to have?");
          int diceNum = scan.nextInt(); 
          double diceFinal =0;
          
          if (diceNum >= 1)
            {diceFinal = (int)((Math.random()*diceNum)+1); }
          
          
            else
           { System.out.println("invalid entry");}
            
          
               System.out.println("You rolled a " + diceFinal);
           */
          //Accidentally delted the other problems. Sorry. Wont happen again. 
          Scanner scan = new Scanner(System.in); 
          
          System.out.println("What is your player projected in fantasy football?");
          double fantasyInput = scan.nextDouble(); 
          double finalScore =0;
          
          if (fantasyInput >= 1)
            {finalScore = (double)((Math.random()*3*fantasyInput)-1); }
          
          
            else
           { System.out.println("invalid entry");}
            
          
               System.out.println("Your player will actually score " + finalScore);
          
          
      
        
        }
    }

