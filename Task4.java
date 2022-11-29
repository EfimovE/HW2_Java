package HW2_Java;

// Дано два числа, например 3 и 56, необходимо составить следующие 
// строки: 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168 Используем 
// метод StringBuilder.append().
// Замените символ “=” на слово “равно”. Используйте методы 
// StringBuilder.insert(),StringBuilder.deleteCharAt().
// *Замените символ “=” на слово “равно”. Используйте методы 
// StringBuilder.replace().
// **Сравнить время выполнения пункта 6 со строкой содержащей 
// 10000 символов "=" средствами String и StringBuilder.
// package HW2_Java;
// **Сравнить время выполнения пунка 6 со строкой содержащей 10000 
// символов "=" средствами String и StringBuilder.

public class Task4 {
    public static void main(String[] args) {
        StringBuilder sB = new StringBuilder();
        int a = 3;
        int b = 56;
        Integer.toString(a);
        Integer.toString(b);
        sB.append(a); sB.append(" + ");
        sB.append(b); sB.append(" = ");
        sB.append(a + b);
        StringBuilder sB1 = new StringBuilder();
        sB1.append(a); sB1.append(" - ");
        sB1.append(b); sB1.append(" = ");
        sB1.append(a - b);
        StringBuilder sB2 = new StringBuilder();
        sB2.append(a); sB2.append(" * ");
        sB2.append(b); sB2.append(" = ");
        sB2.append(a * b);
        System.out.println(sB);
        System.out.println(sB1);
        System.out.println(sB2);
        changeValue (sB.toString());
        changeValue (sB1.toString());
        changeValue (sB2.toString());
        replaceValue(sB.toString());
        replaceValue(sB1.toString());
        replaceValue(sB2.toString());

        String strForCheck = fillString();
        long start = System.currentTimeMillis();
        replaceValue2(strForCheck);
        System.out.println (System.currentTimeMillis() - start);
        start = System.currentTimeMillis();
        replaceStr(strForCheck);
        System.out.println(System.currentTimeMillis() - start);

    }
    static void changeValue(String string){
        StringBuilder sb = new StringBuilder(string);
        int val = sb.indexOf("=");
        sb.deleteCharAt(val);
        sb.insert(val, "равно");
        System.out.println(sb.toString());
    }
    static void replaceValue(String string){
        StringBuilder sb = new StringBuilder(string);
        int val = sb.indexOf("=");
        sb.replace(val, val + 1,"равно" );
        System.out.println(sb.toString());
    }
    static void replaceValue2 (String string){
        StringBuilder sb = new StringBuilder(string);
        int val = sb.indexOf("=");
        sb.replace(val, val + 1,"равно" );
    }
    static String fillString (){
        String str = "";
        for (int index = 0; index < 10000; index++) {
            str += "=";
        }
        return str;
    }
    static String replaceStr(String x){
        x.replace("=", "равно");
        return x;
    }
}

