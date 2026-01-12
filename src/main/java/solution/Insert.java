package solution;

public class Insert {
    public int [] arr;

    public Insert(int[] arr) {
        this.arr = arr;
    }

    public int[] atStart(int value){
        var arrLen = this.arr.length;
        // Create a new array that has one position more than the existing array.
        // Assign the value to the first position. 
        int [] newArr = new int[arrLen+1];
        newArr[0] = value;

        // Loop through the exisitng array and shift by one position to the right in the new array. 
        for(int i=0;i<arrLen;i++) {

            newArr[i+1] = this.arr[i];
        }
        return newArr;
    }

    public int[] atEnd(int value){
        var arrLen = this.arr.length;
        // Create a new array that has one position more than the existing array.
        // Assign the value to the last position. 
        int [] newArr = new int[arrLen+1];
        newArr[arrLen] = value;

        // Loop through the exisitng array and insert the values at the same position into the new array.
        // hmm. can that be made faster?
        for(int i=0;i<arrLen;i++) {

            newArr[i] = this.arr[i];
        }
        return newArr;
    }

    public int[] atIndex(int value, int pos){
        // Create a new array that has one position more than the existing array.
        
        var arrLen = this.arr.length;
        int [] newArr = new int[arrLen+1];

        // how to not crash
        if (pos > arrLen - 1){
            return this.atEnd(value);
        }
        //Loop through the NEW array and insert the values at the same position into the new array... 
        for(int i=0;i<arrLen+1;i++) {
            if (i < pos) {
                newArr[i] = this.arr[i];
            }
            //..until your reach the target position to insert the new value..
            else if (i == pos) {
                 newArr[pos] = value;
            }
            //.. then loop through the remainding NEW array and shift  by one position to the left in the exisiting array. 
            else {
                  newArr[i] = this.arr[i-1];
            }

        }
        return newArr;
    }


}
