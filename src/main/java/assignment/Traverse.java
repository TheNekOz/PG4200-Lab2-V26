package assignment;

public class Traverse {
    private static int [] arr;

    public Traverse(int[] arr) {
        this.arr = arr;
    }

    public int[] inReverse() {
        int arrLen = this.arr.length;
        int [] revArr = new int[arrLen];
        arrLen--;
        for (int i = arrLen; i >= 0; i--) {
            revArr[arrLen - i] = arr[i];
        }
        return revArr;
    }
}
