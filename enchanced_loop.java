public class enchanced_loop {
    public static void main(String[] args) 
    {
        
        int d[][] = {{1,2,3},{2,3,4,5},{23,4,5,6,7}};
        
        for(int i = 0; i< d.length;i++)
        {
            for (int j = 0; j<d[i].length;j++)
            {
                System.out.print(" "+d[i][j]);
            }
            System.out.println(" ");
        }

        for(int k[]:d)
        {
            for (int l:k)
            {
                System.out.print(" "+l);
            }
            System.out.println("");
        }
    }
}
