public class Q_09_PassByValue_Primitive {

    static void modify(int a) {
        a = a + 10;
    }

    public static void main(String[] args) {
        int x = 5;
        modify(x);
        System.out.println(x); // Output: 5 Real value of x would not be changed ,
                               //  Because in Pass By Value data types always send a copy to the parameter; 
    }
}

