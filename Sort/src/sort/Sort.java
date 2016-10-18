



package sort;

/**
 *
 * @author Mason Salvas
 */
public class Sort {

  public static void main(String[] args) {
    //This code will sort the numbers in the array.
    //task: Modify the algorithm to reverse the sort, then comment on its
    //efficiency in the space provided below:
    /*
    
    I tried to keep to the original algorithm, except changing the sort to start from least to greatest.  
    This means that it still is not very optimized.  Using big O notation, it would be considered O(n^2).  
    This is due to that there is a for loop nested in another for loop.  At the worst case scenario, it would have to loop through the entire array.  
    Since there are two for loops it would have to do this process each time.          

    */

    //fill the array with random numbers
    int[] unsorted = new int[100];
    for(int i = 0; i < 100; i++) {
      unsorted[i] = (int) (Math.random() * 100);
    }

    System.out.println("Here are the unsorted numbers:");
    for(int i = 0; i < 100; i++) {
      System.out.print(unsorted[i] + " ");
    }
    System.out.println();

    int[] sorted = new int[100];
    for(int i = 0; i < 100; i++)        //length of the array is 100
    {
      int low = 101;             //changed from hi to low  changed from -1 to 101
      int lowIndex = 101;        //changed from hi to low  changed from -1 to 101
      for(int j = 0; j < 100; j++) 
      {
        if(unsorted[j] < low)   //changed less than to a greater than
        {
          low = unsorted[j];
          lowIndex = j;
        }
      }
      sorted[i] = low;
      unsorted[lowIndex] = 101;      //changed from -1 to 101
    }
    System.out.println("Here are the sorted numbers: ");
    for(int i = 0; i < 100; i++) {
      System.out.print(sorted[i] + " ");
    }
    System.out.println();
    
    
    
  }//end main
}
