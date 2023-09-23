public class linearSearch
{
    public static void main(String[] args)
    {
        int [] arr={14,25,12,13,15,6,4};
        int element=15;
        int ans=-1;
        for(int i=0;i<arr.length;i++)
        {
            if (arr[i]==element)
            {
               ans=i;
               break;
            }
        }
        if(ans==-1)
        {
            System.out.println("element not found at any index");
        }
        else
        {
            System.out.println("element found at "+ans+"th index");
        }
    }

}
