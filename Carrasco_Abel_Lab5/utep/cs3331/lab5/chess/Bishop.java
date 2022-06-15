package utep.cs3331.lab5.chess;

import utep.cs3331.lab5.players.NotValid;

public class Bishop implements Piece
{
    public static String color;
    public static char x;
    public static int y;

    // constructor with 3 parameters used to create new objects
    public Bishop(String newColor, char initialX, int initialY)
    {
        this.color = newColor;
        this.x = initialX;
        this.y = initialY;
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

            if (correct > 0)
            {
                System.out.println("White Bishop(" + x + ")(" + y + ") can move to: (" + finalcolumn + ")(" + finalrow + ")");
            }

            else
                {
                System.out.println("White Bishop cant move here.");
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

            if (correct > 0)
            {
                System.out.println("Black Bishop(" + x + ")(" + y + ") can move to: (" + finalcolumn + ")(" + finalrow + ")");
            }

            else
                {
                System.out.println("Black Bishop cant move here.");
            }
        }
    }

