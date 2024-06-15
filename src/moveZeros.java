public class moveZeros {

    public static void moveZeroToEnd(int [] arr, int n) {
        int j = 0;
        for (int i = 0; i< arr.length; i++){
            if (arr [i] != 0 && arr [j] == 0) {
                int temp = arr [i];
                arr [i] = arr [j];
                arr [j] = temp;
            }
            if (arr [j] != 0){
                j++;
            }

        }

    }
    public static void printZeros (int [] arr) {
        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
    public static void main(String[] args) {
        int [] arr = {8,1,0,2,1,0,3};
        moveZeros move = new moveZeros();
        printZeros(arr);
        moveZeroToEnd(arr, arr.length);
        printZeros(arr);
    }
}
