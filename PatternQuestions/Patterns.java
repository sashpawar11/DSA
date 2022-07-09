class Patterns {

    public static void main(String[] args) {
        // solid rectangle
        int n = 5;
        int m = 9;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<=m; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        // outlined rectangle



        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=m; j++)
            {
                    if(i== 1 | j==1 | i==n | j==m)
                    {
                        System.out.print("*");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                
            }
            System.out.println();
        }
    }

}
