package utep.cs3331.lab5.chess;

public interface Piece
{
    void whitePieceMove(char finalcolumn, int finalrow);

    void blackPieceMove(char finalcolumn, int finalrow);
}
