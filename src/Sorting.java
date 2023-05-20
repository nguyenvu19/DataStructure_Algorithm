public class Sorting {
    /*
        Sắp xếp nổi bọt:
        Chạy từ đầu đến cuối mảng
        Nếu phần tử đứng trước lớn hơn phần tử đứng sau thì đổi chỗ
        Sau mỗi vòng lặp thì phần tử lớn nhất sẽ trôi xuống cuối
     */
    public static void bubbleSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
            printArray(i, a);
        }
    }

    public static void printArray(int no, int[] a) {
        System.out.printf("%d: ", no);
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%d ", a[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] a = {5, 2, 7, 4, 1, 6, 12, 9, 0};
        bubbleSort(a);
    }
}
