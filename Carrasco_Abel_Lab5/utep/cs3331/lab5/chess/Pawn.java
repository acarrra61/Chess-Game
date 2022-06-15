package utep.cs3331.lab5.chess;

public class Pawn implements Piece
{
    public static String color;
    public static char x;
    public static int y;

    // constructor with 3 parameters used to create new objects
    public Pawn(String newColor, char initialX, int initialY)
    {
        this.color = newColor;
        this.x = initialX;
        this.y = initialY;
    }

    @Override
    public void whitePieceMove(char finalcolumn, int finalrow)
    {
        if (y == 1)
        {
            if (finalcolumn == x)
            {
                if (finalrow == 2 || finalrow == 3)
                {
                    System.out.println("White Pawn(" + x + ")(" + y + ") can move to: (" + finalcolumn + ")(" + finalrow + ")");
                }
                else
                {
                    System.out.println("White Pawn cant move here.");
                }
            }
            else
            {
                System.out.println("White Pawn cant move here.");
            }
        }

        else if (y == 2)
        {
            if (finalcolumn == x)
            {
                if (finalrow == 3 || finalrow == 4)
                {
                    System.out.println("White Pawn(" + x + ")(" + y + ") can move to: (" + finalcolumn + ")(" + finalrow + ")");
                }
                else
                {
                    System.out.println("White Pawn cant move here.");
                }
            }
            else
            {
                System.out.println("White Pawn cant move here.");
            }
        }

        else if (y == 3)
        {
            if (finalcolumn == x)
            {
                if (finalrow == 4 || finalrow == 5)
                {
                    System.out.println("White Pawn(" + x + ")(" + y + ") can move to: (" + finalcolumn + ")(" + finalrow + ")");
                }
                else
                {
                    System.out.println("White Pawn cant move here.");
                }
            }
            else
            {
                System.out.println("White Pawn cant move here.");
            }
        }

        else if (y == 4)
        {
            if (finalcolumn == x)
            {
                if (finalrow == 5 || finalrow == 6)
                {
                    System.out.println("White Pawn(" + x + ")(" + y + ") can move to: (" + finalcolumn + ")(" + finalrow + ")");
                }
                else
                {
                    System.out.println("White Pawn cant move here.");
                }
            }
            else
            {
                System.out.println("White Pawn cant move here.");
            }
        }

        else if (y == 5)
        {
            if (finalcolumn == x)
            {
                if (finalrow == 6 || finalrow == 7)
                {
                    System.out.println("White Pawn(" + x + ")(" + y + ") can move to: (" + finalcolumn + ")(" + finalrow + ")");
                }
                else
                {
                    System.out.println("White Pawn cant move here.");
                }
            }
            else
            {
                System.out.println("White Pawn cant move here.");
            }
        }

        else if (y == 6)
        {
            if (finalcolumn == x)
            {
                if (finalrow == 7 || finalrow == 8)
                {
                    System.out.println("White Pawn(" + x + ")(" + y + ") can move to: (" + finalcolumn + ")(" + finalrow + ")");
                }
                else
                {
                    System.out.println("White Pawn cant move here.");
                }
            }
            else
            {
                System.out.println("White Pawn cant move here.");
            }
        }

        else if (y == 7)
        {
            if (finalcolumn == x)
            {
                if (finalrow == 8)
                {
                    System.out.println("White Pawn(" + x + ")(" + y + ") can move to: (" + finalcolumn + ")(" + finalrow + ")");
                }
                else
                {
                    System.out.println("White Pawn cant move here.");
                }
            }
            else
            {
                System.out.println("White Pawn cant move here.");
            }
        }

        else
        {
            System.out.println("Initial value not correct.");
        }
    }

// ==========================================================================
    @Override
    public void blackPieceMove(char finalcolumn, int finalrow)
    {
        if (y == 8)
        {
            if (finalcolumn == x)
            {
                if (finalrow == 7 || finalrow == 6)
                {
                    System.out.println("Black Pawn(" + x + ")(" + y + ") can move to: (" + finalcolumn + ")(" + finalrow + ")");
                }
                else
                {
                    System.out.println("Black Pawn cant move here.");
                }
            }
            else
            {
                System.out.println("Black Pawn cant move here.");
            }
        }

        else if (y == 7)
        {
            if (finalcolumn == x)
            {
                if (finalrow == 6 || finalrow == 5)
                {
                    System.out.println("Black Pawn(" + x + ")(" + y + ") can move to: (" + finalcolumn + ")(" + finalrow + ")");
                }
                else
                {
                    System.out.println("Black Pawn cant move here.");
                }
            }
            else
            {
                System.out.println("Black Pawn cant move here.");
            }
        }

        else if (y == 6)
        {
            if (finalcolumn == x)
            {
                if (finalrow == 5 || finalrow == 4)
                {
                    System.out.println("Black Pawn(" + x + ")(" + y + ") can move to: (" + finalcolumn + ")(" + finalrow + ")");
                }
                else
                {
                    System.out.println("Black Pawn cant move here.");
                }
            }
            else
            {
                System.out.println("Black Pawn cant move here.");
            }
        }

        else if (y == 5)
        {
            if (finalcolumn == x)
            {
                if (finalrow == 4 || finalrow == 3)
                {
                    System.out.println("Black Pawn(" + x + ")(" + y + ") can move to: (" + finalcolumn + ")(" + finalrow + ")");
                }
                else
                {
                    System.out.println("Black Pawn cant move here.");
                }
            }
            else
            {
                System.out.println("Black Pawn cant move here.");
            }
        }

       else if (y == 4)
        {
            if (finalcolumn == x)
            {
                if (finalrow == 3 || finalrow == 2)
                {
                    System.out.println("Black Pawn(" + x + ")(" + y + ") can move to: (" + finalcolumn + ")(" + finalrow + ")");
                }
                else
                {
                    System.out.println("Black Pawn cant move here.");
                }
            }
            else
            {
                System.out.println("Black Pawn cant move here.");
            }
        }

        else if (y == 3)
        {
            if (finalcolumn == x)
            {
                if (finalrow == 2 || finalrow == 1)
                {
                    System.out.println("Black Pawn(" + x + ")(" + y + ") can move to: (" + finalcolumn + ")(" + finalrow + ")");
                }
                else
                {
                    System.out.println("Black Pawn cant move here.");
                }
            }
            else
            {
                System.out.println("Black Pawn cant move here.");
            }
        }

        else if (y == 2)
        {
            if (finalcolumn == x)
            {
                if (finalrow == 1)
                {
                    System.out.println("Black Pawn(" + x + ")(" + y + ") can move to: (" + finalcolumn + ")(" + finalrow + ")");
                }
                else
                {
                    System.out.println("Black Pawn cant move here.");
                }
            }
            else
            {
                System.out.println("Black Pawn cant move here.");
            }
        }

        else
        {
            System.out.println("Initial value not correct.");
        }
    }
}
