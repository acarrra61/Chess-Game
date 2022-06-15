package utep.cs3331.lab5.chess;

public class King implements Piece
{
    public static String color;
    public static char x;
    public static int y;

//    // empty constructor used to initialize the Piece with default values
//    King()
//    {
//        this.color = null;
//        this.x = ' ';
//        this.y = 0;
//    }

    // constructor
    public King(String newColor, char initialX, int initialY)
    {
        color = newColor;
        x = initialX;
        y = initialY;
    }

    public void whitePieceMove(char finalcolumn, int finalrow)
    {
        if (finalrow > y + 1 || y > finalrow + 1 || x > 'h' || y > '8' || finalcolumn > 'h' || finalrow > 8)
        {
            System.out.println("Incorrect movement.");
        }
        else
            {
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
                System.out.println("White King(" + x + ")(" + y + ") can move to: (" + finalcolumn + ")(" + finalrow + ")");
            }

            else
                {
                if (correct > 0)
                {
                    System.out.println("White King(" + x + ")(" + y + ") can move to: (" + finalcolumn + ")(" + finalrow + ")");
                }
                else
                {
                    System.out.println("White King cant move here.");
                }
            }
        }
    }

    // ==========================================================================
    @Override
    public void blackPieceMove(char finalcolumn, int finalrow)
    {
        if (finalrow > y + 1 || y > finalrow + 1 || x > 'h' || y > 8 || finalcolumn > 'h' || finalrow > 8)
        {
            System.out.println("Incorrect movement.");
        }
        else
            {
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
                System.out.println("Black King(" + x + ")(" + y + ") can move to: (" + finalcolumn + ")(" + finalrow + ")");
            }

            else
                {
                if (correct > 0)
                {
                    System.out.println("Black King(" + x + ")(" + y + ") can move to: (" + finalcolumn + ")(" + finalrow + ")");
                }
                else
                {
                    System.out.println("Black King cant move here.");
                }
            }
        }
    }
}
