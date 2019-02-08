
package taller3;

public class Diamante {
    public int n=0;
    public Diamante (int n)
    {
        this.n=n;
    }
    
    public void create ()
    {
        int elements=0;
        for (int i = 1;i<= this.n;i++)
        {
            elements+=2;
            for (int j=1;j< elements;j++)
                System.out.print("*");
                System.out.println(" ");
        }
    }
}
