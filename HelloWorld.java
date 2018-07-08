public class HelloWorld {
    public static void main(String[] args) {

        writeD();

        System.out.println();

        writeE();

        System.out.println();

        writeE();

        // writeDEE();

    }

    // writing e here
    public static void writeE() {
        System.out.println("  +-----");
        System.out.println("  |");
        System.out.println("  +----");
        System.out.println("  |");
        System.out.println("  +-----");
    }

    public static void writeD() {
        System.out.println("  -----");
        System.out.println("   |   \\ ");
        System.out.println("   |    |");
        System.out.println("   |   /");
        System.out.println("  -----");
    }

    public static void writeDEE() {
        writeD();
        System.out.println();
        writeE();
        System.out.println();
        writeE();
        System.out.println();
    }
    
}

