
/**
 * Darren Hoffmann-Marks
 * 
 * @author Darren Hoffmann-Marks
 * @version 08/11/16
 */
public class ObjectListNode {
    private Object info;
    private ObjectListNode next;
    
    
    /**
     * Default constructor
     */
    public ObjectListNode() {
        info = null;
        next = null;
    }

    
    /**
     * One Argument constructor
     * @param - Object for info field
     */
    public ObjectListNode (Object o) {
        info = o;
        next = null;
    }    
    
    
    /**
     * Two Argument Constructor
     * @param o - Object for info field
     * @param p - node for next field
     */
    public ObjectListNode (Object o, ObjectListNode p) {
        info = o;
        next = p;
    }       

    
    /**
     * Sets info field of node
     * @param o - Object for info field
     */
    public void setInfo(Object o) {
        info = o;
    }    

    
    /**
     * Returns the object in the info field
     * @return - the object in the info field
     */
    public Object getInfo() {
        return info;
    }

    
    /**
     * Sets the next info field to a node
     * @param p - the next node
     */
    public void setNext(ObjectListNode p) {
        next = p;
    }

   
    /**
     * Returns the next node
     * @return - the net node
     */
    public ObjectListNode getNext() {
        return next;
    }
}
