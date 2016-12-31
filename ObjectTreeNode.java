
/**
 * Tree Nodes to use in an Object BST
 * 
 * @author Darren Hoffmann-Marks 
 * @version 08/11/16
 */

public class ObjectTreeNode implements ObjectTreeNodeInterface {
    private Object info;
    private ObjectTreeNode left;
    private ObjectTreeNode right;
    
    /**
     * Constructor to initialize varaiables to null
     */
    public ObjectTreeNode() {
        info = null;
        left = null;
        right = null;
    }
    
    /**
     * Constructor to initialize info object
     * @param o - object info is initialized to
     */
    public ObjectTreeNode (Object o) {
        info = o;
        left = null;
        right = null;
    }
    
    /**
     * Sets info object of node
     * @param o - object info is set to
     */
    public void setInfo(Object o) {
        info = o;
    }
    
    /**
     * Returns info object
     * @return - info object
     */
    public Object getInfo() {
        return info;
    }
    
    /**
     * Sets left varaible to node
     * @param - node left is set to
     */
    public void setLeft(ObjectTreeNode p) {
        left = p;
    }
    
    /**
     * Returns the node left points to
     * @return - node left points to
     */
    public ObjectTreeNode getLeft() {
        return left;
    }
    
    /**
     * Sets right variable to node
     * @param p - node right is set to
     */
    public void setRight(ObjectTreeNode p) {
        right = p;
    }
    
    /**
     * Returns the node right points to
     * @return - node right points to
     */
    public ObjectTreeNode getRight() {
        return right;
    }
}
