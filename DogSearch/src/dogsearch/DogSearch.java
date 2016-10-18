


package dogsearch;

/**
 *
 * @author Mason Salvas
 */
public class DogSearch 
{

 public static void main(String[] args) 
 {
    //This code will not compile correctly until you fix it.
    //
    //We are trying to count the number of times the word
    //dog appears in some input text, but we can't seem to
    //remember the appropriate method call in the String class,
    //and are not sure our approach will work.
    //task: Use the JDK documentation to help us finish the code,
    //then discuss the ambiguity in the problem description, and
    //reword it to remove the ambiguity in the space provided below.

    /*
     
    Reading the problem description, I was able to figure out where the problem was located in the code. 
    As the task suggests, the description was a bit ambiguous.  A few solutions to this could be that the problem description could be more specific.  
    Instead of saying “we are trying to count the number of times the word dog appears in some input text” 
    it should be more specific saying that we have a program that is searching for the word “dog” in a string called “input”.  
    The description should mention the method call that is giving them the problem, in this case it would be the function call “findWord”.  
    
    To Reword the problem description for clarity:
    We are having an issue with finding the String “dog” within the String variable “input”.  
    We are trying to use a method call “findWord” (a part of String) but there seems to be a syntax error.  
    There may also need to be some additions to the code when the correct method is implemented.  
    
    */
    
    
    
    String input = new String("The Dogman was no ordinary dog, nor man, but rather a peculiar dog-like man who barked like a dog, and panted like a dog, he even ate like a dog.  He owned a dog named Doglips, and interestingly enough, his favorite food was hotdogs.");
    System.out.println(input);
    int index = -1;             
    int count1 = 0;
    String findString = "dog";      //added string for what it is searching for.
    System.out.print("Counting dogs: ");
    do {
      index = input.indexOf(findString, index);     //syntax from the original was wrong.  Changed to indexOf and added a parameter
      if(index != -1) 
      {
        count1++;
        System.out.print(count1+" ");
        index += findString.length();       //used findString.length to correctly count the index.  Program would go infinitely without this line.
      }
    } while (index != -1);
    System.out.println("The word \"dog\" appears " + count1 + " times.");
  } 
}




