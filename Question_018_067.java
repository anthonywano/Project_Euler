import java.io.*;
import java.util.Scanner;

public class Question_18 {

	public static int LEVEL_COUNT = 100;
	public static int ELEMENT_COUNT = (LEVEL_COUNT*(LEVEL_COUNT+1))/2;
	
	public static void main(String args[])
	{
		int [] my_arr = new int[ELEMENT_COUNT];
		x_Tree_Node[] node_arr = new x_Tree_Node[ELEMENT_COUNT];
	
		
		x_Tree_Node root = new x_Tree_Node();
		
		root = buildTree(my_arr, node_arr);
		
		assignSum(node_arr);		
	}
	
	
	public static boolean notDoubleCounted(int true_count)
	{
		int level_place = true_count;
		int level_num = 0;
		
		for(int i = 1; i < LEVEL_COUNT+1; i++)
		{			
			if(level_place - i <= 0)
			{
				level_num = i;
				break;
			}
			
			level_place -= i;
		}
		
		if(level_place != 1 && level_place != level_num)
		{
			return false;
		}
		
		else
		{
			return true;
		}
		
	}
	
	static x_Tree_Node buildTree(int [] my_arr, x_Tree_Node[] node_arr)
	{
		// The name of the file to open.
        String fileName = "C:\\Users\\pp83819\\Desktop\\Programming\\Java\\Workspace\\Project_Euler\\src\\tree_nodes_67.txt";

        int index = 0;
        
        // Read numbers from text file
        Scanner scan;
		try {
			scan = new Scanner(new File(fileName));
			String value;
			
			while (scan.hasNext()) {
				
	            value = scan.next();
	            
	            my_arr[index] = Integer.valueOf(value);
	            
	            index++;
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		// Build node objects with numbers
		for(int i = 0; i < my_arr.length; i++)
		{
			x_Tree_Node node = new x_Tree_Node(my_arr[i]);
			
			node_arr[i] = node;
		}
		
		// Set root to top number
		x_Tree_Node root = node_arr[0];
		
		int assign_count = 1;
		
		// Assign Left and Right for each node above last level
		for(int i = 0; i < ELEMENT_COUNT-LEVEL_COUNT; i++)
		{
			node_arr[i].left = node_arr[assign_count];
			
			assign_count++;
			
			node_arr[i].right = node_arr[assign_count];
			
			if(notDoubleCounted(assign_count+1))
			{
				assign_count++;
			}
		}
		return root;		
	}
	
	public static void assignSum(x_Tree_Node[] node_arr)
	{
		int element_num = 0;
		
		for(int i = 1; i <= LEVEL_COUNT; i++)
		{
			for(int y = 0; y < i; y++)
			{
				node_arr[element_num].level = i;
				element_num++;
			}
		}
		
		
		for(int i = LEVEL_COUNT; i > 0; i--)
		{
			element_num = 0;
			
			while(node_arr[element_num].level != i)
			{
				element_num++;
			}
			
			while(element_num < ELEMENT_COUNT && node_arr[element_num].level == i)
			{
				if(i == LEVEL_COUNT)
				{
					node_arr[element_num].sum_val = node_arr[element_num].val;
				}
				
				
				else
				{
					if(node_arr[element_num].left.sum_val == node_arr[element_num].right.sum_val)
					{
						node_arr[element_num].sum_val = node_arr[element_num].val + node_arr[element_num].left.sum_val;
					}
					
					else if(node_arr[element_num].left.sum_val > node_arr[element_num].right.sum_val)
					{
						node_arr[element_num].sum_val = node_arr[element_num].val + node_arr[element_num].left.sum_val;
					}
					
					else
					{
						node_arr[element_num].sum_val = node_arr[element_num].val + node_arr[element_num].right.sum_val;
					}
				}
				
				element_num++;
			}
		}
		
		System.out.print("Value: " + node_arr[0].sum_val);
	}
	
}
