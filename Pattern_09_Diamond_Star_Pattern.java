import java.util.Scanner;
public class Pattern_09_Diamond_Star_Pattern {
    public void pattern_09(int n){
        for(int i = 0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print("  ");
            }
            
            for(int j = 0; j<2*i+1;j++){
                System.out.print("* ");
            }

            for(int j=0;j<n-i-1;j++){
                System.out.print("  ");
            }
            System.out.println();
        }
        for(int i = 0;i<n;i++){
            for(int j = 0;j<i;j++){
                System.out.print("  ");
            }
            for(int j = 0;j<2*n-2*i-1;j++){
                System.out.print("* ");
            }
             for(int j = 0;j<i;j++){
                System.out.print("  ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Pattern_09_Diamond_Star_Pattern sol = new Pattern_09_Diamond_Star_Pattern();
        System.out.print("Entre A Number : ");
        int n = sc.nextInt();
        sol.pattern_09(n);
        sc.close();
    }
}
