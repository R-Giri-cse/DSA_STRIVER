import java.util.Scanner;
public class Pattern_08_Inverted_Star_Pyramid {
    // * * * * * * * * * 
    //   * * * * * * *
    //     * * * * *
    //       * * *
    //         *
    public void pattern_08(int n){
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
        Pattern_08_Inverted_Star_Pyramid sol = new Pattern_08_Inverted_Star_Pyramid();
        System.out.print("Entre A Number  : ");
        int n = sc.nextInt();
        sol.pattern_08(n);
        sc.close();
    }
}
