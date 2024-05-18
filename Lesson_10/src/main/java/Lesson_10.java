import java.util.Scanner;

public class Lesson_10 {
public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.println("Введите номер документа: ");
 String document = new Scanner(System.in).nextLine();
first(document);
second(document);
therd(document);
fourth(document);
fifth(document);
sixth(document);
seventh(document);
}

public static void first(String document){
   String[] parts = document.split("-");
   System.out.println(parts[0]+" "+parts[2]);
}

public static void second(String document){
    String modifieddocument = document.replaceAll("[a-zA-Z]{3}", "***");
    System.out.println(modifieddocument);
}
    public static void therd(String document) {
        String lettersOnly = document.replaceAll("[^a-zA-Z]", "").toLowerCase();
        String formatted = String.join("/", lettersOnly.split("(?<=\\G.{3})"));
        System.out.println(formatted);
    }

    public static void fourth(String document) {
        String lettersOnly = document.replaceAll("[^a-zA-Z]", "").toUpperCase();
        StringBuilder sb = new StringBuilder("Letters:");
        for (int i = 0; i < lettersOnly.length(); i++) {
            if (i > 0 && (i % 3 == 0 || i % 3 == 0)) {
                sb.append("/");
            }
            sb.append(lettersOnly.charAt(i));
        }
        System.out.println(sb.toString());
    }

    public static void fifth(String document) {
        if (document.toLowerCase().contains("abc")) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    public static void sixth(String document) {
        if (document.startsWith("555")) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    public static void seventh(String document) {
        if (document.endsWith("1a2b")) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
