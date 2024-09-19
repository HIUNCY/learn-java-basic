public class TipeDataNumber {
    public static void main(String[] args) {
        byte iniByte = 100;
        short iniShort = 1000;
        int iniInt = 1000000;
        long iniLong = 100000000;
        System.out.println(iniByte);
        System.out.println(iniShort);
        System.out.println(iniInt);
        System.out.println(iniLong);

        float iniFloat = 0.1346F;
        double iniDouble = 0.8136815;
        System.out.println(iniFloat);
        System.out.println(iniDouble);

        int decimal = 99;
        int hexa = 0xA132B;
        int binary = 0b1010101;
        System.out.println(decimal);
        System.out.println(hexa);
        System.out.println(binary);

        long longBalance = 1_000_000_000L;
        int sum = 60_000_000;
        System.out.println(longBalance);
        System.out.println(sum);

        // WIDENING CASTING (AUTO CONVERT)
        byte widByte = 8;
        short widShort = widByte;
        int widInt = widShort;
        long widLong = widInt;
        float widFloat = widLong;
        double widDouble = widFloat;
        System.out.println(widDouble);

        // NARROWING CASTING (MANUAL CONVERT)
        float narFloat = (float) widDouble;
        long narLong = (long) narFloat;
        int narInt = (int) narLong;
        short narShort = (short) narInt;
        byte narByte = (byte) narShort;
        System.out.println(narByte);

    }
}
