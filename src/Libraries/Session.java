/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Libraries;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;


/**
 *
 * @author surya
 */
public class Session {
    public static byte[] Token;
    public static Object[] UserInformation;
    
    public static boolean Destroy(){
        Token = null;
        UserInformation = null;
        return true;
    }
    
    
    public static void GenerateSession(String username){
        try {
            SecretKey secretKey = KeyGenerator.getInstance("AES").generateKey();
            Cipher cipher = Cipher.getInstance("AES");

            Token = Crypt.Encrypt(username, secretKey, cipher);
            Object[] myDATA = {Token,secretKey,cipher};
            UserInformation = myDATA;
        } catch (Exception e) {
            Token = null;
        }
    }
}
