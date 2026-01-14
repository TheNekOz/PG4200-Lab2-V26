package assignment;

public class Insert {
    private static int[] arr;

    public Insert(int[] arr) {
        this.arr = arr;
    }

    public int[] atStart(int value) {
        int arrLen = this.arr.length;
        int[] startArr = new int[arrLen + 1];
        startArr = atIndex(value, 0);
        return startArr;
        // Assignment yelled at me to refactor, so I did.
    }

    public int[] atEnd(int value) {
        int arrLen = this.arr.length;
        int[] endArr = new int[arrLen + 1];
        endArr = atIndex(value, endArr.length - 1);
        return endArr;
    }

    public int[] atIndex(int value, int position) {
        int arrLen = this.arr.length + 1;
        int[] indexArr = new int[arrLen];
        // Ah welp, this forces me to do it manually.
        for (int i = 0; i < arrLen; i++) {
            if (i < position) {
                indexArr[i] = this.arr[i];
            } else if (i == position) {
                indexArr[position] = value;
            } else {
                indexArr[i] = this.arr[i-1];
            }
        }
        return indexArr;
    }
}