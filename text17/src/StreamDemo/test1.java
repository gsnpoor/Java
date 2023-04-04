package StreamDemo;

public class test1 {
    public static void main(String[] args) {
        int[] arr = {6, 1, 2, 5, 4, 3, 9, 7, 10, 8};
        quickSort(arr, 0, arr.length - 1);
        for (int j : arr) {
            System.out.println(j);
        }
    }

    public static int binarySearch(int[] arr, int number) {
        int min = 0;
        int max = arr.length - 1;
        while (true) {
            int mid = (min + max) / 2;
            if (arr[mid] < number) {
                min = mid + 1;
            } else if (arr[mid] > number) {
                max = mid - 1;
            } else {
                return mid;
            }
        }
    }

    public static int[] bubble(int[] arr) {
        for (int i = arr.length - 1; i > 1; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            for (int j : arr) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        return arr;
    }

    public static int[] selection(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }
        return arr;
    }

    public static int[] insert(int[] arr) {
        int startIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[i + 1]) {
                startIndex = i + 1;
                break;
            }
        }

        for (int i = startIndex; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
        return arr;
    }

    public static int sum(int number) {
        if (number == 1) {
            return 1;
        }
        return number * sum(number - 1);
    }

    public static void quickSort(int[] arr, int i, int j) {
        int start = i + 1;
        int end = j;
        int baseNumber = arr[i];
        if (start > end) {
            return;
        }
        while (start != end) {
            while (end > start && arr[end] >= baseNumber) {
                end--;
            }
            while (end > start && arr[start] <= baseNumber) {
                start++;
            }
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        int temp = arr[start];
        arr[start] = arr[i];
        arr[i] = temp;
        quickSort(arr, i, start - 1);
        quickSort(arr, start + 1, j);
    }
}
