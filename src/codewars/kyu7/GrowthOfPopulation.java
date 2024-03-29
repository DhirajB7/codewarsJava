package codewars.kyu7;

public class GrowthOfPopulation {

    public static int nbYear(int p0, double percent, int aug, int p) {
        int count = 0;

        while(p>p0){
            count++;
            p0 =  p0 + (int)(p0 * percent/100) + aug;
        }

        return count;
    }

    public static void main(String[] args) {

        System.out.println(nbYear(1500, 5, 100, 5000));
        System.out.println(nbYear(1500000, 2.5, 10000, 2000000));
        System.out.println(nbYear(1500000, 0.25, 1000, 2000000));

    }

}
