import java.util.Scanner;
public class Count_digits_in_a_number {
    public void Solution(int n ){
        int count = 0;
        while(n>0){
            n = n/10;
            count++;
        }
        System.out.print("The Number Digit Is : " + count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Count_digits_in_a_number sol = new Count_digits_in_a_number();
        System.out.print("Enter A Number To Count The Digit :");
        int n = sc.nextInt();
        sol.Solution(n);
        sc.close();
    }
}

