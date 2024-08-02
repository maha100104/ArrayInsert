public class Search {
    public static int result(int a[],int capacity,int n,int a1)
    {
        if(n>=capacity)
        {
            return n;
        }
        a[n]=a1;
        return (n+1);
    }


    public static void main(String[] args) {
        int a[]=new int[20];
        a[0]=2;
        a[1]=3;
        a[2]=9;
        a[3]=1;
        a[4]=5;
        int capacity=20;
        int n=5;
        int a1=8;
        int len=result(a,capacity,n,a1);
        for(int i=0;i<len;i++)
        {
            System.out.print(a[i]+" ");
        }

    }
}
/*
output: 2 3 9 1 5 8*/
