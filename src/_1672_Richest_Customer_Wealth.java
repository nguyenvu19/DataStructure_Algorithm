public class _1672_Richest_Customer_Wealth {
    public static int maximumWealth(int[][] accounts) {
        int rows = accounts.length;
        int cols = accounts[0].length;
        int[] total = new int[rows];

        for (int i = 0; i < rows; i++) {
            int num = 0;
            for (int j = 0; j < cols; j++) {
                num += accounts[i][j];
            }
            total[i] = num;
        }

        int max = 0;
        for (int i = 0; i < rows; i++) {
            if (total[i] > max) {
                max = total[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {3, 2, 1}};
        System.out.println(maximumWealth(a));
    }
}
