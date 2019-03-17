import java.util.Arrays;

public class ArrayOrdineCrescenteDecrescente 
{
	public static void main(String[] args) 
	{
		int [] a = {7, 9, 12, 27, 0, 1, 5};
		int v = 0;
		
		for(int i = 0, j = 0; i < a.length; j++)
		{
			if(a[i] > a[j])		//inserire minore per ordine decrescente
			{
				v = a[i];
				a[i] = a[j];
				a[j] = v;
			}
			
			if(j == a.length-1)
			{
				i++;
				j = i-1;;
			}
		}
		
		System.out.println(Arrays.toString(a));
	
	}
}
