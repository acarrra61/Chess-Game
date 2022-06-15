package utep.cs3331.lab5.chess;

import utep.cs3331.lab5.players.NotValid;

public class Queen implements Piece
{
    public static String color;
    public static char x;
    public static int y;

    // constructor
    public Queen(String newColor, char initialX, int initialY)
    {
        color = newColor;
        x = initialX;
        y = initialY;
    }

    @Override
    public void whitePieceMove(char finalcolumn, int finalrow)
    {
        new NotValid().notValidMovement(x,y);

            int correct = 0;

            // going up to the right.
            for (int i = 0; i < 8; i++)
            {
                if ((((x + i)) == finalcolumn) && (((y + i) == finalrow)))
                {
                    correct++;
                }
            }

            // going up to the left
            for (int i = 0; i < 8; i++)
            {
                if ((((x - i)) == finalcolumn) && (((y + i) == finalrow)))
                {
                    correct++;
                }
            }

            // going down to the left
            for (int i = 0; i < 8; i++)
            {
                if ((((x - i)) == finalcolumn) && (((y - i) == finalrow)))
                {
                    correct++;
                }
            }

            // going down to the right
            for (int i = 0; i < 8; i++)
            {
                if ((((x + i)) == finalcolumn) && (((y - i) == finalrow)))
                {
                    correct++;
                }
            }

            // going up or down or left or right
            if ((x == finalcolumn) || (y == finalrow))
            {
                System.out.println("White Queen(" + x + ")(" + y + ") can move to: (" + finalcolumn + ")(" + finalrow + ")");
            }

            else
                {
                if (correct > 0)
                {
                    System.out.println("White Queen(" + x + ")(" + y + ") can move to: (" + finalcolumn + ")(" + finalrow + ")");
                }
                else
                    {
                    System.out.println("White Queen cant move here.");
                }
            }
        }


    // ==========================================================================
    @Override
    public void blackPieceMove(char finalcolumn, int finalrow)
    {
        new NotValid().notValidMovement(x,y);

            int correct = 0;

            // going up to the right.
            for (int i = 0; i < 8; i++)
            {
                if ((((x + i)) == finalcolumn) && (((y + i) == finalrow)))
                {
                    correct++;
                }
            }

            // going up to the left
            for (int i = 0; i < 8; i++)
            {
                if ((((x - i)) == finalcolumn) && (((y + i) == finalrow)))
                {
                    correct++;
                }
            }

            // going down to the left
            for (int i = 0; i < 8; i++)
            {
                if ((((x - i)) == finalcolumn) && (((y - i) == finalrow)))
                {
                    correct++;
                }
            }

            // going down to the right
            for (int i = 0; i < 8; i++)
            {
                if ((((x + i)) == finalcolumn) && (((y - i) == finalrow)))
                {
                    correct++;
                }
            }

            // going up or down or left or right
            if ((x == finalcolumn) || (y == finalrow))
            {
                System.out.println("Black Queen(" + x + ")(" + y + ") can move to: (" + finalcolumn + ")(" + finalrow + ")");
            }

            else
                {
                if (correct > 0)
                {
                    System.out.println("Black Queen(" + x + ")(" + y + ") can move to: (" + finalcolumn + ")(" + finalrow + ")");
                }
                else
                    {
                    System.out.println("Black Queen cant move here.");
                }
            }
        }
    }
