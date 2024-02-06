/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Libraries;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;

/**
 *
 * @author surya
 */
public class Crypt {
    public static byte[] Encrypt(String data, SecretKey getKey, Cipher getCipher) throws Exception{
        getCipher.init(Cipher.ENCRYPT_MODE, getKey);
        return getCipher.doFinal(data.getBytes());
    }
    
    public static String Decrypt(byte[] EncryptedData, SecretKey getKey, Cipher getCipher) throws Exception {
        getCipher.init(Cipher.DECRYPT_MODE, getKey);
        byte[] decryptedData = getCipher.doFinal(EncryptedData);
        return new String(decryptedData);
    }
}
