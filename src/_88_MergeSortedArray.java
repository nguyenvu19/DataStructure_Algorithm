public class _88_MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int ai : nums2) {
            addToArray(ai, nums1, m);
            m++;
        }
    }

    private static void addToArray(int x, int[] a, int m) {
        boolean findK = false;

        for (int k = 0; k < m; k++) {
            if (a[k] > x) {
                findK = true;

                for (int i = m - 1; i >= k; i--) {
                    a[i + 1] = a[i];
                }

                a[k] = x;
                break;
            }
        }

        if (!findK) {
            a[m] = x;
        }
    }

    public static void main(String[] args) {
        int[] n1 = {1, 2, 3, 0, 0, 0};
        int[] n2 = {4, 5, 6};

        merge(n1, 3, n2, 3);
        System.out.println("Done");
    }
}
