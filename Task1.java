// Напишите программу на Java, чтобы найти наименьшее окно в строке, содержащей 
// все символы другой строки.

package HW2_Java;

import java.util.Arrays;

public class Task1 {
    static final int no_of_chars = 256;
 
    // Функция для поиска наименьшего окна, содержащего все символы 'pat'
    static String findSubString(String str, String pat)
    {
        int len1 = str.length();
        int len2 = pat.length();
 
// Проверка длины строки
        if (len1 < len2) {
            System.out.println("No such window exists");
            return "";
        }
 
        int hash_pat[] = new int[no_of_chars];
        int hash_str[] = new int[no_of_chars];
 
        // Хранение вхождений 
        for (int i = 0; i < len2; i++)
            hash_pat[pat.charAt(i)]++;
 
        int start = 0, start_index = -1,
            min_len = Integer.MAX_VALUE;
 
        // 
        int count = 0;
        for (int j = 0; j < len1; j++) {
           
            // подсчет вхождений символов из строки
            hash_str[str.charAt(j)]++;
            if (hash_str[str.charAt(j)]
                <= hash_pat[str.charAt(j)])
                count++;
             // если все символы совпадают
            if (count == len2) {

                while (hash_str[str.charAt(start)]
                           > hash_pat[str.charAt(start)]
                       || hash_pat[str.charAt(start)]
                              == 0) {
 
                    if (hash_str[str.charAt(start)]
                        > hash_pat[str.charAt(start)])
                        hash_str[str.charAt(start)]--;
                    start++;
                }
 
                // изменение размера окна
                int len_window = j - start + 1;
                if (min_len > len_window) {
                    min_len = len_window;
                    start_index = start;
                }
            }
        }
    // Окно не найдено
        if (start_index == -1) {
            System.out.println("No such window exists");
            return "";
        }
 // Возвращаемая подстрока, начинающаяся из start_index
// и длина min_len
        return str.substring(start_index,
                             start_index + min_len);
    }
 
    public static void main(String[] args)
    {
        String str = "Welcome to Russia, vjpjapngv dfognoaig osvhois";
        String pat = "uso";
 
        System.out.print(findSubString(str, pat));
    }
}
//     static void findSubString (String s1, String s2) {

//         int len1 = s1.length();
//         int len2 = s2.length();
//         if (len2 > len1) {
//             System.out.println("Совпадений не найдено.");
//         }
//         String[] arr1 = s1.split(" ");
//         String[] arr2 = s2.split(" ");
//         String[] arr3 = new String[arr1.length < arr2.length ? arr1.length : arr2.length];
//         int count = 0;
//         for (int i = 0; i < arr1.length; i++) {
//             for (int j = 0; j < arr2.length; j++) {
//                 if (arr1[i].compareTo(arr2[j]) == 0) {
//                     arr3[count++] = arr1[i];
//                 }
//             }
//         }
//         System.out.println(Arrays.toString(arr3));
        

//     }

//     public static void main(String[] args) {
//         String str = "Welcome to Russia";
//         String str2 = "Welcome to";
//         findSubString (str, str2);


//     }

// }
