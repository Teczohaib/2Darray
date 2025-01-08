
class zigzag
{
 
static void printPattern(int n) 
{ 
	int var1, var = 1; 
	
	for(int i = 1; i <= n; i++) 
	{ 
		
		if(i % 2 != 0) 
		{ 
			
			var = var + i - 1; 
			for(int j = 1; j <= i; j++) 
			{ 
				if(j == 1) 
				{ 
					System.out.print(var); 
				} 
				else
				System.out.print("*" + var); 
					
			var++; 
			} 
		} 
		else 
		{	 
			var1 = var + i -1; 
			for(int j = 1; j <= i; j++) 
			{ 
				if(j == 1) 
				{ 
					System.out.print(var1); 
				} 
				else
				{ 
			
					System.out.print("*" + var1); 
				} 
				var1--; 
			} 
		} 
		System.out.print("\n"); 
	} 
	
} 
public static void main(String [] arg) 
{ 
	int n = 5; 
	
	printPattern(n); 
}
} 



