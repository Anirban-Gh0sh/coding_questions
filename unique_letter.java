public class unique
{
    public static void main(String args[])
    {
        String s="Leap year";
        s.toLowerCase();
        char ch,ch1;
        for(int i=0;i<s.length();i++)
        {
            ch=s.charAt(i);
            int c=0;
            for(int j=0;j<s.length();j++)
            {
                ch1=s.charAt(j);
                if(ch!=' ' && ch1!=' ')
                {
                    if(ch==ch1)
                    c=c+1;
                }
            }
            if(c==1)
            {
                System.out.println(ch+" is unique");
                
            }
        }
    }
}
