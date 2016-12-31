import java.io.*;
import java.util.*;
/**
 * Allows the user to query words from a text file
 * 
 * @author Darren Hoffmann-Marks 
 * @version 08/11/16
 */
public class Query
{
    private ObjectBinaryTree BST;
    private PrintWriter pw;
    
    /**
     * One argument constructor
     * @param BST - BST with words to query
     */
    public Query(ObjectBinaryTree BST, PrintWriter pw)
    {
        this.BST = BST;
        this.pw = pw;
    }
    
    /**
     * Will query a word from the BST and output it's information
     */
    public void queryWord()
    {
        Scanner sc = new Scanner(System.in);
        String queryW;
        
        System.out.println();
        pw.println();
        do
        {
            System.out.print("Enter Word to Query (0 to exit): ");
            pw.print("Enter Word to Query (0 to exit): ");
            queryW = sc.nextLine();
            pw.println(queryW);
            if (!queryW.equals("0"))
            {
                ObjectTreeNode temp = BST.searchBST(new Word(queryW, pw));
                if (temp != null) {
                    Word nodeInfo = (Word)temp.getInfo();
                    System.out.printf("\n%-13s%-8s%s\n", "WORD", "COUNT", "LINE-POSITION");
                    System.out.printf("----------------------------------\n");
                    pw.printf("\n%-13s%-8s%s\n", "WORD", "COUNT", "LINE-POSITION");
                    pw.printf("----------------------------------\n");
                    nodeInfo.visit();
                    System.out.println();
                    pw.println();
                }
                else
                {
                    System.out.println("\nWORD DOES NOT APPEAR IN DOCUMENT\n");
                    pw.println("\nWORD DOES NOT APPEAR IN DOCUMENT\n");
                }
            }
            
        } while(!queryW.equals("0"));
        
        
    }
    
}
