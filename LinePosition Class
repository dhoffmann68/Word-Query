
/**
 * Object will hold the line positions in a text file of a Word Object
 * 
 * @author Darren Hoffmann-Marks 
 * @version 08/09/16
 */
public class LinePosition implements Comparable
{
    int line;
    int position;
    
    
    /**
     * Two argument constructor
     * @param line - the line number of where the word is found
     * @param position - the word position in the line
     */
    public LinePosition(int line, int position)
    {
        this.line = line;
        this.position = position;
        
    }
    
    /**
     * Returns the position of the word in the text file
     * @return - the word's position
     */
    public String printLinePosition()
    {
        String linePosition = new String(line + "-" + position);
        return linePosition;
        
    }
    
    /**
     * Gets the position in a line
     * @return - the position in a line
     */
    public int getPosition()
    {
        return position;
    }
    
    /**
     * Returns the line number the word is found
     * @return - the line number
     */
    public int getLine()
    {
        return line;
    }
    
    
    /**
     * Compares two line positions to see which comes first
     * @param o - line position to be compared to
     * @return - -1 if comes before, 0 if same position, 1 if after
     */
    public int compareTo(Object o)
    {
        LinePosition param = (LinePosition) o;
        
        int paramLine = param.getLine();
        int paramPosition = param.getPosition();
        
        int thisSum = line + position;
        int paramSum = paramLine + paramPosition;
        
        if (thisSum < paramSum)
            return -1;
        else if (thisSum == paramSum)
            return 0;
        else
            return 1;
        
    }
}
