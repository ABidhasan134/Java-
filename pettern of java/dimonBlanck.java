public class dimonBlanck {
    public static void main(String[]args)
    {
        int n=9;
        int px=n,py=n;
        //upper hafe
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<n*2;j++)
            {
                if(j==px || j==py)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
               
            }
            px--;
            py++;
            System.out.println();
        }

        int pxx=1,pyy=2*n-1;

         for(int i=0;i<n;i++)
        {
            for(int j=0;j<n*2;j++)
            {
                if(j==pxx || j==pyy)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
               
            }
            pxx++;
            pyy--;
            System.out.println();
        }
    
}
}


   