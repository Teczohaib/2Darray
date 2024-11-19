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
    
    int rmin=0;
    int cmin=0;
    int rmax=n-1;
    int cmax=m-1;
    int count=0;
    while(count<n*m){
        for(int row=rmin;row<=rmax&& count <n*m;row++){
            System.out.println(a1[row][cmin]);
            count++;
        }
        cmin++;
        for(int col=cmin;col<=cmax&&count<n*m;col++){
            System.out.println(a1[rmax][col]);
            count++;
        }
        rmax--;
        for(int row=rmax;row>=rmin && count <n*m;row--){
            System.out.println(a1[row][cmax]);
            count++;
        }
    }
    }
}