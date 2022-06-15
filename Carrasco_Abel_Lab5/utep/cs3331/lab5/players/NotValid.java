package utep.cs3331.lab5.players;

public class NotValid
{
    public void notValidLevel(String level)
    {
        if(!level.equals("novice") && !level.equals("medium") && !level.equals("advance") && !level.equals("master"))
        {
            System.out.println("error try again");
            System.exit(0);
        }
    }

    public void notValidPiece(String type)
    {
        if(!type.equals("rook") && !type.equals("knight") && !type.equals("bishop") && !type.equals("queen") && !type.equals("king") && !type.equals("pawn"))
        {
            System.out.println("error try again");
            System.exit(0);
        }
    }

    public void notValidColor(String color)
    {
        if(!color.equals("white") && !color.equals("black"))
        {
            System.out.println("error try again");
            System.exit(0);
        }
    }

    public void notValidMovement(char x, int y)
    {
        if(x != 'a' && x != 'b' && x != 'c' && x != 'd' && x != 'e'&& x != 'f' && x != 'g' && x != 'h')
        {
            System.out.println("You cant move here");
            System.exit(0);
        }
        if(y != 1 && y != 2 && y != 3 && y != 4 && y != 5 && y != 6 && y != 7 && y != 8)
        {
            System.out.println("You cant move here");
            System.exit(0);
        }
    }
}

