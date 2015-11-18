
class BinaryTree
{
	public Patient root;
	public BinaryTree()
	{
		root=null;
	}
	public void add(Patient p)
	{
		Patient move=null,temp=null;
		if(root==null)
			root=p;
		else
		{
			move=root;
			while(move!=null)
			{
				temp=move;
				if(move.getAge()>p.getAge())
					move=move.left;
				else
					move=move.right;
			}
			if(temp.getAge()>p.getAge())
				temp.left=p;
			else
				temp.right=p;
			
		}
	}
	public void show(Patient p)
	{
		if(p!=null)
		{
			show(p.left);
			System.out.println(p);
			show(p.right);		
		}
	}
	
}