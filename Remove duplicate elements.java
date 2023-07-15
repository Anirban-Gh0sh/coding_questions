public class repeated
{
    public static void main(String args[])
    {
        int arr[]={1,11,1,1,1,1,14,5,6,4,3,5,7};
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                arr[j]=-1;
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=-1)
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
