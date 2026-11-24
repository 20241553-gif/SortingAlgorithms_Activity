
package my.sortingalgorithms.java;

public class BubbleSort {
    
    public static void main(String[] args) {
        int arr[] = {23, 53, 1, 5, 15, 63, 20, 31, 28, 10};
        
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j <arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp =arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        
        System.out.print("Sorted Array using bubble sort:");
        
        for (int i = 0; i< arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }  
}
