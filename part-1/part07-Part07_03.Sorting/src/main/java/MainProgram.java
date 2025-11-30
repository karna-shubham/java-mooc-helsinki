import java.util.Arrays;
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        sort(array);
    }
    
    public static int smallest(int [] intArry){
        int min = intArry[0];
        for (int i : intArry){
            if (i<min) min = i;
        }
        return min;        
    }
    
    public static int indexOfSmallest(int[] intArry){
        int indx = 0;
        int small = smallest(intArry);
        for (int i : intArry){
            if (i == small) return indx;
            indx ++;
        }
        return indx;
        
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        // write your code here
        int smallest = table[startIndex];
        int smallIndx = startIndex;
        for(int i = startIndex+1; i < table.length; i++){
            if (table[i] < smallest){
                smallest = table[i];
                smallIndx = i;
            }
        }
        return smallIndx;
    }
    
    public static void swap (int [] arry, int ind1, int ind2){
        int temp = arry[ind1];
        arry[ind1] = arry[ind2];
        arry[ind2] = temp;
        
    }
    
    public static void sort(int[] array) {
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++){
            int smallIndx = indexOfSmallestFrom(array, i);
            swap(array, i, smallIndx);
            System.out.println(Arrays.toString(array));
        }
    }

}
