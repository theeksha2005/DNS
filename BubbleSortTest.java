public class BubbleSortTest {
    public static void main(String[] args) {
        
        BubbleSort sorter = new BubbleSort();
        
       
        int[] numbers = {8, 3, 1, 4, 5, 11, 7, 2, 17, 13};
        
        
        System.out.print("Array before sorting: ");
        printArray(numbers);
        
       
        sorter.bubbleSort(numbers);
        
        
        System.out.print("Array after sorting: ");
        printArray(numbers);
    }
    
    
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}


class BubbleSort {
    
    
    public void bubbleSort(int[] arr) {
        int n = arr.length;
        
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }
    
    
    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}