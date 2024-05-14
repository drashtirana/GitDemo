package maven1;

public class Array_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number[] = {1,2,3,4,5};
		for(int i=0;i<number.length;i++)
		{
			System.out.println(number[i]);
			
		}
		System.out.println(number[2]);
		
		String fruit[]= {"apple","banana","orange","mango"};
		
		for(int i=0;i<fruit.length;i++)
		{
			System.out.println(fruit[i]);
		}
		
		for(String fruitname:fruit) 
		{
			System.out.println(fruitname);
		}
		
		char[] vovel= {'a','e','i','o','u'};
		for(int i=0;i<vovel.length;i++) 
		{
			System.out.println(vovel[i]);
		}

	}

}
