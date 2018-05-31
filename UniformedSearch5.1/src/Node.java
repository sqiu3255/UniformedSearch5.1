import java.util.ArrayList;
import java.lang.reflect.Array;


public class Node {
	public String stationName;
	
	Node leftChild;
	Node rightChild;
	
	public Node(String stationName, Node firstChild, Node secondChild)
	{
		this.stationName = stationName;
		this.leftChild = firstChild;
		this.rightChild = secondChild; 
	}
	
	public ArrayList<node> getChildren()
	{
		ArrayList<node> childNodes = new ArrayList<>();
		
		if (this.leftChild != null)
		{
			childNodes.add(leftChild);
		}
		
		if (this.rightChild != null)
		{
			childNodes.add(rightChild);
		}
		
		return childNodes;
	}
	
	public boolean removeChild(Node n)
	{
		return false;
	}
	
}
