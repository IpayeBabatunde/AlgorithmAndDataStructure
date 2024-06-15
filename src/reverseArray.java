public class reverseArray {

    public static void printReverse (int [] numbers, int start, int end) {
        while (start < end ) {
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
            start++;
            end--;
        }
    }
    public static void printArr (int [] arr) {
        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
     int [] numbers = {1,2,3,4,5,6,7,8,9};
     printArr(numbers);
     printReverse(numbers, 0, numbers.length-1);
     printArr(numbers);
    }

}