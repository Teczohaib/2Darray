import java .util.*;
public class main{
    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int m=scn.nextInt();
        int[][]a1=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a1[i][j]=scn.nextInt();

            }
        }
        for (int i =0;i<n;i++){
            for (int j=0;j<m;j++){
                System.out.print(a1[i][j]+"");
            }
            System.out.println();
        }
    }
}