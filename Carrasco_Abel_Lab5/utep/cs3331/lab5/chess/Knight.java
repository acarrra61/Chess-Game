package utep.cs3331.lab5.chess;

import utep.cs3331.lab5.players.NotValid;

public class Knight implements Piece
{
    public static String color;
    public static char x;
    public static int y;

//    // empty constructor used to initialize the Piece with default values
//    Knight()
//    {
//        this.color = null;
//        this.x = ' ';
//        this.y = 0;
//    }

    // constructor
    public Knight(String newColor, char initialX, int initialY)
    {
        color = newColor;
        x = initialX;
        y = initialY;
    }

    @Override
    public void whitePieceMove(char finalcolumn, int finalrow)
    {
        new NotValid().notValidMovement(x, y);

        int correct = 0;

        // going up to the right.
        for (int i = 0; i < 8; i++)
        {
            if ((((x + i)) == finalcolumn + 1) && (((y + i) == finalrow + 2)))
            {
                correct++;
            }
        }

        // going up to the left
        for (int i = 0; i < 8; i++)
        {
            if ((((x - i)) == finalcolumn - 1) && (((y + i) == finalrow + 2)))
            {
                correct++;
            }
        }

        // going down to the left
        for (int i = 0; i < 8; i++)
        {
            if ((((x - i)) == finalcolumn - 1) && (((y - i) == finalrow - 2)))
            {
                correct++;
            }
        }

        // going down to the right
        for (int i = 0; i < 8; i++)
        {
            if ((((x + i)) == finalcolumn + 1) && (((y - i) == finalrow - 2)))
            {
                correct++;
            }
        }

        if (correct > 0)
        {
            System.out.println("White Knight(" + x + ")(" + y + ") can move to: (" + finalcolumn + ")(" + finalrow + ")");
        }
        else
            {
            System.out.println("White Knight cant move here.");
        }
    }

    // ==========================================================================
    @Override
    public void blackPieceMove(char finalcolumn, int finalrow)
    {
        new NotValid().notValidMovement(x, y);

        int correct = 0;

        // going up to the right.
        for (int i = 0; i < 8; i++)
        {
            if ((((x + i)) == finalcolumn + 1) && (((y + i) == finalrow + 2)))
            {
                correct++;
            }
        }

        // going up to the left
        for (int i = 0; i < 8; i++)
        {
            if ((((x - i)) == finalcolumn - 1) && (((y + i) == finalrow + 2)))
            {
                correct++;
            }
        }

        // going down to the left
        for (int i = 0; i < 8; i++ )
        {
            if ((((x - i)) == finalcolumn - 1) && (((y - i) == finalrow - 2)))
            {
                correct++;
            }
        }

        // going down to the right
        for (int i = 0; i < 8; i++)
        {
            if ((((x + i)) == finalcolumn + 1) && (((y - i) == finalrow - 2)))
            {
                correct++;
            }
        }

        if (correct > 0)
        {
            System.out.println("Black Knight(" + x + ")(" + y + ") can move to: (" + finalcolumn + ")(" + finalrow + ")");
        }
        else
            {
            System.out.println("Black Knight cant move here.");
        }
    }
}