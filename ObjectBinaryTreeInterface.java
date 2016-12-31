
/**
 * Interface for ObjectBinaryTree
 * 
 * @author Darren Hoffmann-Marks
 * @version 08/11/16
 */
public interface ObjectBinaryTreeInterface
{
    public void setLeftChild(ObjectTreeNode parent, ObjectTreeNode r);
    public void setRightChild(ObjectTreeNode parent, ObjectTreeNode r);
    public void insertBST(Object o);
    public void insertBSTDup(Object o);
    public ObjectTreeNode searchBST(Object o);
    public void preTrav(ObjectTreeNode tree);
    public void inTrav(ObjectTreeNode tree);
    public void postTrav(ObjectTreeNode tree);
}
