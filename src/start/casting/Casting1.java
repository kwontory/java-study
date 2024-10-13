package start.casting;

public class Casting1 {
    public static void main(String[] args) {
        int intV = 10;
        long longV;
        double dbV;

        longV = intV;
        System.out.println(longV);
        dbV = intV;
        System.out.println(dbV);

        dbV = 2000000L;
        System.out.println(dbV);
    }
}
