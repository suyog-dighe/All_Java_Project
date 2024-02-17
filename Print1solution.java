// time complexity = O(n!)
// check if problem can be solved &  print only 1  solution  to N queens problem
public class Print1solution {
    static  int count;

    public static boolean issafe(char  board[][],int row,int col){
        //vertical up
        for (int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //diagonal left
        for (int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if (board[i][j]=='Q'){
                return false;
            }
        }
        //diagonal right
        for (int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
            if (board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }

    public static boolean nqueen(char board[][], int row){
        //base
        if(row==board.length){
            printboard(board);
            count++;
            return true;
        }
        //column loop
        for (int j=0;j<board.length;j++){
            if(issafe(board,row,j)){
                board[row][j]='Q';
                if(nqueen(board,row+1))
                {
                    return true;
                }
                board[row][j]='x';//backtracking
            }
        }
        return  false;
    }
    public static void printboard(char board[][]){
        System.out.println("-------- chess board-------");
        for (int i=0;i<board.length;i++){
            for (int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=4;
        char board[][]= new char[n][n];
        //initialization
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                board[i][j]='x';
            }
        }
        if(nqueen(board,0)){
            System.out.println("solution is possible");
        }
        else {
            System.out.println("solution is not possible");
        }
        System.out.println("total no of count is :"+count);

    }
}
