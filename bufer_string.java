import java.util.*;
public class bufer_string {
    public static void main(String[] args){
        // Checking capacity of sting buffers
        StringBuffer sb1 = new StringBuffer();
        System.out.println("Capacity of StringBuffer object sb1 " + sb1.capacity());

        StringBuffer sb2 = new StringBuffer("Hello");
        System.out.println("Capacity of StringBuffer object sb1 " + sb2.capacity());

        //Reversing the contents of the string and converting to Upper case
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String to reverse ");
        String str = sc.nextLine();
        StringBuffer og_string = new StringBuffer(str);

        System.out.println("Reversed String in Uppercase " + og_string.reverse().toString().toUpperCase());

        //reading a string from console and appending it
        StringBuffer base = new StringBuffer("Hi I am ");
        System.out.println("Enter a string to append ");
        String read_str = sc.nextLine();
        StringBuffer read_str_buf = new StringBuffer(read_str);
        System.out.println(base.append(read_str_buf));
    }
}
