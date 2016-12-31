
/**
 * Interface for ObjectListNode
 * 
 * @author Darren Hoffmann-Marks 
 * @version 08/11/16
 */
public interface ObjectListNodeInterface
{
    public void setInfo(Object o);
    public Object getInfo();
    public void setNext(ObjectListNode p);
    public ObjectListNode getNext();
}
