import java.util.ArrayList;

public class BPMTree 
	{
	   public BPMTreeNode root;

	   public BPMTree()
	   {
	   } 
	   
	   
	   
	   public static int addChildrenNodes(BPMTreeNode rootNode, String parentId, ArrayList<BPMTreeNode> nodesToAdd)
	   {
	      if(rootNode == null)
	      {
	         return 0;
	      }
	     
	      if(rootNode.getChildren()==null)
	      {
	         rootNode.setChildren(new ArrayList<BPMTreeNode>());
	      }
	     
	      if(rootNode.getId().equals(parentId))
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



	public static int addChildNode(BPMTreeNode rootNode, String parentId,
			BPMTreeNode callActivityNode) {
	      if(rootNode == null)
	      {
	         return 0;
	      }
	     
	      if(rootNode.getChildren()==null)
	      {
	         rootNode.setChildren(new ArrayList<BPMTreeNode>());
	      }
	     
	      if(rootNode.getId().equals(parentId))
	      {
	         
	    	  callActivityNode.setParent(rootNode);
	    	  rootNode.getChildren().add(callActivityNode);
	    	  return 1;
	      }
	      else
	      {
	         for(int i=0; i < rootNode.getChildren().size(); i++)
	         {
	            int resultFlag = addChildNode(rootNode.getChildren().get(i), parentId, callActivityNode);
	            if(resultFlag == 1)
	            {
	               return 1;
	            } 
	         }
	      }  
	      return -1;
	   }

	   
	   
	
	public BPMTreeNode getBPMNode(String id, BPMTreeNode parentNode){
		BPMTreeNode selectedNode = null;
		BPMTreeNode selectedRootNode = null;
		if (id==null){
			return null;
		}else{
			
			 if (parentNode==null){
				 selectedRootNode = root;
			 }else{
				 selectedRootNode = parentNode;
			 }
			
			if (selectedRootNode.id.equals(id)){
				return selectedRootNode;
			}else {
				  for (BPMTreeNode node:selectedRootNode.getChildren()){
					   if (node.getId().equals(id)){
						   selectedNode = node;
						   break;
					   }
				  }
				  
				  if (selectedNode==null){
					  for (BPMTreeNode node:selectedRootNode.getChildren()){
						  getBPMNode(id, node);
					  }
					  
				  }
				
				
			}
		}
		
		return selectedNode;
		
		
	}
	   
	   
	   
	}
