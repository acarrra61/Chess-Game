// Dr. Oscar A. Mondragon
// Final Lab Assignment
// CS3331 Spring 2020

package utep.cs3331.lab5.players;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;
import utep.cs3331.lab4.chess.Chessboard;

import javax.swing.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class UserMenu extends JFrame
{
    public static void userName(String username, String expertise) throws ParserConfigurationException, IOException, SAXException, TransformerException
    {
        try {
            String filelocation = "User.xml";
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(filelocation); // Reading and parsing into DOM

            // get the root element
            Node Chess = doc.getFirstChild(); // Getting the <Chess>

            // get the user element by tag name directly
            Node users = doc.getElementsByTagName("users").item(0);

            // add a new node to user
            Element name = doc.createElement("name");
            name.appendChild(doc.createTextNode(username));
            users.appendChild(name);

            // add a new node to level
            Element level = doc.createElement("level");
            level.appendChild(doc.createTextNode(expertise));
            users.appendChild(level);

            // write the content into xml file
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File(filelocation));
            transformer.transform(source, result);

        } catch (ParserConfigurationException pce)
        {
            pce.printStackTrace();
        } catch (TransformerException tfe)
        {
            tfe.printStackTrace();
        } catch (IOException ioe)
        {
            ioe.printStackTrace();
        } catch (SAXException sae)
        {
            sae.printStackTrace();
        }
    }

    public static void newGame(String username) throws ParserConfigurationException, IOException, SAXException, TransformerException
    {
        try {
            String filelocation = "NewGame.xml";
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(filelocation); // Reading and parsing into DOM

            // get the user element by tag name directly
            Node users = doc.getElementsByTagName("users").item(0);

            // add a new node to user
            Element name = doc.createElement("name");
            name.appendChild(doc.createTextNode(username));
            users.appendChild(name);

            // write the content into xml file
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File(filelocation));
            transformer.transform(source, result);

        } catch (ParserConfigurationException pce)
        {
            pce.printStackTrace();
        } catch (TransformerException tfe)
        {
            tfe.printStackTrace();
        } catch (IOException ioe)
        {
            ioe.printStackTrace();
        } catch (SAXException sae)
        {
            sae.printStackTrace();
        }
    }

    public static void savedGame(String typeofpiece, String piececolor) throws ParserConfigurationException, IOException, SAXException, TransformerException
    {
        {
            try {
                String filelocation = "SavedGame.xml";
                DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
                DocumentBuilder builder = factory.newDocumentBuilder();
                Document doc = builder.parse(filelocation); // Reading and parsing into DOM

                // get the game element by tag name directly
                Node game = doc.getElementsByTagName("game").item(0);

                // add a new node to user
                Element piece = doc.createElement("piece");
                piece.appendChild(doc.createTextNode(typeofpiece));
                game.appendChild(piece);

                // add a new node to user
                Element color = doc.createElement("color");
                color.appendChild(doc.createTextNode(piececolor));
                game.appendChild(color);

                // write the content into xml file
                TransformerFactory transformerFactory = TransformerFactory.newInstance();
                Transformer transformer = transformerFactory.newTransformer();
                DOMSource source = new DOMSource(doc);
                StreamResult result = new StreamResult(new File(filelocation));
                transformer.transform(source, result);

            } catch (ParserConfigurationException pce)
            {
                pce.printStackTrace();
            } catch (TransformerException tfe)
            {
                tfe.printStackTrace();
            } catch (IOException ioe)
            {
                ioe.printStackTrace();
            } catch (SAXException sae)
            {
                sae.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws ParserConfigurationException, TransformerException, SAXException, IOException
    {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name.");
        String name = input.nextLine();

        System.out.println("Enter expertise level. \n =================== \t  \n novice \t \n medium \t \n advance \t \n master \t \n =================== \t");
        String level = input.nextLine();

        new NotValid().notValidLevel(level);

        userName(name,level); // XML method

        System.out.println("Hello "+name+ " Do you want to start a \n =================== \t \n new game \t \n or \t \n saved game \t \n =================== \t");
        String game = input.nextLine();

        switch(game)
        {
            case "new game":
                newGame(name); // XML method
                new Chessboard().chessMethod();
                break;

            case "saved game":
                new Chessboard().chessMethod();
                break;
        }
        System.out.println("error try again");
    }
}
