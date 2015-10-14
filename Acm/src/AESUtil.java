
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class AESUtil {
    private static final String TRANSFORMATION = "AES/CBC/PKCS5Padding";
    private static final String ALGORITHM_NAME = "AES";
    public static final String SECRET_KEY = "eb6b382c544cf88af5ee6591215156b90311117";

    public static byte[] decrypt(byte[] key, byte[] input) throws Exception {
        return decrypt(key, key, input);
    }

    public static byte[] encrypt(byte[] key, byte[] input) throws Exception {
        return encrypt(key, key, input);
    }

    public static byte[] encrypt(byte[] iv, byte[] key, byte[] input) throws Exception {
        SecretKeySpec localSecretKeySpec = new SecretKeySpec(key, ALGORITHM_NAME);
        Cipher localCipher = Cipher.getInstance(TRANSFORMATION);
        IvParameterSpec localIvParameterSpec = new IvParameterSpec(iv);
        localCipher.init(Cipher.ENCRYPT_MODE, localSecretKeySpec, localIvParameterSpec);
        byte[] arrayOfByte = localCipher.doFinal(input);
        return arrayOfByte;
    }

    public static byte[] decrypt(String iv, String key, byte[] input) throws Exception {
        return decrypt(iv.getBytes(), key.getBytes(), input);
    }

    public static byte[] decrypt(byte[] iv, byte[] key, byte[] input) throws Exception {
        SecretKeySpec localSecretKeySpec = new SecretKeySpec(key, ALGORITHM_NAME);
        Cipher localCipher = Cipher.getInstance(TRANSFORMATION);
        IvParameterSpec localIvParameterSpec = new IvParameterSpec(iv);
        localCipher.init(Cipher.DECRYPT_MODE, localSecretKeySpec, localIvParameterSpec);
        byte[] arrayOfByte = localCipher.doFinal(input);
        return arrayOfByte;
    }

    public static byte[] getDefaultSecretKey() {
        return md5(SECRET_KEY);
    }

    private static byte[] md5(String message) {
        byte[] bytes = message.getBytes();
        MessageDigest messageDigest;
        try {
            messageDigest = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            return null;
        }
        messageDigest.update(bytes);
        return messageDigest.digest();
    }
}
