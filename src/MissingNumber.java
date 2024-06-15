public class MissingNumber {

    public static int findMissingNo (int [] arr) {
        int n = arr.length + 1;
        int sum = n * (n + 1) / 2;
        for (int num : arr) {
            sum = sum - num;
        }
        return sum;
    }

    public static void printMissingNo (int [] arr) {
        int n = arr.length;
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int [] arr = {1,3,6,8,2,4,7};
        printMissingNo(arr);
        System.out.println(findMissingNo(arr));
    }
}
