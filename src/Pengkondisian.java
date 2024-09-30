public class Pengkondisian {
    public static void main(String[] args) {
        var nilai = 70;
        var absen = 90;
        String grade;

        if (nilai >= 80 && absen >= 80) {
            grade = "A";
        } else if (nilai >= 70 && absen >= 70) {
            grade = "B";
        } else if (nilai >= 60 && absen >= 60) {
            grade = "C";
        } else if (nilai >= 50 && absen >= 50) {
            grade = "D";
        } else {
            grade = "E";
        }

        switch (grade) {
            case "A", "B" -> System.out.println("Baik");
            case "C" -> System.out.println("Cukup");
            case "D" -> System.out.println("Kurang");
            default -> {
                System.out.println("Sangat Kurang");
                // multi line
            }
        }

        // TERNARY
        String ucapan = grade == "A" || grade == "B" ? "Selamat anda lulus" : "Silahkan Remedial";
        System.out.println(ucapan);
    }
}
