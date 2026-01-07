import java.util.Scanner;
public class Pattern_05_Inverted_Right_Pyramid {
    // * * * * *
    // * * * *
    // * * * 
    // * * 
    // * 
    public void pattern_05(int n){
        for(int i = 0;i<n;i++){
            for(int j = n-i;j>0;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pattern_05_Inverted_Right_Pyramid sol = new Pattern_05_Inverted_Right_Pyramid();
        System.out.print("Enter Number Of Rows : ");
        int n = sc.nextInt();
        sol.pattern_05(n);
        sc.close();
    }
}
