
package pattern;
import java.util.Scanner;
public class starpattern {
    public static void inverttraingle(int m){
        int max = m+1;
        for(int i =1;i<=m;i++){
            for(int j = 1;j<=m;j++){
                if(i+j>=max){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void cross(int m){
        int mid = m+1;
        for(int i =0;i<m;i++){
            for(int j = 0;j<m;j++){
                if((j==i)||(j==m-i-1)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void plus(int m){
        int mid = (m/2)+1;
        for(int i =1;i<=m;i++){
            for(int j = 1;j<=m;j++){
                if((j==mid)||(i==mid)){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void binarytria(int m ){

        for(int i=1;i<=m;i++){
            for(int j = 1 ;j<=i;j++){
                if((j%2==0 && i%2==0) || (j%2!=0 && i%2!=0)){
                    System.out.print(1+" ");
                }else{
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }
    }

    public static void numbertria(int m ){
        int num =1;
        for(int i=1;i<=m;i++){
            for(int j = 0 ;j<i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }

    public static void tria(int m){

        for(int i=1;i<=m;i++){
            for(int j = i ;j<=m;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void Stringprint(int m){
        for(int i=0;i<m;i++){
            for(int j = 0;j<=m;j++){
                System.out.print((char)(j+65)+" ");
            }
            System.out.println();
        }
    }

    public static void numberSqueare(int m ,int n){
      for(int i =0;i<m;i++){
          for(int j = 1 ;j<=n;j++){
              System.out.print(j);
          }
          System.out.println();
      }
    }

    public static void print(int m ,int n){
        for(int i = 0;i<=m;i++){
            for(int j= 0;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enetr m");
        int m = sc.nextInt();
        System.out.println("enter n ");
        int n = sc.nextInt();
        sc.close();
           //print(m,n);
          //numberSqueare(m,n);
         //Stringprint(m);
        //tria(m);
        //numbertria(m);
        // binarytria(m);
        // plus(m);
        //cross(m);
        inverttraingle(m);

    }
}
