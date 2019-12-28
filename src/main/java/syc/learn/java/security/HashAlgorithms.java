package syc.learn.java.security;

import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

/**
 * 哈希算法（摘要算法）
 * 对任意一组输入数据进行计算，得到一个固定长度的输出摘要
 * 相同的输入一定得到相同的输出
 * 不同的输入大概率得到不同的输出
 * 用途：用户密码加密保存、校验内容是否被篡改
 * 常用算法：MD5、SHA-1、SHA-256、SHA-256、SHA-512等
 * 增强：Hmac
 */
public class HashAlgorithms {
    public static void main(String[] args) throws Exception {
//        testMessageDigest();
//        testHmac();
        testHmacActual();
    }

    private static void testMessageDigest() throws Exception {
        String salt = "d$sJ";
        String plainText = "hello123";
        plainText = salt + plainText;// 加盐抵御彩虹表攻击
        System.out.println(messageDigest(plainText, "MD5"));
        System.out.println(messageDigest2(plainText, "MD5"));
        System.out.println(messageDigest(plainText, "SHA-1"));
        System.out.println(messageDigest2(plainText, "SHA-1"));
        System.out.println(messageDigest(plainText, "SHA-256"));
        System.out.println(messageDigest2(plainText, "SHA-256"));
        System.out.println(messageDigest(plainText, "SHA-512"));
        System.out.println(messageDigest2(plainText, "SHA-512"));
    }

    private static void testHmac() throws Exception {
        String plainText = "hello123";
        System.out.println(hmac(plainText, "HmacMD5"));
        System.out.println(hmac(plainText, "HmacSHA1"));
        System.out.println(hmac(plainText, "HmacSHA256"));
        System.out.println(hmac(plainText, "HmacSHA512"));
    }

    private static void testHmacActual() throws Exception {
        //生成key，保存到数据库中，后面校验，从数据库中取得key
        String key = generatorKey("HmacMD5");
        //生成加密结果，保存到数据库中，后面校验，从数据库取取出key和result，使用hmac算法校验
        String result = hmac("hello123", "HmacMD5", key);
        System.out.println(result);
    }

    /**
     * 使用Java.security.MessageDigest来进行哈希算法加密
     *
     * @param plainText 明文
     * @param algorithm MD5、SHA-1、SHA-256、SHA-256、SHA-512等
     * @return
     * @throws Exception
     */
    private static String messageDigest(String plainText, String algorithm) throws Exception {
        MessageDigest mdAlg = MessageDigest.getInstance(algorithm);
        mdAlg.update(plainText.getBytes(StandardCharsets.UTF_8));
        byte[] digest = mdAlg.digest();

        return new BigInteger(1, digest).toString(16);
    }

    /**
     * 两次update的messageDigest
     *
     * @param plainText
     * @param algorithm
     * @return
     * @throws Exception
     */
    private static String messageDigest2(String plainText, String algorithm) throws Exception {
        MessageDigest mdAlg = MessageDigest.getInstance(algorithm);
        mdAlg.update(plainText.getBytes(StandardCharsets.UTF_8));
        mdAlg.update(plainText.getBytes(StandardCharsets.UTF_8));
        byte[] digest = mdAlg.digest();

        return new BigInteger(1, digest).toString(16);
    }

    /**
     * Hmac算法就是一种基于密钥的消息认证码算法，Hmac算法总是和某种哈希算法配合起来用
     * e.g：
     * HmacMD5可以看作带有一个安全的key的MD5
     * 好处：
     * HmacMD5使用的key长度是64字节，更安全
     * Hmac是标准算法，同样适用于SHA-1等其他哈希算法
     * Hmac输出和原有的哈希算法长度一致
     *
     * @param plainText 明文
     * @param algorithm HmacMD5、HmacSHA1、HmacSHA256、HmacSHA512等
     * @return
     * @throws Exception
     */
    private static String hmac(String plainText, String algorithm) throws Exception {
        KeyGenerator keyGen = KeyGenerator.getInstance(algorithm);
        SecretKey secretKey = keyGen.generateKey();
        System.out.println("key: " + toHexString(secretKey.getEncoded()));
        Mac mac = Mac.getInstance(algorithm);
        mac.init(secretKey);
        mac.update(plainText.getBytes(StandardCharsets.UTF_8));
        byte[] bytes = mac.doFinal();
        return toHexString(bytes);
    }

    /**
     * 在已知key的情况下使用Hmac算法校验
     *
     * @param plainText
     * @param algorithm
     * @param key
     * @return
     * @throws Exception
     */
    private static String hmac(String plainText, String algorithm, String key) throws Exception {
        SecretKey secretKey = new SecretKeySpec(hexStringToByteArray(key), algorithm);
        Mac mac = Mac.getInstance(algorithm);
        mac.init(secretKey);
        mac.update(plainText.getBytes(StandardCharsets.UTF_8));
        byte[] bytes = mac.doFinal();
        return toHexString(bytes);
    }

    private static String generatorKey(String algorithm) throws Exception {
        KeyGenerator keyGen = KeyGenerator.getInstance(algorithm);
        SecretKey secretKey = keyGen.generateKey();
        byte[] keyBytes = secretKey.getEncoded();

        return toHexString(keyBytes);
    }

    private static String toHexString(byte[] bytes) {
        return new BigInteger(1, bytes).toString(16);
    }

    private static byte[] hexStringToByteArray(String hexString) {
        return new BigInteger(hexString, 16).toByteArray();
    }
}
