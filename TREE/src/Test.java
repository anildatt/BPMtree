import java.util.ArrayList;


public class Test {

	public static void main(String[] args) {
		BPMTreeNode root = new BPMTreeNode(0, "Root");
		int parentId = root.getId();

		BPMTreeNode newNodeBread = new BPMTreeNode(1, "Bread");
		BPMTreeNode newNodeMilk = new BPMTreeNode(2, "Milk");
		BPMTreeNode newNodeMeat = new BPMTreeNode(3, "Meat");
		BPMTreeNode newNodeEggs = new BPMTreeNode(4, "Eggs");
		ArrayList<BPMTreeNode> nodeList = new ArrayList<BPMTreeNode>();
		nodeList.add(newNodeBread);
		nodeList.add(newNodeMilk);
		nodeList.add(newNodeMeat);
		nodeList.add(newNodeEggs);  
		BPMTree.addChildrenNodes(root, parentId, nodeList);
		  
		parentId = newNodeBread.getId();

		BPMTreeNode newNodeBreadW = new BPMTreeNode(20, "White Bread");
		BPMTreeNode newNodeBreadC = new BPMTreeNode(21, "Corn Bread");
		BPMTreeNode newNodeBreadWG = new BPMTreeNode(22, "Whole Grain Bread");
		BPMTreeNode newNodeBreadWT = new BPMTreeNode(23, "White Toast Bread");
		BPMTreeNode newNodeBreadWGTB = new BPMTreeNode(24, "Whole Grain Toast Bread");

		ArrayList<BPMTreeNode> nodeList2 = new ArrayList<BPMTreeNode>(); 
		nodeList2.add(newNodeBreadW);
		nodeList2.add(newNodeBreadC);
		nodeList2.add(newNodeBreadWG);
		nodeList2.add(newNodeBreadWT);
		nodeList2.add(newNodeBreadWGTB);
		BPMTree.addChildrenNodes(root, parentId, nodeList2);
	}

}
