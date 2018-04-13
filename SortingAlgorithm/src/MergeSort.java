/**
 * 归并排序
 *
 * 先切分，再归并(具体实现，递归的从小到大依次归并)
 *
 * @author: leon
 * @date: 2018/4/13 19:11
 * @version: 1.0
 *
 * 自顶向下的归并排序性能分析:
 * 定义C(N): 长度为N的数组所需的比较次数
 *
 * 那么有C(N) = 2*C(N)+N
 *
 *令N=2^n; 那么有C(2^n) = 2*C(2^n) + 2^n;
 *
 * n=n-1 => C(2^(n-1)) = 2*C(2^(n-1)) + 2^(n-1);
 *
 * 将上式代入C(2^n)式子的右边得到:
 * C(2^n) = 2*( 2*C(2^(n-1)) + 2^(n-1)) + 2^n
 *        = 2^2*(C(2^(n-1)) + 2*2^n;
 * 继续迭代可以得到:
 * C(2^n) = z^n*(C(1)) + n*2^n;
 * 即C(N) = N*lgN (较小的项目被忽略)
 */

public class MergeSort {

    private static int[] aux; //临时数组

    static void sort(int[] arr) {
        aux = new int[arr.length];
        sort(arr, 0, arr.length-1);
    }

    private static void sort(int[] arr, int left, int right) {
        if (right <= left)
            return;
        int mid = left + (right - left) / 2;
        sort(arr, left, mid);
        sort(arr, mid+1, right);
        merge(arr, left, mid, right);
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        System.arraycopy(arr, left, aux, left, right-left+1);
//        for (int i = left; i <= right; i++) {
//            aux[i] = arr[i];
//        }
        int i = left, j = mid+1;
        for (int k = left; k <= right; k++) {
            if (i > mid) {
                arr[k] = aux[j++];
            } else if (j > right) {
                arr[k] = aux[i++];
            } else if (aux[i] < aux[j]) {
                arr[k] = aux[i++];
            } else {
                arr[k] = aux[j++];
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = Test.createArray(10, 100);
        Test.print(arr);
        sort(arr);
        assert Test.isSorted(arr);
        Test.print(arr);
    }
}
