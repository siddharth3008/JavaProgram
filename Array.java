public class Array
{
    void multi()
    {
        int [][] arr_1={{10,20,30},{40,50,60},{70,80,90}};
       for (int i=0;i<3;i++)
       {
           for(int j=0;j<3;j++)
           {
               System.out.println(arr_1[i][j]);
           }
       }
    }
    void threeD()
    {
        int [][][] tD=new int [3][3][3];
        tD [0][0][0]=10;
        tD [1][0][0]=20;
        tD [2][0][0]=30;
        System.out.println(tD [0][0][0]);
    }
    void demoArray(){
        int[] arr=new int[6];
        arr[0]=10;
        arr[1]=100;
        arr[3]=170;
        arr[4]=180;
        arr[5]=150;
        for (int array:arr) {
            System.out.println(array);
        }


    }

    public static void main(String[] args) {
        Array obj=new Array();
        obj.multi();

    }
}