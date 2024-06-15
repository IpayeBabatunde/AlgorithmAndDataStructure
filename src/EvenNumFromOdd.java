public class EvenNumFromOdd {


    // Algorithm to Perform the Action
    public static int[] removeEvenFromOddNumber (int [] arr) {
        int oddCount =0;
        for (int i = 0; i< arr.length; i++){
            if (arr[i] % 2 != 0){
                oddCount++; // Increment the odd count
            }

        }
        int [] result = new int [oddCount]; // Generating a result for the odd count
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if ( arr [i] % 2 != 0) {
                result [idx] = arr[i];
                idx++;
            }

        }
        return result;
    }

    public static void printOddFromEvenNumber (int [] arr ) {
        int n = arr.length;
        for (int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + "");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        int [] arr = {3,2,4,7,10,6,5};
        // To print our final result
        printOddFromEvenNumber(arr);
        printOddFromEvenNumber(removeEvenFromOddNumber(arr));
    }


}
