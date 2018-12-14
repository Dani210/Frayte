package security;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public final class Hasher
{
    private final static char [] hexAlphabet = "0123456789ABCDEF".toCharArray();

    public static String hash(String password)
            throws NoSuchAlgorithmException
    {
        MessageDigest messageDig = MessageDigest.getInstance("MD5");
        messageDig.update(password.getBytes());
        byte[] digest = messageDig.digest();
        return bytesToHex(digest);
    }

    public static String bytesToHex(byte[] bytes)
    {
        char[] hexChars = new char[bytes.length * 2];
        for (int j = 0; j < bytes.length; j++) {
            int v = bytes[j] & 0xFF;
            hexChars[j * 2] = hexAlphabet[v >>> 4];
            hexChars[j * 2 + 1] = hexAlphabet[v & 0x0F];
        }
        return new String(hexChars);
    }

}
