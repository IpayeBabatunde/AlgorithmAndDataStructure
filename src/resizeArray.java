public class resizeArray {

    public int [] resizeNumber(int [] arr, int capacity) {
        int [] temp = new int [capacity];
        for (int i = 0; i< arr.length; i++) {
            temp[i] = arr[i];
        }

        return temp;
    }
    public static void printResize (int [] arr) {
        int n = arr.length;
        for (int i = 0; i< arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        resizeArray array = new resizeArray();
     //   array.printResize(new int[] {5,1,2,9,10});
        int [] number = new int[] {5,1,2,9,10};
        System.out.println("the size of original number - " + number.length);
        number =  array.resizeNumber(number, 10);
        System.out.println("the size of original number after resize - " + number.length);

    }
}
