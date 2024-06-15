public class additionOfTwoNum {

    public int AddNumbers (int a, int b, int c, int d) {
        int sum = a + b + c + d;
        int sub = a + b - c - d;
        int result = sum - sub;

        return result;

    }
    public static void main(String[] args) {
        additionOfTwoNum add = new additionOfTwoNum();
        System.out.println(add.AddNumbers(4, 3, 2, 1));

    }
}
