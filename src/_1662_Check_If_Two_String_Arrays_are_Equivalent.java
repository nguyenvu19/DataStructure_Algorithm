public class _1662_Check_If_Two_String_Arrays_are_Equivalent {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder r1 = new StringBuilder();
        StringBuilder r2 = new StringBuilder();

        for (String s : word1) {
            r1.append(s);
        }

        for (String s : word2) {
            r2.append(s);
        }

        if (r1.toString().equals(r2.toString())) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String[] arr1 = {"a", "bc"};
        String[] arr2 = {"ab", "c"};
        arrayStringsAreEqual(arr1, arr2);
    }
}
