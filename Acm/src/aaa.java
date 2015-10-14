

public class aaa {
    private static String password;

    public static void main(String[] args) {
        
        try {
            password = Base64.encodeToString(AESUtil.encrypt(AESUtil.getDefaultSecretKey(), "123".getBytes()));
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(password);
    }
    
}
