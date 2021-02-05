package basic_class_01;

import java.util.Arrays;

//冒泡排序
public class BubbleSort {
    public static void BubbleSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int end = arr.length - 1; end > 0; end--) {
            for (int i = 0; i < end; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                }
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    //for test
    public static void rightMathod(int[] arr) {
        Arrays.sort(arr);
    }



    public static int[] generateRandomArray(int size, int value) {
        //生成随机数组
        //math.random -> double [0,1)
        //(int) ((size + 1) * Math.random()) -> (0,size)
        //size = 6, size + 1 = 7;
        //Math.random() -> [0,1) * 7 -> [0,7) double
        // double -> int (0,6) int
        //生成长度随机的数组
        int[] arr = new int[(int) ((size + 1) * Math.random())];
        //随机数
        for (int i = 0; i < arr.length; i ++) {
            arr[i] = (int) ((value + 1) * Math.random()) - (int) (value * Math.random() );
        }
        return  arr;
    }
    public static void main(String[] args){
        int testTime = 500000;
        int size = 100;
        int value = 100;

    }

}
