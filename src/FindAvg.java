public class FindAvg {

    public static void main(String[] args) {

        FindAvg demo = new FindAvg();
        System.out.println(demo.FindAverage(10, 20, 30));
    }
    public int FindAverage(int a, int b, int c) {

        int sum = a + b + c;
        int avg = sum/3;
        return avg;
    }


}
