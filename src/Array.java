public class Array {
    public static void main(String[] args) {
        String[] arrayStrings = {
            "Muhamad",
            "Zainul",
            "Kamal"
        };
        arrayStrings[1] = "Ajay";
        System.out.println(arrayStrings[1]);
        System.out.println(arrayStrings.length);

        Integer[][] nestedArray = {
            {1,2,3},
            {4,5,6},
            {7,8,9},
        };
        System.out.println(nestedArray[1][0]);
    }
}
