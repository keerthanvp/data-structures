package arrays.rotate_array;

/*
Rotate elements of an array by K elements
Time Complexity : O(n)
Space Complexity : O(n)
 */

public class RotateByKEleTest {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int k = 2;
        int n = 5;
        int gcd = findGCD(n,k);
        rotate(arr,n,k,gcd);
        printArray(arr,n);
    }

    public static int findGCD(int a, int b){
        if (b==0)
            return a;
        return findGCD(b, a%b);
    }

    public static void rotate(int[] arr,int n, int k,int gcd){
        int j,l = 0;
        for (int i = 0; i < gcd; i++) {
            int temp = arr[i];
            j = i;
            while (true){
                l = j + k;
                if (l>=n)
                    l = l-n;
                if (l==i)
                    break;
                arr[j] = arr[l];
                j = l;
            }
            arr[j] = temp;
        }
    }

    public static void printArray(int[] arr, int n){
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
