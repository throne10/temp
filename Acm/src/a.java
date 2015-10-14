
public class a {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Encrypt Encrypt=new Encrypt();
        Encrypt.setKey("justsy");
        Encrypt.setEncString("111");
        System.out.println(Encrypt.getStrMi());
        String s=Encrypt.getStrMi();
        Encrypt Encrypt1=new Encrypt();
        Encrypt1.setKey("justsy");
        Encrypt1.setDesString(s);
        System.out.println(Encrypt1.getStrM());
    }

}
