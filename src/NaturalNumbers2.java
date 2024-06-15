public class NaturalNumbers2 {

    public static void main(String[] args) {
        double now2 = System.currentTimeMillis();

        NaturalNumbers2 demo = new NaturalNumbers2();
        System.out.println(demo.FindSum2(99999));
        System.out.println("Time Taken - " + (System.currentTimeMillis() - now2 ) + " milliseconds.");

    }

    public int FindSum2(int n) {
        int sum = 0;
        for (int i = 1;  i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }
}
