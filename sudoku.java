public class sudoku {

    public static boolean sudokusolver(int sudoku[][],int row,int col){
        //base case
        if(row==9 ){
            return  true;
        }

        //recursion
        int nextrow=row;
        int nextcol=col+1;
        if(nextcol==9){
            nextrow =row+1;
            nextcol=0;
        }
        if (sudoku[row][col] !=0){
            return sudokusolver(sudoku,nextrow,nextcol);
        }

        for (int digit=0;digit<=9;digit++){
            if(issafe(sudoku,row,col,digit)){
                sudoku[row][col] =digit;
                if(sudokusolver(sudoku,nextrow,nextcol)){
                   // System.out.println("------------------------------");
                    return true;
                }
                sudoku[row][col]=0;
            }
        }
         return false;
    }
    public static boolean issafe(int sudoku[][],int row,int col,int digit){
        //for column
         for (int i=0;i<=8;i++){
             if(sudoku[i][col]==digit){
                 return false;
             }
         }
         //for row
         for (int j=0;j<=8;j++){
             if (sudoku[row][j]==digit){
                 return false;
             }

         }
         //grid
        int sr=(row/3)*3;
         int sc=(col/3)*3;
         //3 x 3  grid
         for (int i=sr;i<sr+3;i++){
             for (int j=sc;j<sc+3;j++){
                 if(sudoku[i][j]==digit){
                    // System.out.println("----------------------");
                     return false;
                 }
             }
         }
         return true;
    }
    public static void printsudoku(int sudoku[][]){
        for (int i=0;i<9;i++){
            for (int j=0;j<9;j++){
                System.out.print(sudoku[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int sudoku[][]={
                {0,0,8,0,0,0,0,0,0},
                {4,9,0,1,5,7,0,0,2},
                {0,0,3,0,0,4,1,9,0},
                {1,8,5,0,6,0,0,2,0},
                {0,0,0,0,2,0,0,6,0},
                {9,6,0,4,0,5,3,0,0},
                {0,3,0,0,7,2,0,0,4},
                {0,4,9,0,3,0,0,5,7},
                {8,2,7,0,0,9,0,1,3}
        };
        if (sudokusolver(sudoku,0,0)){
            System.out.println("solution exit");
            printsudoku(sudoku);
        }
        else {
            System.out.println("solution does   not exit");
        }
    }
}