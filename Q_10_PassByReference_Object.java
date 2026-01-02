class Wrapper {
    int value = 5;// Value initialised (value = 5); Then back to the main Function
}
public class Q_10_PassByReference_Object {
    static void modify(Wrapper obj) {
        obj.value += 10;// {value(5) += 10} = (5+10) = 15  
    }

    public static void main(String[] args) {
        Wrapper w = new Wrapper();// calls the Wrapper class(line--1)
        modify(w);//calls modify method
        System.out.println(w.value); // Output: 15
    }
}

// 

