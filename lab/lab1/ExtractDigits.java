package lab.lab1;

public class ExtractDigits {
    public static void main(String[] args) {
        int n = 123456;
        String a = String.valueOf(n);

        for (int i = a.length()-1; i >= 0; i--) {
            System.out.print(a.charAt(i)+" ");
        }
    }
}
