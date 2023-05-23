public class QuickSort {
    public static void quickSort(int[] a, int left, int right) {
//        Dieu kien dung
        if (left >= right) return;
//        B1: chon khoa
        int key = (left + right) / 2;
//        B2: Phan bo lai mang theo khoa
        int k = partition(a, left, right, key);
//        B3: Chia doi mang => lap lai
        quickSort(a, left, key - 1);
        quickSort(a, k, right);
    }

    public static int partition(int[] a, int left, int right, int key) {
        int iL = left;
        int iR = right;
        while (iL <= iR) {
//            Voi iL, tim phan tu lon hon key de doi cho
            while (a[iL] < key) iL++;
//            Voi iR, tim phan tu be hon key de doi cho
            while (a[iR] > key) iR--;

            if (iL <= iR) {
                int temp = a[iL];
                a[iL] = a[iR];
                a[iR] = temp;
                iL++;
                iR--;
            }

        }
        return iL;
    }

    public static void main(String[] args) {
        int[] a = {6, 7, 8, 5, 4, 1, 2, 3};
        quickSort(a, 0, a.length - 1);
    }
}
