
package my.sortingalgorithms.java;


public class InsertionSort {
    
    public static void main (String[] args) {
        int arr[] = {13, 9, 21, 1, 6, 28, 29, 83, 24, 58};
        
        for (int i = 1; i <arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        
        System.out.print("Sorted Array using insertion sort:");
        
        for (int i = 0; i <arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        
    }    
    
}
