import java.io.*;
/**
 * Driver class holding main to run a program reading in a text file
 * and displaying a cross-reference table and query options
 * 
 * @author Darren Hoffmann-Marks 
 * @version 08/11/16
 */
public class Driver
{
    /**
     * Main function to run program
     * @param args - unused
     */
    public static void main(String[] args) throws IOException
    {
        PrintWriter pw = new PrintWriter(new FileWriter("csis.txt"));
        
        Hash hashTable = new Hash(pw);
        hashTable.getHashTable();           // gets hash table
        
        Xref crossRef = new Xref(pw);
        crossRef.printFile();               // prints file read in
        crossRef.crossReference();          // prints cross-reference table of file       
        
        ObjectBinaryTree BST = crossRef.getTree();
        Query query = new Query(BST, pw);       
        query.queryWord();                  // allows user to query words in file
        
        hashTable.printTable();             // prints hash table
        hashTable.printNumCollisions();     // prints number of collisons
        hashTable.hashDescription();
        
        pw.close();
    }
    
}
