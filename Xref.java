import java.io.*;
import java.util.*;
/**
 * Gets a cross reference list of every word in a text file
 * 
 * @author Darren Hoffmann-Marks 
 * @version 08/11/16
 */
public class Xref
{
    
    private ObjectBinaryTree refTree;
    private PrintWriter pw;
    /**
     * Constructor to initiate the BST
     */
    public Xref(PrintWriter pw)
    {
        refTree = new ObjectBinaryTree();
        this.pw = pw;
    }
    
    /**
     * Returns the BST
     * @return - the BST "refTree"
     */
    public ObjectBinaryTree getTree()
    {
        return refTree;
    }
    
    
    /**
     * Prints the file line-by-line and outputs the line number beside the lines
     * of text
     */
    public void printFile() throws IOException
    {
        File temp = new File("getty.txt");
        Scanner sc = new Scanner(temp);
        
        int count = 1;
        while (sc.hasNextLine())
        {
            String line = sc.nextLine();
            System.out.print(count +" — ");
            System.out.println(line);
            pw.print(count +" — ");
            pw.println(line);
            count++;
            
        }
        
        sc.close();    
        
    }
  
    /**
     * Creates the cross-reference listm is a BST
     */
    public void crossReference() throws IOException
    {
        File temp = new File("getty.txt");
        Scanner sc = new Scanner(temp);
        
        int lineNumber = 1;             // keeps track of line number
        Hash hash = new Hash(pw); 
        hash.getHashTable();            // gets hash table
        while (sc.hasNextLine())
        {
            String line = sc.nextLine();
            String delims = "[ ,. -;]+";
            String[] tokens = line.split(delims);
            
            for (int i = 0; i < tokens.length; i++)     // grabs each word from line
            {
                if (!hash.checkHash(tokens[i].toLowerCase()))
                {
                    // creates line position object for word linked list
                    LinePosition lPosition = new LinePosition(lineNumber, i+1); 
                    // creates word object for BST
                    Word currentWord = new Word(tokens[i].toLowerCase(), pw);
                    //adds word position to word's linked list
                    currentWord.insertPosition(lPosition);
                    refTree.insertBSTDup(currentWord);
                }
                
            }
                
            
            lineNumber++;
        }
        System.out.println("\nCross Reference List: ");
        System.out.printf("%-13s%-8s%s\n", "WORD", "COUNT", "LINE-POSITION");
        System.out.printf("----------------------------------\n");
        pw.println("\nCross Reference List: ");
        pw.printf("%-13s%-8s%s\n", "WORD", "COUNT", "LINE-POSITION");
        pw.printf("----------------------------------\n");
        
        ObjectTreeNode root = refTree.getRoot();
        refTree.inTrav(root);
        sc.close();
        
    }
    
    
    
    
    
    
}
