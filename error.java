
public class error {
    public static void main(String[] args) {
        tinhGiaithua(100);
    }

    public static int tinhGiaithua(int n) {
        int giai_thua = 1;
        if (n == 0 || n == 1) {
            return giai_thua;
        } else {
            for (int i = 2; i <= n; i++) {
                giai_thua *= i;
            }
            return giai_thua;
        }
    }
}
