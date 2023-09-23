import java.util.Scanner;

public class takingInput {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of element = ");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("enter element in array=");
        {
            for (int i=0;i<arr.length;i++)
            {
                arr[i]=sc.nextInt();
            }
        }
        for (int i=0;i<n;i++)
        {
            System.out.println(arr[i]+" ");
        }

    }
}
