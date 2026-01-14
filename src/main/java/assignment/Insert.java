package assignment;

public class Insert {
    private static int[] arr;

    public Insert(int[] arr) {
        this.arr = arr;
    }

    public int[] atStart(int value) {
        int arrLen = this.arr.length;
        int[] startArr = new int[arrLen + 1];
        startArr[0] = value;
        System.arraycopy(arr, 0, startArr, 1, arrLen);
        return startArr;
        // Probably intended to be done manually through for loop, but arraycopy works and is fast
        // Laziness wins over me at this moment, still burned out with major brainfog from exams.
        // Yell at me if I really should do it manually.
        // Update: Ok I should have read ahead.
    }

    public int[] atEnd(int value) {
        int arrLen = this.arr.length;
        int[] endArr = new int[arrLen + 1];
        endArr[endArr.length - 1] = value;
        System.arraycopy(arr, 0, endArr, 0, arrLen);
        return endArr;
    }

    public int[] atIndex(int value, int position) {
        int arrLen = this.arr.length;
        int[] indexArr = new int[arrLen + 1];
        // Ah welp, this forces me to do it manually.
        for (int i = 0; i < arrLen + 1; i++) {
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