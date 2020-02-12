
/**
 * Write a description of class FRQPractice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FRQPractice
{
//frog
    public boolean simulate()
{
 int position = 0;
 for (int count = 0; count < maxHops; count++)
 {
 position += hopDistance();
 if (position >= goalDistance)
 {
 return true;
 }
 else if (position < 0)
 {
 return false;
 }
 }
 return false;
}
//Part (b)


    public double runSimulations(int num)
{
 int countSuccess = 0;

 for (int count = 0; count < num; count++)
 {
 if(simulate())
 {
 countSuccess++;
 }
 }
 return (double)countSuccess / num;
} 
}
//queston 2 Word Pair
  