package utep.cs3331.lab5.chess;

import utep.cs3331.lab5.players.NotValid;

public class Rook implements Piece
{
    public static String color;
    public static char x;
    public static int y;

    // constructor with 3 parameters to initialize the Piece with default values
    public Rook(String newColor, char initialX, int initialY)
    {
        this.color = newColor;
        this.x = initialX;
        this.y = initialY;
    }

    @Override
    public void whitePieceMove(char finalcolumn, int finalrow)
    {
        new NotValid().notValidMovement(x,y);

        if ((x == finalcolumn) || (y == finalrow))
        {
            System.out.println("White Rook(" + x + ")(" + y + ") can move to: (" + finalcolumn + ")(" + finalrow + ")");
        }
        else
            { System.out.println("White Rook cant move here");
            }
    }

    // ==========================================================================
    @Override
    public void blackPieceMove(char finalcolumn, int finalrow)
    {
        new NotValid().notValidMovement(x,y);

        if ((x == finalcolumn) || (y == finalrow))
            {
                System.out.println("Black Rook(" + x + ")(" + y + ") can move to: (" + finalcolumn + ")(" + finalrow + ")");
            }
            else
                {
                System.out.println("Black Rook cant move here.");
            }
    }
}
