public class App {
    public static void main(String[] args) throws Exception {
        int[] arr = { 17, 18, 5, 4, 6, 1 };
        replaceElements(arr);
    }

    public static int[] replaceElements(int[] arr) {
        int max = -1;

        for (int i = arr.length - 1; i >= 0 ; i--) {
            // We can use this way to swap values
            // int newMax = Math.max(arr[i], max);
            // arr[i] = max;
            // max = newMax;

            // This way also works the same
            if (arr[i] > max) {
                int temp = max;
                max = arr[i];
                arr[i] = temp;
            } else {
                arr[i] = max;
            }
        }
        return arr;
    }
}
