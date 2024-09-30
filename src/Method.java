public class Method {
    public static void main(String[] args) {
        sayHelloWorld();

        sayHelloTo("Zainul", "Kamal");
        sayHelloTo("Amanda", "Natasya");

        var r = sum(8, 7);
        System.out.println(r);
        System.out.println(sum(28, 12));

        r = hitung(5, "*", 7);
        System.out.println(r);
        System.out.println(hitung(10, "-", 3));

        sayCongrats("Zainul", 80,80,80,80);

        System.out.println(factorialRecursive(5));
    }

    static void sayHelloWorld() {
        System.out.println("Hello World");
    }

    static void sayHelloTo(String firstName, String lastName) {
        System.out.println("Hello, "+firstName+" "+lastName);
    }

    static int sum(int val1, int val2) {
        return val1+val2;
    }

    static int hitung(int val1, String operator, int val2) {
        switch (operator) {
            case "+":
                return val1+val2;
            case "-":
                return val1-val2;
            case "*":
                return val1*val2;
            case "/":
                return val1/val2;
            default:
                return 0;
        }
    }

    static void sayCongrats(String nama, int... nilai) {
        var total = 0;
        for (int v : nilai) {
            total += v;
        }
        var avg = total/nilai.length;
        if (avg > 75) {
            System.out.println("Selamat "+nama+", anda lulus!");
        } else {
            System.out.println("Maaf "+nama+", anda belum lulus!");
        }
    }

    static int factorialRecursive(int value) {
        if (value == 1) {
            return 1;
        } else {
            return value * factorialRecursive(value-1);
        }
    }
}
