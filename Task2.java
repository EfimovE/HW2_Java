// Напишите программу, чтобы проверить, являются ли две данные строки 
// вращением друг друга.

package HW2_Java;

public class Task2 {
    public static void main(String[] args) {
        String str = "java";
        String str2 = "avaj";
        isStringReverse (str, str2);

    }
    static void isStringReverse (String s1, String s2) {
        StringBuilder sB = new StringBuilder();
        for (int index = 0; index < s1.length(); index++) {
            sB.append(s1.charAt(s1.length() - index - 1));
        }        
        System.out.println(sB.toString());
        System.out.println(s2);
        if (sB.toString().equals(s2)) {
            System.out.println("Строка 1 является реверсом строки 2.");
        } else {
            System.out.println("Строка 1 не является реверсом строки 2.");
        }
    }
}
