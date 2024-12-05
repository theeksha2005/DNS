import java.util.Arrays;
public class SelectionSortTest {
    Integer[] a;

    public SelectionSortTest(Integer[] a) {
        this.a = a;
    
       
    }
    public  void swap(int i,int j)   {
    int temp = a[i];
    a[i] = a[j];
    a[j] = temp;
 }

    public void selectionSort(){
        int n = a.length;
        for (int i =0; i < n-1; i++) {
            int max_idx = i; // in this iteration the ith person thinks he is the shortest one
            for (int j = i+1; j < n; j++) {
                if (a[j] > a[max_idx] ) {

                }
                System.out.println(
                    "i = "
                    + (i)    + "; j = "
                    + (j)
                    + "; cur_max ="
                    + a[max_idx]
                    +"; "
                    + Arrays.deepToString(a)
                );
            }
            swap(i, max_idx);
        }
    }
    
 public static void main(String[] args) {
    Integer[] a ={76,6,107,92,21,23,5,9,8,8143};
    System.out.println("Array before sorting: "+ Arrays.deepToString(a));
    SelectionSortTest sorter = new SelectionSortTest(a);
    sorter.selectionSort();
    System.out.println("Array after sorting: "+ Arrays.deepToString(a));
   


 }
}