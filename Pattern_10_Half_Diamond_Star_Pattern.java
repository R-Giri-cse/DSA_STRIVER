import java.util.Scanner;
public class Pattern_10_Half_Diamond_Star_Pattern {
    // * 
    // * *
    // * * *
    // * * * *
    // * * * * *
    // * * * *
    // * * *
    // * *
    // *
    public void pattern_10(int n){
        for (int i = 1;i <= n;i++){
            for(int j = 1; j<=i ;  j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = 1;i<=n;i++){
            for(int j = n-i;j>0;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pattern_10_Half_Diamond_Star_Pattern sol = new Pattern_10_Half_Diamond_Star_Pattern();
        System.out.print("Entre A Number : ");
        int n = sc.nextInt();
        sol.pattern_10(n);
        sc.close();
    }
}
