import java.util.Random;
class Test {

    static int[] createArray(int len, int bound) {
        int[] array = new int[len];
        Random rand = new Random();
        for (int i = 0; i < len; i++) {
            array[i] = rand.nextInt(bound);
        }
        return array;
    }

    static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i+1])
                return false;
        }
        return true;
    }

    static void print(int[] arr) {
        for (int e : arr)
            System.out.print(e + " ");
        System.out.println();
    }
}
