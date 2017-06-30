/***********************
*@author: Val McCulloch*
*@date: July 2017      *
************************
*DESCRIPTION:          *
---------------------------------------------------------------------------
|In order to refamilarize myself with the primary sorting algorithms,     |
|I've built this custom library, which implements five of them: QuickSort,|
|InsertionSort, MergeSort, SelectionSort, and BubbleSort.                 |
|Along with the implementations I have provided basic descriptions and    |
|runtime analysis of each.                                                |
---------------------------------------------------------------------------
*INPUT TYPE: doubles   * 
*EXAMPLE CALL:         *
************************
*/

import java.util.Arrays;

public class Sort {
    //TEMP MAIN JUST FOR TESTING
    public static void main(String[] args){
	double[] test1 = {1.1, 4, 0, 2};
	double[] sList = select(test1);
	System.out.println(Arrays.toString(sList));
	

    }
    
    
    /**QUICK SORT
       ALGORITHM DESCRIPTION 
       AVERAGE RUNTIME: 
       BEST CASE RUNTIME: 
       WORST CASE RUNTIME:
     */
    public static void quick(){


    }
    
      
    /**ALGORITHM DESCRIPTION:
       AVERAGE RUNTIME: O(n^2)
       BEST CASE RUNTIME: O(n)
       WORST CASE RUNTIME: O(n^2)
     */
    public static double[] insert(double[] uList){
	int len = uList.length; //length 
        
	
	return 0.0;

    }
    
    /**ALGORITHM DESCRIPTION: in place sorting algirthm; not very efficient.
       Similiar to Insertion(). 
       AVERAGE RUNTIME: O(n^2)
       BEST RUNTIME: O(n^2)  
       WORST RUNTIME: O(n^2)  
     */
    public static double[] select(double[] uList){ 
	int len = uList.length; //length

	for (int i=0; i<len; i++){ 
	    int min = i; //set current min
	    for(int j=i; j<len; j++){
		if (uList[j]<uList[min]){//see if found greater min
		    min = j;
		}	    
	    }
	    if (uList[i]!=uList[min]){ //swap case
		double temp = uList[i];
		uList[i]=uList[min];
		uList[min]=temp;
		
	    }
	}
	return uList;

    }
    /**
     */
    public static void merge(){


    }
    /**
     */
    public static void bubble(){


    }





}