import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5example {
    public static void main(String[] args) {
        String text = "Yellow Supermacy";
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(text.getBytes());
            byte[] digest = md.digest();
            StringBuffer sb = new StringBuffer();
            for (byte b : digest) {
                sb.append(String.format("%02x", b & 0xff));
            }
            System.out.println("MD5 of " + text + " is " + sb.toString());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}