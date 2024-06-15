public class MinimumValueNew {

    public int FindMin (int [] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("invalid input");
        }
        int min = arr [0]; // min will hold the minimum of array
        for (int i = 1; i< arr.length; i++){
            if (arr[i] < min ) {
                min = arr[i];
            }

        }
        return min;
    }

    public static void main(String[] args) {
        int [] arr = {5,9,3,16,9,2};
        MinimumValueNew min = new MinimumValueNew();
        System.out.println(min.FindMin(arr));

    }
}
