import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Created by kanov on 2/16/2017.
 */
public class test {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BigInteger x = new BigInteger("5");
        BigInteger y = new BigInteger("2");
        System.out.println(x.divide(y));

    }
}
