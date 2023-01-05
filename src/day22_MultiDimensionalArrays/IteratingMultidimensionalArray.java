package day22_MultiDimensionalArrays;



public class IteratingMultidimensionalArray {
    public static void main(String[] args) {
        int[][] arr2D = {{1,2,3}, {4,5,6,7}, {8,9,10,11,12}};
        for (int[] ints : arr2D) {
          //  System.out.println(Arrays.toString(ints));
            for (int i : ints) {
                System.out.print(i +" ");
            }
            System.out.println();
        }
        System.out.println("--------------------------------------------");
    }
}
