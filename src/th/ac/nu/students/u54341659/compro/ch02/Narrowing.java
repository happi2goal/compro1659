
package th.ac.nu.students.u54341659.compro.ch02;

public class Narrowing {
    
    public static void main(String[] args) {
        int i = 32768;
        short s = (short) i;
        
        System.out.println("i = " + i + ", s = " + s);
    
    }
}
