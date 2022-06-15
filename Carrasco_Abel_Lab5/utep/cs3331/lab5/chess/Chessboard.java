package utep.cs3331.lab5.chess;

import org.xml.sax.SAXException;
import utep.cs3331.lab5.players.NotValid;
import utep.cs3331.lab5.players.UserMenu;

import javax.swing.*;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.awt.*;
import java.io.IOException;
import java.util.*;
import java.util.List;

public class Chessboard
{
    public void chessMethod()
    {
        try {
            String decision;
            do {
                JFrame frame = new JFrame();  // Creating graphic applications
                JPanel panel = new JPanel(); // Creating the display
                JLabel label = new JLabel(); // Creating the label

                frame.setTitle("CHESSBOARD");
                frame.setVisible(true);
                frame.setSize(800, 800);
                frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

                // Uploading my image
                label.setIcon(new ImageIcon("C:\\Users\\Abel\\IdeaProjects\\Abel\\src\\com\\chessGUI\\Chessboard.jpg"));
                panel.add(label);
                frame.add(panel);
                frame.validate();

                Scanner input = new Scanner(System.in);

                System.out.println("=========CHESS PIECES =========");

                // Created an ArrayList with the type of String using piece
                ArrayList<String> piece = new ArrayList<>();

                // Adding the pieces into an Array List
                piece.add("rook");
                piece.add("pawn");
                piece.add("knight");
                piece.add("bishop");
                piece.add("queen");
                piece.add("king");

                // Created a list using a For-each Loop to print out each piece that is added into the Array List
                for (String list : piece)
                {
                    System.out.println(list);
                }

                System.out.println("===============================");


                System.out.println("Which peace do you want ");
                String type = input.nextLine();

                new NotValid().notValidPiece(type);

                System.out.println("What color of the piece ");
                String color = input.nextLine();

                new NotValid().notValidColor(color);

                System.out.println("=========CHESSBOARD===========");

                // Created LinkedList's with the types of Character and Integer for x and y
                LinkedList<Character> x = new LinkedList<>();
                LinkedList<Integer> y = new LinkedList<>();

                // Adding the characters into the LinkedList
                x.add('a');
                x.add('b');
                x.add('c');
                x.add('d');
                x.add('e');
                x.add('f');
                x.add('g');
                x.add('h');

                // Adding the integers into the LinkedList
                y.add(1); // 0
                y.add(2); // 1
                y.add(3); // 2
                y.add(4); // 3
                y.add(5); // 4
                y.add(6); // 5
                y.add(7); // 6
                y.add(8); // 7

                // Creating an iterator for iterating y
                Iterator iteratingY = y.iterator();

                // Iterating each one while y has a next one and printing them out vertically
                while(iteratingY.hasNext())
                {
                    System.out.println(y.get(7)+"|_|#|_|#|_|#|_|#|_|#|_|");
                    System.out.println(y.get(6)+"|#|_|#|_|#|_|#|_|#|_|#|");
                    System.out.println(y.get(5)+"|_|#|_|#|_|#|_|#|_|#|_|");
                    System.out.println(y.get(4)+"|#|_|#|_|#|_|#|_|#|_|#|");
                    System.out.println(y.get(3)+"|_|#|_|#|_|#|_|#|_|#|_|");
                    System.out.println(y.get(2)+"|#|_|#|_|#|_|#|_|#|_|#|");
                    System.out.println(y.get(1)+"|_|#|_|#|_|#|_|#|_|#|_|");
                    System.out.println(y.get(0)+"|#|_|#|_|#|_|#|_|#|_|#|");
                    break;
                }

                // Creating an iterator for iterating x
                Iterator iteratingX = x.iterator();

                // Iterating each one while x has a next one and printing them out horizontally
                while(iteratingX.hasNext())
                {
                    System.out.println(x);
                    break;
                }

                System.out.println("=============================");

                switch (type)
                {
                    //=====================================================================================
                    case "rook":
                        switch (color)
                        {
                            case "white":
                                Piece rook = new Rook("white", 'a', 6);
                                rook.whitePieceMove('a', 8);

                                // Created HashMap's with the types of <String,Character> for X and <String,Integer> for Y.
                                HashMap<String, Character> X = new HashMap<String, Character>();
                                HashMap<String, Integer> Y = new HashMap<String, Integer>();

                                // Putting the String's and Characters into X for Hashmap
                                X.put("initialX", 'a');
                                X.put("finalX", 'a');

                                // Putting the String's and Integers into Y for Hashmap
                                Y.put("initialY", 6);
                                Y.put("finalY", 8);

                                // printing them out
                                System.out.println(X);
                                System.out.println(Y);

                                // Aggregating a stream operation with for-each for success
                                List success = Arrays.asList("^","_","_","_","_","^");
                                success.stream().forEach(s->System.out.print(s));

                                break;

                            case "black":
                                Piece secondrook = new Rook("black", 'c', 3);
                                secondrook.blackPieceMove('c', 1);

                                // Created HashMap's with the types of <String,Character> for X and <String,Integer> for Y.
                                HashMap<String, Character> X1 = new HashMap<String, Character>();
                                HashMap<String, Integer> Y1 = new HashMap<String, Integer>();

                                // Putting the String's and Characters into X for Hashmap
                                X1.put("initialX", 'c');
                                X1.put("finalX", 'c');

                                // Putting the String's and Integers into Y for Hashmap
                                Y1.put("initialY", 3);
                                Y1.put("finalY", 1);

                                // printing them out
                                System.out.println(X1);
                                System.out.println(Y1);

                                // Aggregating a stream operation with for-each for success
                                List success1 = Arrays.asList("^","_","_","_","_","^");
                                success1.stream().forEach(s->System.out.print(s));

                                break;
                        }
                        break;
//=====================================================================================
                    case "knight":
                        switch (color)
                        {
                            case "white":
                                Piece knight = new Knight("white", 'd', 3);
                                knight.whitePieceMove('e', 1);

                                // Created HashMap's with the types of <String,Character> for X and <String,Integer> for Y.
                                HashMap<String, Character> X = new HashMap<String, Character>();
                                HashMap<String, Integer> Y = new HashMap<String, Integer>();

                                // Putting the String's and Characters into X for Hashmap
                                X.put("initialX", 'd');
                                X.put("finalX", 'c');

                                // Putting the String's and Integers into Y for Hashmap
                                Y.put("initialY", 3);
                                Y.put("finalY", 1);

                                // printing them out
                                System.out.println(X);
                                System.out.println(Y);

                                // Aggregating a stream operation with for-each for success
                                List success = Arrays.asList("^","_","_","_","_","^");
                                success.stream().forEach(s->System.out.print(s));

                                break;

                            case "black":
                                Piece secondknight = new Knight("black", 'd', 3);
                                secondknight.blackPieceMove('f', 2);

                                // Created HashMap's with the types of <String,Character> for X and <String,Integer> for Y.
                                HashMap<String, Character> X1 = new HashMap<String, Character>();
                                HashMap<String, Integer> Y1 = new HashMap<String, Integer>();

                                // Putting the String's and Characters into X for Hashmap
                                X1.put("initialX", 'd');
                                X1.put("finalX", 'f');

                                // Putting the String's and Integers into Y for Hashmap
                                Y1.put("initialY", 3);
                                Y1.put("finalY", 2);

                                // printing them out
                                System.out.println(X1);
                                System.out.println(Y1);

                                // Aggregating a stream operation with for-each for success
                                List success1 = Arrays.asList("^","_","_","_","_","^");
                                success1.stream().forEach(s->System.out.print(s));

                                break;
                        }
                        break;
//=====================================================================================
                    case "bishop":
                        switch (color)
                        {
                            case "white":
                                Piece bishop = new Bishop("white", 'a', 1);
                                bishop.whitePieceMove('c', 3);

                                // Created HashMap's with the types of <String,Character> for X and <String,Integer> for Y.
                                HashMap<String, Character> X = new HashMap<String, Character>();
                                HashMap<String, Integer> Y = new HashMap<String, Integer>();

                                // Putting the String's and Characters into X for Hashmap
                                X.put("initialX", 'a');
                                X.put("finalX", 'c');

                                // Putting the String's and Integers into Y for Hashmap
                                Y.put("initialY", 1);
                                Y.put("finalY", 3);

                                // printing them out
                                System.out.println(X);
                                System.out.println(Y);

                                // Aggregating a stream operation with for-each for success
                                List success = Arrays.asList("^","_","_","_","_","^");
                                success.stream().forEach(s->System.out.print(s));

                                break;

                            case "black":
                                Piece secondbishop = new Bishop("black", 'e', 8);
                                secondbishop.blackPieceMove('b', 5);

                                // Created HashMap's with the types of <String,Character> for X and <String,Integer> for Y.
                                HashMap<String, Character> X1 = new HashMap<String, Character>();
                                HashMap<String, Integer> Y1 = new HashMap<String, Integer>();

                                // Putting the String's and Characters into X for Hashmap
                                X1.put("initialX", 'e');
                                X1.put("finalX", 'b');

                                // Putting the String's and Integers into Y for Hashmap
                                Y1.put("initialY", 8);
                                Y1.put("finalY", 5);

                                // printing them out
                                System.out.println(X1);
                                System.out.println(Y1);

                                // Aggregating a stream operation with for-each for success
                                List success1 = Arrays.asList("^","_","_","_","_","^");
                                success1.stream().forEach(s->System.out.print(s));

                                break;
                        }
                        break;
//=====================================================================================
                    case "pawn":
                        switch (color)
                        {
                            case "white":
                                Piece pawn = new Pawn("white", 'a', 1);
                                pawn.whitePieceMove('a', 2);

                                // Created HashMap's with the types of <String,Character> for X and <String,Integer> for Y.
                                HashMap<String, Character> X = new HashMap<String, Character>();
                                HashMap<String, Integer> Y = new HashMap<String, Integer>();

                                // Putting the String's and Characters into X for Hashmap
                                X.put("initialX", 'a');
                                X.put("finalX", 'a');

                                // Putting the String's and Integers into Y for Hashmap
                                Y.put("initialY", 1);
                                Y.put("finalY", 2);

                                // printing them out
                                System.out.println(X);
                                System.out.println(Y);

                                // Aggregating a stream operation with for-each for success
                                List success = Arrays.asList("^","_","_","_","_","^");
                                success.stream().forEach(s->System.out.print(s));

                                break;

                            case "black":
                                Piece secondpawn = new Pawn("black", 'b', 2);
                                secondpawn.blackPieceMove('b', 1);

                                // Created HashMap's with the types of <String,Character> for X and <String,Integer> for Y.
                                HashMap<String, Character> X1 = new HashMap<String, Character>();
                                HashMap<String, Integer> Y1 = new HashMap<String, Integer>();

                                // Putting the String's and Characters into X for Hashmap
                                X1.put("initialX", 'a');
                                X1.put("finalX", 'a');

                                // Putting the String's and Integers into Y for Hashmap
                                Y1.put("initialY", 5);
                                Y1.put("finalY", 3);

                                // printing them out
                                System.out.println(X1);
                                System.out.println(Y1);

                                // Aggregating a stream operation with for-each for success
                                List success1 = Arrays.asList("^","_","_","_","_","^");
                                success1.stream().forEach(s->System.out.print(s));

                                break;
                        }
                        break;
//=====================================================================================
                    case "queen":
                        switch (color)
                        {
                            case "white":
                                Piece queen = new Queen("white", 'a', 8);
                                queen.whitePieceMove('c', 1);


                                break;

                            case "black":
                                Piece secondqueen = new Queen("black", 'a', 8);
                                secondqueen.blackPieceMove('c', 1);

                                // Black queen cant move here

                                break;
                        }
                        break;
//=====================================================================================
                    case "king":
                        switch (color)
                        {
                            case "white":
                                Piece king = new King("white", 'g', 1);
                                king.whitePieceMove('h', 2);

                                // Created HashMap's with the types of <String,Character> for X and <String,Integer> for Y.
                                HashMap<String, Character> X = new HashMap<String, Character>();
                                HashMap<String, Integer> Y = new HashMap<String, Integer>();

                                // Putting the String's and Characters into X for Hashmap
                                X.put("initialX", 'g');
                                X.put("finalX", 'h');

                                // Putting the String's and Integers into Y for Hashmap
                                Y.put("initialY", 1);
                                Y.put("finalY", 2);

                                // printing them out
                                System.out.println(X);
                                System.out.println(Y);

                                // Aggregating a stream operation with for-each for success
                                List success = Arrays.asList("^","_","_","_","_","^");
                                success.stream().forEach(s->System.out.print(s));

                                break;

                            case "black":
                                Piece secondking = new King("black", 'a', 7);
                                secondking.blackPieceMove('a', 6);

                                // Created HashMap's with the types of <String,Character> for X and <String,Integer> for Y.
                                HashMap<String, Character> X1 = new HashMap<String, Character>();
                                HashMap<String, Integer> Y1 = new HashMap<String, Integer>();

                                // Putting the String's and Characters into X for Hashmap
                                X1.put("initialX", 'a');
                                X1.put("finalX", 'a');

                                // Putting the String's and Integers into Y for Hashmap
                                Y1.put("initialY", 7);
                                Y1.put("finalY", 6);

                                // printing them out
                                System.out.println(X1);
                                System.out.println(Y1);

                                // Aggregating a stream operation with for-each for success
                                List success1 = Arrays.asList("^","_","_","_","_","^");
                                success1.stream().forEach(s->System.out.print(s));

                                break;
                        }
                        break;
                }

                System.out.println(" Do you want to save game? \n =================== \t \n yes \t \n or \t \n no \t \n =================== \t");
                decision = input.nextLine();

                if (decision.equals("yes"))
                {
                    UserMenu.savedGame(type, color);
                }
                else if(decision.equals("no"))
                {
                    System.out.println("game not saved");
                }
                else
                {
                    System.out.println("error try again.");
                    System.exit(0);
                }

                System.out.println("Do you want to continue \n =================== \t \n yes \t \n or \t \n no \t \n =================== \t");
                decision = input.nextLine();
            } while (decision.equals("yes"));

            if(decision.equals("no"))
            {
                System.out.println("Thank you come again");
                System.exit(0);
            }

        } catch (InputMismatchException | ParserConfigurationException | IOException | SAXException | TransformerException e)
        {
            System.out.println("error try again.");
        }
    }

    private void setDefaultCloseOperations(int exitOnClose)
    {

    }
}



























