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
    }
}
