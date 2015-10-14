import java.math.BigInteger;


public class Bignumber {
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return s.toString();
    }
    private String s;
    private String sum="";
    private int temp1;
    private int temp2;
    private boolean falg=false;
    private Bignumber temp;
    public Bignumber(String string) {
        setS(string);
    }
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Bignumber b=new Bignumber("1111");
        Bignumber b1=new Bignumber("9999");
        //        BigInteger sysb= new BigInteger("1111111111111111111111111111111111111111213123123123123123123123123111111");
        //        BigInteger sysb1=new BigInteger("229");
        //        System.out.println(sysb.add(sysb1));
        //        b.pase(b1);
        b.Multiply(b1);
    }
    private void Multiply(Bignumber b1) {
        // TODO Auto-generated method stub
        String s2=b1.getS();
        temp=this;
        int length=s2.length();
        int[] mm=new int[length];
        for(int i=0;i<length;i++)
        {
            char c1= s2.charAt(length-i-1);
            int int1=Integer.valueOf(String.valueOf(c1));
            mm[i]=int1;
        }
        int i=0;
        int c=mm[i]-1;
        for(int j=0;j<=c;c--){
            if((c)==0)
            {
                for(int z=1;z<=length-1;z++){
                    if(mm[i+z]>=1)
                    {
                        mm[i+z]=mm[i+z]-1;
                        c=9;
                        j=0;
                    }
                }
            }
            temp=temp.pase(this);
        }

        System.out.println(temp.toString());
    }
    private Bignumber pase(Bignumber b1) {
        String s2=b1.getS();
        if(s.length()<=s2.length())
        {
            String st=s;
            s=s2;
            s2=st;
            
            for(int i=0;i<s2.length();i++)
            {
                char c1= s.charAt(s.length()-i-1);
                char c2= s2.charAt(s2.length()-i-1);
                int int1=Integer.valueOf(String.valueOf(c1));
                int int2=Integer.valueOf(String.valueOf(c2));
                if(!falg){
                    if(int1+int2>=10)
                    {
                        temp1 = (int1+int2)%10;
                        falg=true;
                        sum=temp1+sum;
                    }
                    else{
                        sum=(int1+int2)+sum;
                    }
                }
                else{
                    if(int1+int2>=10)
                    {
                        temp1 = (int1+int2+1)%10;
                        falg=true;
                        sum=temp1+sum;
                    }
                    else{
                        sum=(int1+int2+1)+sum;
                        falg=false;
                    }
                }
            }
            sum=s.substring(0, s.length()-s2.length())+sum;
        }

        return new Bignumber(sum);
    }
    public String getS() {
        return s;
    }
    public void setS(String s) {
        this.s = s;
    }

}
