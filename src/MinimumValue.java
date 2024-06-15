public class MinimumValue {

    public int FindMinimum (int [] arr) {
        int min = arr [0];
        for (int i = 1; i< arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void printMinimum(int[] arr) {
        int n = arr.length;
        for (int i = 0; i< arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int [] arr = {5,9,3,15,1,2};
        MinimumValue val = new MinimumValue();
        printMinimum(arr);
        System.out.println(val.FindMinimum(arr));

    }
}
