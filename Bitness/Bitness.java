// Determine the bitness of JVM (32/64-bit)

public class Bitness {
    public static void main(String[] args) {
        String ver = System.getProperty("sun.arch.data.model");
        System.out.println("JVM " + ver + "-bit");
    }
}
