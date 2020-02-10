/**
 * 
 */

/**
 * @author Dell
 *
 */
public class AllSorting {
	
	void Selectionsort(int array[]) 
    { 
        int n = array.length; 
  
        
        for (int i = 0; i < n-1; i++) 
        { 
            
            int min_idx = i; 
            for (int j = i+1; j < n; j++) 
                if (array[j] < array[min_idx]) 
                    min_idx = j; 
  
             
            int temp = array[min_idx]; 
            array[min_idx] = array[i]; 
            array[i] = temp; 
        } 
    } 
	
	void printSelectionsort(int array[]) 
    { 
        int n = array.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(array[i]+" "); 
        System.out.println(); 
    } 
	
	void InsertionSort(int array[])
	{
		int n = array.length;
		for(int i = 1; i < n; ++i) {
			int key = array[i];
			int j=i-1;
			
			while (j >= 0  && array[j] > key) {
				array[ j + 1 ] = array[j];
				j = j - 1 ;
		}
			array[j+1]=key;
	  }
	
    }
	
	void printInsertionSort(int array[]) 
	{
		int n = array.length;
		for(int i = 0; i < n; ++i) {
			System.out.print(array[i] + " ");
        }
		
		System.out.println();
    }
	void BubbleSort(int array[]) 
    { 
        int n = array.length; 
        for (int i = 0; i < n-1; i++) 
            for (int j = 0; j < n-i-1; j++) 
                if (array[j] > array[j+1]) 
                { 
                    
                    int temp = array[j]; 
                    array[j] = array[j+1]; 
                    array[j+1] = temp; 
                } 
    } 
	
	void printBubbleSort(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    }  
	
	
	
	int partition(int array[], int low, int high) 
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
  
    
    void QuickSort(int array[], int low, int high) 
    { 
        if (low < high) 
        { 
            
            int pi = partition(array, low, high); 
  
            
            QuickSort(array, low, pi-1); 
            QuickSort(array, pi+1, high); 
        } 
    } 
	
    static void QuickSort(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    } 
	
    
    /*continue*/

}
