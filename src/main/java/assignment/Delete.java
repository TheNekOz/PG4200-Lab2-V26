package assignment;

public class Delete {
    private static int[] arr;

    public Delete(int[] arr) {
        this.arr = arr;
    }

    // Yeah no, doing atIndex first
    public int[] atIndex(int position) {
        int arrLen = this.arr.length - 1;
        int[] indexArr = new int[arrLen];

        for (int i = 0; i < arrLen; i++) {
            if (i < position) {
                indexArr[i] = this.arr[i];
            } else {
                indexArr[i] = this.arr[i + 1];
            }
        }
        return indexArr;
    }

    public int[] atStart() {
        int[] startArr;
        startArr = atIndex(0);
        return startArr;
    }

    public int[] atEnd() {
        int[] endArr;
        int arrLen = this.arr.length;
        endArr = atIndex(arrLen);
        return endArr;
    }
}
