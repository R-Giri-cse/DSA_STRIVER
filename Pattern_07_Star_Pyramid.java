import java.util.Scanner;
public class Pattern_07_Star_Pyramid {
    //         *
    //       * * *
    //     * * * * *
    //   * * * * * * *
    // * * * * * * * * * 
    public void pattern_07(int n){
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
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Pattern_07_Star_Pyramid sol = new Pattern_07_Star_Pyramid();
        System.out.print("Enter A Number  : ");
        int n = sc.nextInt();
        sol.pattern_07(n);
        sc.close();
    }
}
