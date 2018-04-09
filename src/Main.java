public class Main {
    AES myAES = new AES();

    public static void main(String[] args) {
        byte[]  data;				/* 64-bit AES data */
        byte[]  key;				/* 128-bit AES key */
        byte[]  result;				/* 64-bit AES result */

    }

    public byte[] encrypt(byte[] key, byte[] data){
        byte[]  result;				/* 64-bit AES result */
        myAES.setKey(key);
        result = myAES.encrypt(data);
        return result;
    }

    public byte[] decrypt(byte[] key, byte[] data){
        byte[]  result;				/* 64-bit AES result */
        myAES.setKey(key);
        result = myAES.decrypt(data);
        return result;
    }
}
