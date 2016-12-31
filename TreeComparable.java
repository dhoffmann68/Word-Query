
/**
 * Interface for BST node objects
 * 
 * @author Darren Hoffmann-Marks 
 * @version 08/11/16
 */
public interface TreeComparable
{
    public int compareTo(Object o);
    public void operate(Object o);
    public void visit();
}
