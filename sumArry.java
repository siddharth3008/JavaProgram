public class sumArry
{
    void sumofArray()
    {
        int [] arr={10,20,30,40};
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
    void maxNO()
    {
        int [] arr={10,2,20,14,15,26};
        int max=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println("max no is="+max);
    }
   void returnIndex(){              //linear search//
       int [] arr={1,5,7,3,8,3};
     int  x=3;      //element found or if not present ans will be element not found
     int ans=-1;
       for(int i=0;i<arr.length;i++)
       {
           if(arr[i]==x)
           {
               ans=i;
               break;

           }
       }
       if(ans==-1)
       {
           System.out.println("elemnet not found");
       }
       else
       {
           System.out.println("index of element is ="+ans);
       }


    }
    public static void main(String[] args)
    {
        sumArry sum=new sumArry();
       //  sum.sumofArray();
       //  sum.maxNO();
        sum.returnIndex();
    }

}
