public class ArrayPrint {

    public void printArray (int [] arr) {
        int n = arr.length; // store the length of an array in an integer variable n
        for (int i =0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
    public static void main(String[] args) {
        ArrayPrint arrDemo = new ArrayPrint();
        arrDemo.printArray(new int [] {6, 7, 8, 9, 2, 3});

    }
}
