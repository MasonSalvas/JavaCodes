


package primesimprovement;

/**
 *
 * @author Mason Salvas  
 * 
 */


//This code should print out the prime numbers.
//task: Fix and improve the algorithm
/*
I tried to keep to the similar formula that was given.  I added a method that would determine if the number was a prime or not.  
This method has a few improvements to the original design.  The first if statement covers numbers 0 – 1 saying that they will always be false.  
The second if statement covers even numbers.  With this if statement, it automatically eliminates any even number and will return false.  
The third if statement takes any of the odd possible prime numbers.  
This is still not as bad as the previous algorithm of finding the algorithm but this still does lead to a nested for loop in another nested for loop.  
The numbers that we are dealing with is minimal (0 – 100) so this method is still more optimal than the previous algorithm.

*/


public class PrimesImprovement {
    
public static boolean isPrime (int n)
{
    if (n < 2)
        return false;   //number can not be prime under 2
                
    if ((n > 2) && ((n % 2) == 0))
        return false;           //this if statement takes care of any even numbers above 2
    
    for (int i = 3; i * i <= n; i+=2)
    {
        if (n % i == 0)
            return false;       //this is for only odd factors, which only need to be tested up to n^1/2
    }
    
    return true;    //if it passes the above tests, it is prime
}
  public static void main(String[] args) {
 
    
    
    System.out.println("Printing primes from 1 to 100");
    int i;
    int j;  //variables used in for loops
    
    boolean[] prime = new boolean[100];     //changed to an array
    
    for(i = 0; i < 100; i++) 
    {
      prime[i] = true;  //initializes array
    }
      
      for(j = 0; j < 100; j++) 
      {
        prime[j] = isPrime(j);      //this sets the prime numbers to true and composite numbers to false
      } 
      
      for (int q = 0; q < 100; q++)
      {
        if(prime[q]) 
        {
          System.out.print(q + " ");
        }
      }
      
      System.out.println();
    }
    
  }


