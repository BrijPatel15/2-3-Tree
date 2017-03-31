
public class Node{
	 int smallItem;
	  int largeItem;

	  Node leftChild;
	  Node midChild;
	  Node rightChild;

	  public Node(int small,int big,Node left,Node mid,Node right){
	    this.smallItem = small;
	    this.largeItem = big;
	    this.leftChild = left;
	    this.midChild = mid;
	    this.rightChild = right;
	  }
	  public int getSmall(){
	    return this.smallItem;
	  }
	  public int getLarge(){
	    return this.largeItem;
	  }
	  public Node getLeft(){
	    return this.leftChild;
	  }
	  public Node getMid(){
	    return this.midChild;
	  }
	  public Node getRight(){
	    return this.rightChild;
	  }
	  public void setSmall(int small){
	    this.smallItem = small;
	  }
	  public void setLarge(int large){
	    this.largeItem = large;
	  }
	  public void setLeft(Node left){
	    this.leftChild = left;
	  }
	  public void setMid(Node mid){
	    this.midChild = mid;
	  }
	  public void setRight(Node right){
	    this.rightChild = right;
	  }
	  public void printNode(){
		  System.out.println("The small value is: " + this.smallItem + " the large value is: " + this.largeItem);
	  }
	  public int getElements(Node n){
		  int total = 0;
		  if(n.getSmall() != -1 && n.getLarge() != -1){
			  total = 2;
		  }
		  else if(n.getSmall() == -1 || n.getLarge() != -1){
			  total = 1;
		  }
		  else if(n.getSmall() == -1 && n.getLarge() == -1){
			  total = 0;
		  }
		  return total;
	  }
}
