import java.util.*;

class chess_board{
    static int fill_white(int[][] b){
    int counter = 0;
    for(int i=0;i<b.length;i++){
        for(int j=0;j<b.length;j++){
            if(i%2==0){
                if(j%2==0){
                    if(b[i][j]!=1){
                        b[i][j]=1;
                        counter++;
                    }
                }
                else{
                    if(b[i][j]!=0){
                        b[i][j]=0;
                        counter++;
                    }
                }
            }
            else{ 
                if(j%2==0){
                    if(b[i][j]!=0){
                        b[i][j]=0;
                        counter++;
                    }
                }
                else{
                    if(b[i][j]!=1){
                        b[i][j]=1;
                        counter++;
                    }
                }

            }
        }
    }
    return counter;
}

 static int fill_black(int[][] b){
    int counter = 0;
    for(int i=0;i<b.length;i++){
        for(int j=0;j<b.length;j++){
            if(i%2==0){
                if(j%2==0){
                    if(b[i][j]!=0){
                        b[i][j]=0;
                        counter++;
                    }
                }
                else{
                    if(b[i][j]!=1){
                        b[i][j]=1;
                        counter++;
                    }
                }
            }
            else{ 
                if(j%2==0){
                    if(b[i][j]!=1){
                        b[i][j]=1;
                        counter++;
                    }
                }
                else{
                    if(b[i][j]!=0){
                        b[i][j]=0;
                        counter++;
                    }
                }

            }
        }
    }
    return counter;

    
}
public static void main (String[] args) {
                  // Your code here
            Scanner sc = new Scanner(System.in);

            int n = 3;
            int[][] a = {{1,1,1},{1,1,1},{1,1,1}};
            int counter = 0;
            int counter1 = 0;

            // for (int i=0;i<n;i++){
            //     for(int j=0;j<n;j++){
            //         a[i][j] = sc.nextInt();
            //     }
            // }
            int[][] b = new int[n][n];

            for (int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    b[i][j] =a[i][j];
                }
            }
            
                
        counter = fill_white(b);
        counter1 = fill_black(a);

        for (int i=0;i<n;i++){
                for(int j=0;j<n;j++){
            System.out.print(a[i][j]+" ");
                }
                System.out.println();

            }
            System.out.print(counter1);
            System.out.print(counter);
        

        
             
}
        
        
}