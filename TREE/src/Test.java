import java.util.ArrayList;


public class Test {

	public static void main(String[] args) {
		BPMTreeNode root = new BPMTreeNode("T001", "Root");
		String parentId = root.getId();

		BPMTreeNode callActivityNode1 = new BPMTreeNode("T002", "callActivityNode1");
		BPMTreeNode callActivityNode2 = new BPMTreeNode("T003", "callActivityNode1");
		BPMTreeNode callActivityNode3 = new BPMTreeNode("TOO4", "callActivityNode1");
		BPMTreeNode callActivityNode4 = new BPMTreeNode("T005", "callActivityNode1");
		ArrayList<BPMTreeNode> nodeList = new ArrayList<BPMTreeNode>();
		nodeList.add(callActivityNode1);
		nodeList.add(callActivityNode2);
		nodeList.add(callActivityNode3);
		nodeList.add(callActivityNode4);  
		BPMTree.addChildrenNodes(root, parentId, nodeList);
		  
		parentId = callActivityNode1.getId();

		BPMTreeNode callActivityNode5 = new BPMTreeNode("T006", "White Bread");
		BPMTreeNode callActivityNode6 = new BPMTreeNode("T007", "Corn Bread");
		BPMTreeNode callActivityNode7 = new BPMTreeNode("T008", "Whole Grain Bread");
		BPMTreeNode callActivityNode8 = new BPMTreeNode("T009", "White Toast Bread");
		BPMTreeNode callActivityNode9 = new BPMTreeNode("T10", "Whole Grain Toast Bread");

		ArrayList<BPMTreeNode> nodeList2 = new ArrayList<BPMTreeNode>(); 
		nodeList2.add(callActivityNode5);
		nodeList2.add(callActivityNode6);
		nodeList2.add(callActivityNode7);
		nodeList2.add(callActivityNode8);
		nodeList2.add(callActivityNode9);
		BPMTree.addChildrenNodes(root, parentId, nodeList2);
	}

}
