// Напишите программу, чтобы перевернуть строку с помощью рекурсии.

package HW2_Java;

public class Task3 {
    public static void main(String[] args) {
        String str = "Привет, мир! ";
        System.out.println("Исходная строка: " + str);
        String rev = reverseStr(str);
        System.out.println("Реверс строки: " + rev);
    }
    public static String reverseStr (String s1) {
        if (s1.length() <= 1 ) {
            return s1;
        }
        return reverseStr(s1.substring(1)) + s1.charAt(0);   
    }
}
