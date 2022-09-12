import java.util.Scanner;

// bit.ly/oop22-xo

enum CellStatus {
  EMPTY, 
  X, 
  O
}

class Cell {

}

class Board {
  CellStatus b[] = {CellStatus.EMPTY, CellStatus.EMPTY, CellStatus.EMPTY, CellStatus.EMPTY, CellStatus.EMPTY, CellStatus.EMPTY, CellStatus.EMPTY, CellStatus.EMPTY, CellStatus.EMPTY};

  public boolean takeMove(int x, int y, CellStatus turn){
    if(x < 1 || 3 < x || y < 1 || 3 < y){
      System.out.println("Invalid cell. Try again.");
      return false;
    }
    else{
      int cell = (x - 1) * 3 + (y - 1);
      if(b[cell] != CellStatus.EMPTY){
        System.out.println("Cell not empty. Try again.");
        return false;
      }
      else {
        b[cell] = turn;
        for(int i = 0; i < 3; i ++){
          for(int j = 0; j < 3; j ++){
            if(b[i * 3 + j] == CellStatus.EMPTY)
              System.out.print("[ ]");
            else if(b[i * 3 + j] == CellStatus.X)
              System.out.print("[X]");
            else
              System.out.print("[O]");
          }
          System.out.println("");
        }
      }
      return true;
    }
  }

  public boolean GameEnded(){
    for(int i = 0; i < 4; i ++){
      if(b[i] == b[4] && b[4] == b[8 - i] && b[i] != CellStatus.EMPTY)
        return true;
    }
    for(int i = 0; i < 9; i += 3){
      if(b[i] == b[i + 1] && b[i + 1] == b[i + 2] && b[i] != CellStatus.EMPTY)
        return true;
    }
    for(int i = 0; i < 3; i ++){
      if(b[i] == b[i + 3] && b[i + 3] == b[i + 6] && b[i] != CellStatus.EMPTY)
        return true;
    }
    return false;
  }
}

public class TicTacToe {
  
  public static void main(String[] args) {
    Board board = new Board();
    Scanner scanner = new Scanner(System.in);
    CellStatus turn = CellStatus.X;
    int moveCount = 0;
    
    // game loop
    while(board.GameEnded() == false || moveCount == 9){  
      if(turn == CellStatus.X) 
        System.out.println("X move");
      else  
        System.out.println("O move");

      int x = scanner.nextInt();
      int y = scanner.nextInt();

      boolean validMove = board.takeMove(x, y, turn);

      if(validMove) {
        if(turn == CellStatus.X)
          turn = CellStatus.O;
        else turn = CellStatus.X;
        moveCount ++;
      }
    }
    
    if(board.GameEnded()){
      if(turn == CellStatus.X)
        System.out.println("O win");
      else
        System.out.println("X win");
    }
    else{
      System.out.println("Game tied");
    }

  }
}