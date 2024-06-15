public class SecondMaxValue {

    public int FindSecondMax (int [] arr) {
        Byte integer = null;
        int max = Byte.MIN_VALUE;
        int SecondMax = Byte.MIN_VALUE;
        for (int i =0; i < arr.length; i++) {
            if (arr[i] > max) {
                SecondMax = max;
                max = arr[i];
            }else if (arr[i] > SecondMax && arr[i] != max){
                SecondMax = arr[i];
            }
        }
        return SecondMax;
    }
    public static void printSecondMax (int [] arr) {
        int n = arr.length;
        for (int i =0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int [] arr = {13, 34, 2, 34, 33, 10};
        SecondMaxValue sec = new SecondMaxValue();
        printSecondMax(arr);
        System.out.println(sec.FindSecondMax(arr));
    }
}
