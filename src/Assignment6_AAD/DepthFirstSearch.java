package Assignment6_AAD;

import java.util.*;
import java.lang. *;
import java.io.*;

public class DepthFirstSearch {
	Node root;
	
	public DepthFirstSearch () {
		
		System.out.println ("Call DFS with root node to do a Depth First Search. ");
		
	}
	
	/**
	 * Performs DFS
	 * @param node
	 */
	
	public void DFS (Node node) {
		if (node==null) {
			return;
		}
		
		System.out.println(node.getData());
		DFS(node.getlChild());
		DFS(node.getrChild());
	}
	
	/**
	 * Function for finding the height of the tree
	 * Height of left subtree
	 * Height of right subtree
	 * 
	 * @param node
	 * @return the height of the current subtree with root as node
	 */
	
	public int Height (Node node) {
		//root(node);
		if(node==null) {
			return 0;
		}
		
		int left = Height (node.getlChild());
		int right = Height (node.getrChild());
		return 1+ Math.max(left, right);
	}
	
	/**
	 * function for finding total number of nodes
	 * finding number of node in left subtree
	 * finding number of nodes in right subtree
	 * @param node
	 * @return the total root plus left subtree + right subtree
	 */
	
	public int numberOfNodes(Node node) {
		
		if (node == null) {
			return 0;
		}
		
		int left = numberOfNodes(node.getlChild());
		int right = numberOfNodes(node.getrChild());
		return 1+ left+right;
	}

}
