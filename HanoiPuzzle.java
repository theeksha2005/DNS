public class HanoiPuzzle {
    public static  void towerOfHanoi  ( char source_rod,char destination_rod, char auxilary_rod, int n) {
        if (n==1) {
            System.out.println("Move disk from "
            +source_rod
            + " to "
            + destination_rod);
} else{
towerOfHanoi(source_rod, auxilary_rod, destination_rod, n-1);
towerOfHanoi(source_rod, destination_rod, auxilary_rod, 1);
towerOfHanoi(auxilary_rod, destination_rod, source_rod, n-1);
}
     }

public static void main(String args[])
{
    int noOfDisks = 4;
    towerOfHanoi('A', 'B', 'C', noOfDisks);
}

}