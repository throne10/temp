
public class Million {

    public static void main(String[] args) {
        int million=10000000;
        for(int i=1;i<=Math.sqrt(million);i++)
        {
            if(million%i==0)
            {
                int j=million/i;
                int k=i;
                if(String.valueOf(j).contains("0")||String.valueOf(i).contains("0"))
                {
                   continue;
                }
                System.out.println(k+" "+j);
            }
        }
    }

}
