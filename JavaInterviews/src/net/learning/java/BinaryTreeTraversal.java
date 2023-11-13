package net.learning.java;

public class BinaryTreeTraversal {
	
	public static void main(String[] args) {
		BinaryTreeTraversal binaryTreeTraversObj = new BinaryTreeTraversal();
		
		/**
		 *  Node(1) -> leftNode(2) , rightNode(3)
		 *  leftNode(2) -> leftNode(4), rightNode(5)
		 *  write a method to traverse through the binary tree and print 1,2,3,4,5
		 */
		
		Node root = new Node();
		root.setData(1);
		
		root.setLeft(new Node());
		root.getLeft().setData(2);
		
		root.setRight(new Node());
		root.getRight().setData(3);
		
		root.getLeft().setLeft(new Node());
		root.getLeft().getLeft().setData(4);
		
		root.getLeft().setRight(new Node());
		root.getLeft().getRight().setData(5);	
		
		//print binary tree
		//binaryTreeTraversObj.printLevelOrder(root);
		binaryTreeTraversObj.printBinaryTree(root);
	}
	
	 private void printBinaryTree(Node root) {
		Node leftNode = null;
		Node rightNode = null;
		
		while(root != null) {
			System.out.print(root.getData() + " ");
			if (root.getLeft() == null) {
				break;
			}
			else {
				leftNode = root.getLeft();
				printBinaryTree(leftNode);
			}
		}
	 }
	
	
	/* function to print level order traversal of tree*/
    private void printLevelOrder(Node root) 
    { 
        int h = height(root); 
        int i; 
        for (i=1; i<=h; i++) 
            printGivenLevel(root, i); 
    } 
	
	/* Compute the "height" of a tree -- the number of 
    nodes along the longest path from the root node 
    down to the farthest leaf node.*/
    private int height(Node root) 
    { 
        if (root == null) 
           return 0; 
        else
        { 
            /* compute  height of each subtree */
            int lheight = height(root.getLeft()); 
            int rheight = height(root.getRight()); 
              
            /* use the larger one */
            if (lheight > rheight) 
                return(lheight+1); 
            else return(rheight+1);  
        } 
    } 
    
    /* Print nodes at the given level */
    private void printGivenLevel (Node root ,int level) 
    { 
        if (root == null) 
            return; 
        if (level == 1) 
            System.out.print(root.getData() + " "); 
        else if (level > 1) 
        { 
            printGivenLevel(root.getLeft(), level-1); 
            printGivenLevel(root.getRight(), level-1); 
        } 
    } 
	
	//Print whole structure
    
    private void printAllLevel (Node root) 
    { 
        if (root == null) 
            return; 
        int level = 1;
        
            System.out.print(root.getData() + " "); 
        
            while (root != null)
        { 
            printGivenLevel(root.getLeft(), level-1); 
            printGivenLevel(root.getRight(), level-1); 
        } 
    } 

}
