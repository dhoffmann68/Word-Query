import java.io.*;
/**
 * Object that will be placed in BST nodes. 
 * 
 * @author Darren Hoffmann-Marks 
 * @version 08/11/16
 */
public class Word implements TreeComparable
{
    private String word;
    private int count;
    private ObjectList linePositions;
    private PrintWriter pw;
    /**
     * Constructor for Word Object
     * @param param - String of a word
     */
    public Word(String param, PrintWriter pw)
    {
        word = param;
        count = 1;
        linePositions = new ObjectList();
        this.pw = pw;
    }
    
    /**
     * Inserts LinePosition Object into linked list
     * @param position - LinePosition of duplicate word
     */
    public void insertPosition(LinePosition position)
    {
        linePositions.insert(position);
    }
    
    
    /**
     * Returns the linked list of line positions
     * @return - linked list of line positions
     */
    public ObjectList getPositionList()
    {
        return linePositions;
    }
    
    /**
     * Returns the count of how often the word appears in the text
     * @return - the count
     */
    public int getCount()
    {
        return count;
    }
    
    /**
     * Prints the information of the Word Object
     */
    public void visit()
    {
        System.out.printf("%-15s%-5d", word, count);  
        pw.printf("%-15s%-5d", word, count);            //
        ObjectList queue = linePositions.copyList();
        LinePosition temp;
        
        while (queue.getFirstNode() != null)
        {
            temp = (LinePosition)queue.removeFirst();
            System.out.printf("   %s", temp.printLinePosition());
            pw.printf("   %s", temp.printLinePosition());       //
            
        }
        System.out.println();
        pw.println();           //
    }
    
    /**
     * Returns the String word
     * @return - String word
     */
    public String getWord()
    {
        return word;
    }
    
    /**
     * Compares two objects to see which Word Object is bigger
     * @param o - object to be compared to
     * @return - negative if smaller, 0 if equal, positive if bigger
     */
    public int compareTo(Object o)
    {
        Word param = (Word) o;
        
        return word.compareTo(param.getWord());
        
    }
    
    /**
     * Operates on Word Object if duplicate is added. Ups the count and adds position to linked List
     * @param o - duplicate object
     */
    public void operate(Object o)
    {
        count++;            // increments count of word object 
        Word param = (Word) o;
        ObjectList paramList = param.getPositionList();         // gets parameter's linked list
        LinePosition paramPosition = (LinePosition)paramList.removeFirst();       // removes position object
        
        linePositions.insert(paramPosition);            // adds position to tree nodes list
    }
}
