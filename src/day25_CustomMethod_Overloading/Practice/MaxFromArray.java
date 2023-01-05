package day25_CustomMethod_Overloading.Practice;

public class MaxFromArray {
    public static void main(String[] args) {
        /*
        Task 2:
	1. create a method that can return the max number from an integer array

	2. create a method that can return the max number from double array

	3. create a method that can return the max number from long array

	4. create a method that can return the max number from short array

	5. create a method that can return the max number from float array

	6. create a method that can return the max number from byte array

         */
        byte maximum1 = MaxNr(new byte[]{1,2,3}, new byte[]{4,5,6});
        System.out.println(maximum1);
        short maximum2 = MaxNr(new short[]{7,8,9},new short[]{10,11,12});
        System.out.println(maximum2);
        int maximum3 = MaxNr(new int[]{13,14,15,16}, new int[]{1,2,3,4});
        System.out.println(maximum3);
        long maximum4 = MaxNr(new long[]{5,6,7,8,9,10}, new long[]{17,18,19});
        System.out.println(maximum4);
        float maximum5 = MaxNr(new float[]{5, 9}, new float[]{0,1});
        System.out.println(maximum5);
        double maximum6 = MaxNr(new double[]{1.2,3.4}, new double[]{5.5, 1.2});
        System.out.println(maximum6);
    }
        public static byte MaxNr(byte[] arr1, byte[] arr2) {
        byte max = 0;
        for (byte a : arr1) {
            for (byte b : arr2) {
                if (a > b) {
                    max = a;
                } else {
                    max = b;
                }
            }
        }
        return max;
    }
        public static short MaxNr(short[] arr1, short[] arr2) {
            short max = 0;
            for (short a : arr1) {
                for (short b : arr2) {
                    if (a > b) {
                        max = a;
                    } else {
                        max = b;
                    }
                }
            }
            return max;
        }
        public static int MaxNr(int[] arr1, int[] arr2) {
            int max = 0;
            for (int a : arr1) {
                for (int b : arr2) {
                    if (a > b) {
                        max = a;
                    } else {
                        max = b;
                    }
                }
            }
            return max;
        }
        public static long MaxNr(long[] arr1, long[] arr2) {
            long max = 0;
            for (long a : arr1) {
                for (long b : arr2) {
                    if (a > b) {
                        max = a;
                    } else {
                        max = b;
                    }
                }
            }
            return max;
        }
        public static float MaxNr(float[] arr1, float[] arr2) {
            float max = 0;
            for (float a : arr1) {
                for (float b : arr2) {
                    if (a > b) {
                        max = a;
                    } else {
                        max = b;
                    }
                }
            }
            return max;
        }
        public static double MaxNr(double[] arr1, double[] arr2){
        double max = 0;
        for (double a : arr1) {
            for (double b : arr2) {
                if(a>b){
                    max=a;
                }else{
                    max=b;
                }
            }
        } return max;
    }
}
