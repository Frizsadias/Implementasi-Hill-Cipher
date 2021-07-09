package Hillcipher;

public class Const {
    public static final String keyPair = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890`~!@#$%^&amp;*()_-+={}[]|\\:;’&lt;&gt;,.?/ \n\t";
    public static final String zeroKeyCode = "M";
    public static final String randomKey[] ={"A", "B", "C", "D", "E"};
    public static final Integer encryptKeyPair[][] = {
            {3,2},
            {7,5}
    };
    public static final Integer decryptKeyPair[][] = {
            {3, -2},
            {-7, 5}
    };

}
