public class pyramid
{
    public static int pyramid_1(int n)
    {
        for (int i = 0; i < n; i++)
        {
            System.out.println(" ");
            for (int k=0; k<n-i;k++)
            {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++)
            {
                System.out.print(" *");
            }
        }
        return 0;
    }
    public static void main(String args[])
    {
        int n=4;
        int output_pyramid = pyramid_1(n);
    }
}


