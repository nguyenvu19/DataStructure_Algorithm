public class _414_Third_Maximum_Number {
    public static void insert(long[] maxArr, int val) {
        int i = 0;
        while (i < maxArr.length) {
            if (val == maxArr[i]) {
//                Khong duoc trung
                return;
            } else if (val > maxArr[i]) {
//                Chen val vao maxArr[i]
                break;
            } else if (val < maxArr[i]) {
                i++;
            }
        }

        if (i < maxArr.length) {
            for (int j = maxArr.length - 2; j >= i; j--) {
                maxArr[j + 1] = maxArr[j];
            }
            maxArr[i] = val;
        }
    }

    public static int thirdMax(int[] nums) {
        long[] maxArr = {Long.MIN_VALUE, Long.MIN_VALUE, Long.MIN_VALUE};

        for (int i = 0; i < nums.length; i++) {
            insert(maxArr, nums[i]);
        }

        if (maxArr[2] == Long.MIN_VALUE) {
            return (int) maxArr[0];
        }
        return (int) maxArr[2];
    }

    public static void printArray(int no, int[] a) {
        System.out.printf("%d: ", no);
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%d ", a[i]);
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int[] a = {2, 2, 3, 1};
        System.out.println(thirdMax(a));
    }
}
