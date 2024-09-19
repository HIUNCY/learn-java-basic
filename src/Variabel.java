public class Variabel {
    public static void main(String[] args) {
        // you dont need to declare data type by using var keyword
        var name = "Zainul";
        var age = 22;
        var address = "Jl. in aja dulu";
        System.out.println(name);
        System.out.println(age);
        System.out.println(address);

        // you cant change the value when using final keyword
        final String country = "Indonesia";
        country = "Japan"; // Error!
        System.out.println(country);
    }
}
