public class _1295_FindNumber {
    public static int findNumbers(int[] nums) {
        int count = 0;

        for (int a : nums
        ) {

            int soChuSo = tinhSoChuSo(a);
            if (soChuSo % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    private static int tinhSoChuSo(int a) {
        int count = 0;
        int result = a;

        while (result != 0) {
            result = a / 10;
            a = result;
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 40};

        System.out.println(findNumbers(nums));


    }
}









