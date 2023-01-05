package day25_CustomMethod_Overloading.Practice;

public class MinFromArray {
    public static void main(String[] args) {
        byte minimum1 = MinNr(new byte[]{1, 2, 3}, new byte[]{4, 5, 6});
        System.out.println(minimum1);
        short minimum2 = MinNr(new short[]{7, 8, 9}, new short[]{10, 11, 12});
        System.out.println(minimum2);
        int minimum3 = MinNr(new int[]{13, 14, 15, 16}, new int[]{1, 2, 3, 4});
        System.out.println(minimum3);
        long minimum4 = MinNr(new long[]{5, 6, 7, 8, 9, 10}, new long[]{17, 18, 19});
        System.out.println(minimum4);
        float minimum5 = MinNr(new float[]{5, 9}, new float[]{0, 1});
        System.out.println(minimum5);
        double minimum6 = MinNr(new double[]{1.2, 3.4}, new double[]{5.5, 1.2});
        System.out.println(minimum6);
    }
    public static byte MinNr(byte[] arr1, byte[] arr2) {
        byte min = arr1[0];
        byte min2 = arr2[0];
        for (byte b : arr1) {
            if (b < min) {
                min = b;
            }
        }
        for (byte b : arr2) {
            if (b < min2) {
                min2 = b;

            }
        }if(min2<min){
            min=min2;
        }
        return min;
    }
    public static short MinNr(short[] arr1, short[] arr2) {
        short min = arr1[0];
        short min2 = arr2[0];
        for (short b : arr1) {
            if (b < min) {
                min = b;
            }
        }
        for (short b : arr2) {
            if (b < min2) {
                min2 = b;

            }
        }
        if(min2<min){
            min=min2;
        }
        return min;
    }
    public static int MinNr(int[] arr1, int[] arr2) {
        int min = arr1[0];
        int min2 = arr2[0];
        for (int b : arr1) {
            if (b < min) {
                min = b;
            }

        }
        for (int c : arr2) {
            if (c < min2) {
                min2 = c;
            }
        }
        if(min>min2){
            min=min2;
        }
        return min;
    }
    public static long MinNr(long[] arr1, long[] arr2) {
        long min = arr1[0];
        long min2 = arr2[0];
        for (long b : arr1) {
            if (b < min) {
                min = b;
            }
        }
        for (long b : arr2) {
            if (b < min2) {
                min2 = b;

            }
        } if(min2<min){
            min=min2;
        }
        return min;
    }
    public static float MinNr(float[] arr1, float[] arr2) {
        float min = arr1[0];
        float min2 = arr2[0];
        for (float b : arr1) {
            if (b < min) {
                min = b;
            }
        }
        for (float b : arr2) {
            if (b < min2) {
                min2 = b;

            }
        }if(min2<min){
            min=min2;
        }
        return min;
    }
    public static double MinNr(double[] arr1, double[] arr2) {
        double min = arr1[0];
        double min2 = arr2[0];
        for (double b : arr1) {
            if (b < min) {
                min = b;
            }
        }
        for (double b : arr2) {
            if (b < min2) {
                min2 = b;

            }
        }if(min2<min){
            min=min2;
        }
        return min;
    }

}

