package day22_MultiDimensionalArrays;

public class IteratingMultidimensionalArray2 {
    public static void main(String[] args) {
        int[][] arr2D = {{1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10, 11, 12}};
        for (int i = arr2D.length - 1; i >= 0; i--) {
            for (int j : arr2D[i]) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("-------------------------------------------");
        for (int[] i : arr2D) {
            for (int i1 = i.length - 1; i1 >= 0; i1--) {
                System.out.print(i[i1] + " ");
            }
            System.out.println();
        }
        System.out.println("-------------------------------------------");
        for (int i = arr2D.length - 1; i >= 0; i--) {
            for (int i1 = arr2D[i].length - 1; i1 >= 0; i1--) {
                System.out.print(arr2D[i][i1] + " ");
            }
            System.out.println();
        }
    }
}
