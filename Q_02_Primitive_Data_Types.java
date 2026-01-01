import java.util.*;
public class Q_02_Primitive_Data_Types {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // (1 byte = 8 bit)


        // 1. byte (1 byte )
        System.out.print("Enter a Nmber for byte(like 10) Data Type : ");
        byte b = sc.nextByte();
        System.out.println("byte value: " + b);

        // 2. short (2 bytes)
        System.out.print("Enter a Nmber for short (like 1000) Data Type : ");
        short s = sc.nextShort();
        System.out.println("short value: " + s);

        // 3. int (4 bytes)
        System.out.print("Enter a Nmber for int (like 1000) Data Type : ");
        int i = sc.nextInt();
        System.out.println("int value: " + i);

        // 4. long (8 bytes)
        System.out.print("Enter a Nmber for long(like 1000L) Data Type : ");
        long l = sc.nextLong();
        System.out.println("long value: " + l);

        // 5. float (4 bytes)
        System.out.print("Enter a Nmber for float(like 10.5f) Data Type : ");
        float f = sc.nextFloat();
        System.out.println("float value: " + f);

        // 6. double (8 bytes)
        System.out.print("Enter a Nmber for double(99.99) Data Type : ");
        double d = sc.nextDouble();
        System.out.println("double value: " + d);

        // 7. char (2 bytes)
        System.out.print("Enter a character (like 'A'): ");
        char c = sc.next().charAt(0);
        System.out.println("char value: " + c);

        // 8. boolean (true/false)
        boolean isJavaEasy = true;
        System.out.println("boolean value: " + isJavaEasy);
        sc.close();


    }
    
}
