//Print fibonacci series till n terms
/*import java.util.Scanner;
public class fib
{
    public static void main(String args[])
    {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        int a=0,b=1,c=0;
        System.out.print(a+" ");
        System.out.print(b+" ");
        for(int i=0;i<n-2;i++)
        {
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
}*/
// 0 1 1 2 3 5 8 13 21 34

//Print only the nth term if n=1 so 0th index print if n=2 1st index print else n=3 or 2nd index to n=n or n-1th index
/*import java.util.Scanner;
public class fib
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int a=0,b=1,c=0;
        if(n==1)
        System.out.println(a);
        else if(n==2)
        System.out.println(b);
        else
        {
            for(int i=2;i<n;i++)      //3rd to nth element n-1th index
            {
                c=a+b;
                a=b;
                b=c;
            }
            System.out.println(c);
        }
    }
}*/
//Fibonacci number in a range
public class fib
{
    public static void main(String aargs[])
    {
        int a=0,b=1,c=0;
        int start=0,end=40;
        while(c<=end)
        {
            if(c>=start)
            System.out.print(c+" ");
            a=b;
            b=c;
            c=a+b;
        } 
    }
}
