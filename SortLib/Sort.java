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
* Sort.func(unsorted)  *
************************
*/

import java.util.Arrays;

public class Sort {
    //TEMP MAIN JUST FOR TESTING
    public static void main(String[] args){
	double[] test1 = {1.1, 4, 0, 2};
	double[] sList = merge(test1);
	System.out.println(Arrays.toString(sList));
	

    }
    
    
    /**QUICK SORT
       ALGORITHM DESCRIPTION 
       AVERAGE RUNTIME: O(nlog(n))
       BEST CASE RUNTIME: O(nlog(n))
       WORST CASE RUNTIME: O(n^2)
     */
    public static void quick(double[] uList){
    	
    	return uList;
    }
    
      
    /**ALGORITHM DESCRIPTION: start at second index. compair i to i-1
       AVERAGE RUNTIME: O(n^2)
       BEST CASE RUNTIME: O(n)
       WORST CASE RUNTIME: O(n^2)
     */
    public static double[] insert(double[] uList){
	int len = uList.length; //length 
        for (int i = 1; i<len ; i++){  //start at second idx
	    int j = i; 
	    while(j>0 && uList[j-1]>uList[j]){ //end at when to start or conds. sat. 
		double temp = uList[j-1]; //swap
		uList[j-1] = uList[j];
		uList[j] = temp;
		j = j - 1; //decrease

	    }
	}
	
	return uList;

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
	return uList; //return sorted list

    }
    /**ALGORITHM DESCRIPTION:
       AVERAGE RUNTIME: O(nlog(n))
       BEST CASE RUNTIME: O(nlog(n))
       WORST CASE RUNTIME: O(nlog(n))
     */
    public static double[] merge(double[] uList){
	

	return double[] uList;
    }
    /**ALGORITHM DESCRIPTION:
       AVERAGE RUNTIME: O(n^2)
       BEST CASE RUNTIME: O(n)
       WORST CASE RUNTIME: O(n^2)
     */
    public static double[] bubble(double[] uList){
	int len = uList.length; //length
	for (int i=0; i<len; i++){
	    for (int j=1; j<len-i; j++){
		if (uList[j-1]>uList[j]){
		    double temp = uList[j-1];
		    uList[j-1]=uList[j];
		    uList[j]=temp;
		 }		
	    }
       }
	return uList; //return sorted list
    }
}