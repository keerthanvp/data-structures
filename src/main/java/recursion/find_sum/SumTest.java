package recursion.find_sum;

public class SumTest {
    public static void main(String[] args) {
        System.out.println("Calculating sum:");
        int sum = calculateSum(20);
        System.out.println(sum);

        int sumOf = calculateSum(5,10);
        System.out.println(sumOf);
    }

    public static int calculateSum(int value){
        if (value > 0)
            return value + calculateSum(value - 1);
        return 0;
    }

    public static int calculateSum(int start, int end){
        if (end == start)
            return 0;
        return end + calculateSum(start, end - 1);
    }
}
