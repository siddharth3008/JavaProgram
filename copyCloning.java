import java.util.Scanner;

public class copyCloning
{
    static void printArray(int[]arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]+" ");
        }
        System.out.println( );
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n=");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter "+n+" element");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("original array element are=");
         printArray(arr);
        int []arr_2=arr;
        System.out.println("copied array are=");
        printArray(arr_2);
        arr_2[0]=14;
        arr_2[1]=15;
        System.out.println("original array=");
        printArray(arr);
        System.out.println("after changing array2 element=");
        printArray(arr_2);
    }

}
