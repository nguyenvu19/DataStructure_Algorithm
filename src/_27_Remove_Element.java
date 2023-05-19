public class _27_Remove_Element {
    public static int removeElement(int[] nums, int val) {
        int n = nums.length;

        for (int i = 0; i < n; ) {
            if (nums[i] == val) {
                for (int j = i; j <= (n - 2); j++) {
                    nums[j] = nums[j + 1];
                }
                n--;
            } else {
                i++;
            }
        }
        return n;
    }

    public static int removeElement2(int[] nums, int val) {
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
                System.out.println(val+"k");
                System.out.println(nums[i]+"num");
            }
        }

        return k;
    }

    public static void main(String[] args) {
        int[] a = {3, 2, 2, 3, 2, 2, 5, 6, 7};
        System.out.println(removeElement(a, 2));
        System.out.println(removeElement2(a, 2));
    }
}
