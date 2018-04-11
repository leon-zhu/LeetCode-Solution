/**
 * 插入排序
 *
 * 将待排序的元素按值的大小逐个插入到一个已经排好序的有序序列中
 * （为了给新元素腾位置，那么需要移动已排好序的序列）
 *
 */

public class InsertionSort {
    private static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            //与排好序的序列从后往前依次比较(因为前面的已经排好序了，不满足即刻停止)
            for (int j = i; j > 0 && arr[j] > arr[j-1]; j--) {
                exch(arr, j, j-1);
            }
        }
    }

    private static void exch(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = Test.createArray(10, 100);
        Test.print(arr);
        sort(arr);
        assert Test.isSorted(arr);
        Test.print(arr);
    }
}
