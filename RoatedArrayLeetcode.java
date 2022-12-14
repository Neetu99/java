/*public class RoatedArrayLeetcode{
    public static void main(String []args){
   int [][]mat = {{0,0,0},{0,1,0},{1,1,1}};
   int row = mat.length;
   int col = mat[0].length;
   int x=0;
   int[][]target = new int [row][col];
//    1st method
    for(int i =mat.length-1; i>0; i--){
        for(int j=0; j<mat.length; j++){
         target[j][x] = mat[i][j];
        }
        x++;
    }
    for(int i =0; i< mat.length; i++){
        for(int e =0;e< mat[i].length; e++){ 
        System.out.print(target[i][e]+" ");
        }
        System.out.println();
    } 


    // 2nd method
    for(int i=0; i< mat.length; i++){
        for(int m=0; m<mat[i].length; m++){
            mat[i][m]= target[m][i];
        }
    }
    System.out.println();
    for(int i =0; i< mat.length; i++){
        for(int e =0;e< mat[i].length; e++){ 
        System.out.print(mat[i][e]+" ");
        }
        System.out.println();
    }
}
}*/
/* 
[0,0,0]                [1,0,0]
[0,1,0]                [1,1,0]
[1,1,1]                [1,0,0]          */