import java.util.ArrayList;


public class BPMTreeNode
	{
	   int id;
	   String name;
	   BPMTreeNode parent;
	   ArrayList<BPMTreeNode> children;
	  
	   public BPMTreeNode(int id, String data)
	   {
	      id = id;
	      data = data;
	   }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BPMTreeNode getParent() {
		return parent;
	}

	public void setParent(BPMTreeNode parent) {
		this.parent = parent;
	}

	public ArrayList<BPMTreeNode> getChildren() {
		return children;
	}

	public void setChildren(ArrayList<BPMTreeNode> children) {
		this.children = children;
	}
	   
	   
	   
	   
	   
	   
	   
	}