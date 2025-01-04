class AVLNode
{
	int key;
	int height;
	AVLNode left,right;
	AVLNode (int key){
		this.key=key;
		left=right=null;
		height=0;
	}
}
class AVLTree
{
	public static int height(AVLNode node){
		return (node==null ?-1:height);
	}
	#left left
	public static AVLNode LL(AVLNode k2){
		AVLNode k1=k2.left;
		k2.left=k1.right;
		k1.right=k2;
		k1.height=Math.max(height(k1.left),height(k1.right))+1;
		k2.height=Math.max(height(k2.left),height(k2.right))+1;
		return k1;
	}
	#right right
	public static AVLNode RR(AVLNode k1){
		AVLNODE k2=k1.right;
		k1.right=k2.left;
		k2.left=k1;
		k1.height=math.max(height(k1.left),height(k1.right))+1;
		k2.height=math.max(height(k2.left),height(k2.right))+1;
		return k2;
	}
	#left-right
	public static AVLNode LR(AVLNode k3){
		k3.left=RR(k3.left);
		return (LL(k3))
	}
	#right-left
	public static AVLNode RL(AVLNode k1){
		k1.right=LL (k1.right);
		return (RR(k1));
	}
	public static AVLNode insert(int key,AVLNode node){
		if(node==null)
		return (new AVLNode(key));
		if(key<node.key)
		{
			node.left=insert(key,node.left);
			if(height(node.left)-height(node.right)==2)
			{
				if(key<node.left.key)
				node=LL(node);
				else
				node=LR(node);
			}
		}
		else if(key>node.key)
		{
			node.right=insert(key,node.right);
			if(height(node.left)-height(node.right)==-2)
			{
				if(key>node.right.key)
				node=RR(node);
				else
				node=RL(node)
			}
		}
		
		
