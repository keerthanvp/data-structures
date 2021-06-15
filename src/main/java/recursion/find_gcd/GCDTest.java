package recursion.find_gcd;

public class GCDTest {
    public static void main(String[] args) {
        int a = 25, b = 15;
        System.out.println("GCD of "+a +" and "+b+" : "+ gcd(a,b));
    }

    public static int gcd(int a, int b){
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}
