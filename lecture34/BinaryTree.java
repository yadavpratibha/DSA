package lecture34;
import java.util.*;
public class BinaryTree {

	public class Node{
		int data;
		Node left;
		Node right;
	}
	
	private Node root;
	Scanner sc=new Scanner(System.in);
	public BinaryTree() {
		root=CreateTree();
	}
	
	private Node CreateTree() {
		int item=sc.nextInt();
		Node nn = new Node();
		nn.data=item;
		boolean hasLeftChild=sc.nextBoolean();
		if(hasLeftChild) {
			nn.left=CreateTree();
		}
		boolean hasRightChild=sc.nextBoolean();
		if(hasRightChild) {
			nn.right=CreateTree();
		}
		return nn;
	}
	
	public void Display() {
		Display(root);
	}
	
	private void Display(Node nn) {
		
		if(nn==null) {
		return;	
		}
		
		String s="";
		s=s+nn.data;
		s="<--"+s+"-->";
		if(nn.left!=null) {
			s=nn.left.data+s;
		}
		else {
			s="."+s;
		}
		
		if(nn.right!=null) {
			s=s+nn.right.data;
		}
		else {
			s=s+".";
		}
		
		System.out.println(s);
		Display(nn.left);
		Display(nn.right);
	}
	
	public int max() {
		return max(root);
	}
	
	private int max(Node nn) {
		if(nn==null) {
			return Integer.MIN_VALUE;
		}
		
		int left=max(nn.left);
		int right=max(nn.right);
		
		return Math.max(left, Math.max(right, nn.data));
	}
	
	public boolean Find(int item) {
		return Find(this.root,item);
	}
	
	private boolean Find(Node nn,int item) {
		if(nn==null) {
			return false;
		}
		if(nn.data==item) {
			return true;
		}
		
		boolean left=Find(nn.left,item);
		boolean right=Find(nn.right,item);
		return left||right;			
	}
	
	public int height() {
		return height(this.root);
	}
	
	private int height(Node node) {
		if(node==null) {
			return -1;
		}
		
		int lefth=height(node.left);
		int righth=height(node.right);
		
		return Math.max(lefth, righth)+1;
	}
	
	public void PreOrder() {
		PreOrder(this.root);
		System.out.println();
	}
	
	private void PreOrder(Node node) {
		if(node==null) {
			return;
		}
		System.out.println(node.data+" ");
		PreOrder(node.left);
		PreOrder(node.right);
	}
	
	public void InOrder() {
		InOrder(this.root);
		System.out.println();
	}
	
	private void InOrder(Node node) {
		if(node==null) {
			return;
		}
		InOrder(node.left);
		System.out.print(node.data+" ");
		InOrder(node.right);
	}
	
	public void PostOrder() {
		PostOrder(this.root);
		System.out.println();
	}
	
	private void PostOrder(Node node) {
		if(node==null) {
			return;
		}
		PostOrder(node.left);
		PostOrder(node.right);
		System.out.print(node.data+" ");
	}
	
	public void LevelOrder() {
		LevelOrder(this.root);
		System.out.println();
	}
	
	public void LevelOrder(Node node) {
	//LinkedList<Node>q=new LinkedList<>();
		Queue<Node>q=new LinkedList<>();
		q.add(root);
		while(!q.isEmpty()) {
			Node rv = q.remove();
			System.out.print(rv.data+" ");
			if(rv.left!=null) {
				q.add(rv.left);
			}
			if(rv.right!=null) {
				q.add(rv.right);
			}
		}
		System.out.println();
	}
	
	
	
}
