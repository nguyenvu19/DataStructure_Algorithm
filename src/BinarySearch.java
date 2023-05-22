public class BinarySearch {
    public static int binarySearch(int[] a, int key) {
        int n = a.length;
        int iLeft = 0;
        int iRight = n - 1;

        while (iLeft <= iRight) {
            int iMid = (iLeft + iRight) / 2;
            if (key == a[iMid]) {
                System.out.println(iMid);
                return iMid;
            } else if (a[iMid] < key) {
                iLeft = iMid + 1;
            } else if (a[iMid] > key) {
                iRight = iMid - 1;
            }
        }
        return -1;
    }

    public static int binarySearch2(int[] a, int key, int iLeft, int iRight) {
        if (iLeft > iRight) {
            return -1;
        }
        int iMid = (iLeft + iRight) / 2;
        if (key == a[iMid]){
            System.out.println(iMid);
            return iMid;
        }else if (a[iMid] < key) {
            return binarySearch2(a,key,iMid+1,iRight);
        } else if (a[iMid] > key) {
            return binarySearch2(a,key,iLeft,iMid-1);
        }
        return iMid;
    }

    public static int binarySearch2(int[] a, int key) {
        int n = a.length;

        return binarySearch2(a, key, 0, n - 1);
    }


    public static void main(String[] args) {
        int[] a = {-1, 0, 3, 5, 9, 12};
        binarySearch2(a, 9);
    }
}
