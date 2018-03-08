import java.util.ArrayList;

public class BPMTree 
	{
	   public BPMTreeNode root;

	   public BPMTree()
	   {
	   } 
	   
	   
	   
	   public static int addChildrenNodes(BPMTreeNode rootNode, int parentId, ArrayList<BPMTreeNode> nodesToAdd)
	   {
	      if(rootNode == null)
	      {
	         return 0;
	      }
	     
	      if(rootNode.getChildren()==null)
	      {
	         rootNode.setChildren(new ArrayList<BPMTreeNode>());
	      }
	     
	      if(rootNode.getId() == parentId)
	      {
	         for(int i=0; i< nodesToAdd.size(); i++)
	         {
	        	 BPMTreeNode nd = nodesToAdd.get(i);
	            nd.setParent(rootNode); 
	            rootNode.getChildren().add(nd);
	         }  
	         return 1;
	      }
	      else
	      {
	         for(int i=0; i < rootNode.getChildren().size(); i++)
	         {
	            int resultFlag = addChildrenNodes(rootNode.getChildren().get(i), parentId, nodesToAdd);
	            if(resultFlag == 1)
	            {
	               return 1;
	            } 
	         }
	      }  
	      return -1;
	   }   
	   
	   
	   
	   
	   
	}
