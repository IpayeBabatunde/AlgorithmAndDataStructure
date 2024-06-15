public class Array {

    public void printArray (int[] arr) {
        int n = arr.length;
        for (int i = 0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public void arrayDemo () {
        int [] myArray = new int[5]; // Array Default value // 0 1 2 3 4

        myArray [0] = 5;
        myArray [1] = 4;
        myArray [2] = 3;
        myArray [3] = 4;
        myArray [4] = 5;
        myArray [2] = 10;
        printArray(myArray);
        System.out.println(myArray.length);
        System.out.println(myArray[myArray.length - 1]);

        int [] arr = {7,8,9,10};
        printArray(arr);

    }

    public static void main(String[] args) {
        Array arrDemo = new Array();
        arrDemo.arrayDemo();
    }
}
