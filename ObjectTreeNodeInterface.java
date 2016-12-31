
/**
 * Interface for ObjectTreeNode
 * 
 * @author Darren Hoffmann-Marks 
 * @version 08/11/16
 */
public interface ObjectTreeNodeInterface
{
    public void setInfo(Object o);
    
    public Object getInfo();
    
    public void setLeft(ObjectTreeNode p);
    
    public ObjectTreeNode getLeft();
    
    public void setRight(ObjectTreeNode p);
    
    public ObjectTreeNode getRight();
}
