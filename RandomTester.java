import java.util.Random;
import java.util.ArrayList;

/**
 * Write a description of class RandomTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RandomTester
{
    // instance variables - replace the example below with your own
    private Random r; 
    private ArrayList<String> responses; 

    /**
     * Constructor for objects of class RandomTester
     */
    public RandomTester()
    {
        r = new Random(); 
        responses = new ArrayList<>(); 
        responses.add("yes"); 
        responses.add("maybe"); 
        responses.add("no"); 
    }
    
    public void printOneRandom()
    {
        System.out.println (r.nextInt(6)); 
    }
    
    public void printMultiRandom(int howMany)
    {
        int i = 0; 
        r = new Random(); 
        while (i < howMany) { 
            System.out.println(r.nextInt(6));
            i++;
        }
    }
    
    public int throwDice() 
    { 
      return r.nextInt(6)+1;   
    }
    
    public int throwDiceMod() 
    { 
      return Math.abs ((r.nextInt()%6))+1;   
    }
    
    public String getResponse() 
    {
        int index = r.nextInt(responses.size()); 
        return responses.get(index); 
    }
    
    public int getBelowMax(int max)
    {
        return r.nextInt(max)+1; 
    }
    
    public int getResultNumber(int max, int min)
    {
        int howMany = max - min +1; 
        return min+r.nextInt(howMany);
    }
}