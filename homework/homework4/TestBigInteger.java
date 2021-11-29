package homework.homework4;
import java.math.BigInteger;
public class TestBigInteger {
    public static void main(String[] args) {
        BigInteger i1= new BigInteger("123456789");
        BigInteger i2= new BigInteger("1234567891234678");
        System.out.println(i1.add(i2));
        System.out.println(i1.multiply(i2));
    }
}
