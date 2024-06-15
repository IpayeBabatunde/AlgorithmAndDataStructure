public class NaturalNumbers {

    public static void main(String[] args) {
        double now = System.currentTimeMillis();

        NaturalNumbers demo = new NaturalNumbers();
        System.out.println(demo.FindSum(99999));

        System.out.println("Time Taken - " + (System.currentTimeMillis() - now) + " milliseconds.");
    }


    public int FindSum(int n ) {

        return n * (n+1) / 2;
    }


}