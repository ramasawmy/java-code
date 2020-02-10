/**
 * 
 */

/**
 * @author Dell
 *
 */
public class Sort {
	
	void selectionSort(int array [] ) {
	
		int n = array.length;
	
	    int i ;
	    int j ;
	
	for (i= 0 ; i<(n-1); i++)
	{int index = i ;
	
	for (j=i +1 ;j<n ; j++  ) {
	  if (array[j] < array[index]) {
		  index = j;
	  }
}
	  
	int x = array[index];
	array[index]= array[i];
	array[i]= x;}		
}
	
    void printselectionSort(int array[]) {
    
    	int n = array.length;
    
    	int i;
    
    	for (i = 0 ; i<n ; ++i)
    {
	System.out.print(array[i] + " ");

    }

    System.out.println();
    }
    
    void insertionSort(int array[]) 
    { 
    int n = array.length; 
    for (int i = 1; i < n; ++i) 
    { 
    int key = array[i]; 
    int j = i - 1; 

    while (j >= 0 && array[j] > key) { 
        array[j + 1] = array[j]; 
        j = j - 1; 
    } 
    array[j + 1] = key; 
    } 
   }   
    
    
    void printinsertionSort(int array[]) 
    {
    int n = array.length ;
    for (int i = 0; i < n; ++i)
    {
    System.out.print(array[i] + " "); 
    }

    System.out.println(); 
    }

    void bubbleSort(int array[], int n) 
    { 	
    int i, j, temp; 
    boolean swapped; 
    for (i = 0; i < n - 1; i++)  
    { 
    swapped = false; 
    for (j = 0; j < n - i - 1; j++)  
    { 
        if (array[j] > array[j + 1])  
        { 
            temp = array[j]; 
            array[j] = array[j + 1]; 
            array[j + 1] = temp; 
            swapped = true; 
        } 
    } 


    if (swapped == false) 
        break; 
    }  
    }  

    void printbubbleSort(int arr[], int n) 
    { 
    int i; 
    for (i = 0; i < n; i++) 
    System.out.print(arr[i] + " "); 
    System.out.println(); 
    } 

    int partition(int array[], int low, int high )
    {        

    int pivot = array[high];  
    int i = (low-1);  
    for (int j=low; j<high; j++) 
    { 
   
    if (array[j] <= pivot) 
    { 
        i++; 

        
        int temp = array[i]; 
        array[i] = array[j]; 
        array[j] = temp; 
    }  
    }   


   int temp = array[i+1]; 
   array[i+1] = array[high]; 
   array[high] = temp; 

   return i+1; 
} 



   void quickSort(int array[], int low, int high) 
   { 

   if (low < high) 
   { 
    
   int pi = partition (array, low ,high) ;
   
    
   quickSort(array, low, pi-1); 
   quickSort(array, pi+1, high); 
   } 
   } 


  void printArray(int[]array) 
  { 
  int n = array.length; 
  for (int i=0; i<n; ++i) 
  System.out.print(array[i]+" "); 
  System.out.println(); 
  } 

 }
