
/**
 * Write a description of class TicTacToeBoard here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TicTacToeBoard
{
    private String[][] board= new String[3][3];
    public TicTacToeBoard()
    {
        board[0][0] = "1";
        board[0][1] = "2";
        board[0][2] = "3";
        board[1][0] = "4";
        board[1][1] = "5";
        board[1][2] = "6";
        board[2][0] = "7";
        board[2][1] = "8";
        board[2][2] = "9";
        
    }
    public void enterx(int pos)
    {
        if (pos==1) 
            board[0][0] = "X"; 
        else if (pos == 2)
            board[0][1] = "X";
        else if (pos == 3)
            board[0][2] = "X";
        else if (pos == 4)
            board[1][0] = "X";
        else if (pos == 5)
            board[1][1] = "X";
        else if (pos == 6)
            board[1][2] = "X";
        else if (pos == 7)
            board[2][0] = "X";
        else if (pos == 8)
            board[2][1] = "X";
        else
            board[2][2] = "X";
            
    }
    public void enter0(int pos)
    {
        int count =1;
        for(int i = 0; 1 < 3; i++){
        for(int j = 0; j < 3; j++)
        if (count ==pos )
        board[i][j] = "O";
        count++;
    }
}
public boolean checkColsForWinner()
{
 for(int i = 0; i < 3; i++)
    {
        int count = 0;
        for(int j = 0; j < 3; j++)
    {
        if (board[j][i].equals("X"))
         count++; 
    }
    if(count == 3)
        return true; 
    //bottom
    }
    return false;
}
public boolean CheckRowsForWinner()
{
 for(int j = 0; j < 3; j++)
    {
        int count = 0;
        for(int i = 0; i < 3; i++)
    {
        if (board[i][j].equals("X"))
         count++; 
    }
    if(count == 3)
        return true; 
    //bottom
    }
    return false;
}
public boolean checkDiagsForWinners()
{
    int count = 0;
    for(int i = 0; i < 3; i++)
   {
        for(int j = 0; j < 3; j++)
        {
            if(1==j)
            {
                if (board[j][i].equals("O"))
                count++;
            }
            if(i + j == 2) 
            {
                if(board [j][i].equals("0"))
                count++;
            }
        }
       
    }
} 
public boolean checkForWinnner()
    {
        if(checkRowsForWinner || checkColsForWinners || checkDiagsForWinner())
        return true; 
        return false;
}
public String toString
{
    String = "";
    for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
                String += board[i][j] + " ";
                matrix += "/n";
        }
        return matrix 
        
}
   

