public class TipeDataBukanPrimitif {
    public static void main(String[] args) {
        Integer iniInteger = 100;
        Long iniLong = 10000L;
        Byte iniByte; // null
        iniByte = 100;
        System.out.println(iniInteger);
        System.out.println(iniLong);
        System.out.println(iniByte);

        int number = 10;
        Integer numObject = number; // Auto Convert if same data type

        short iniShort = numObject.shortValue(); // Manual convert if diff data type
        System.out.println(iniShort);
    }
}
