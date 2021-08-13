public class SumOfPrime {
    
    // Java Program to Print Prime Numbers from 100 to 500


	public static void main(String[] args) 
	{
		int i, number, count, sum =0; 
		
		System.out.println(" Prime Numbers from 100 to 500 are : ");	
		for(number = 100; number <= 500; number++)
		{
			count = 0;
		    for (i = 2; i <= number/2; i++)
		    {
		    	if(number % i == 0)
		    	{
		    		count++;
		    		break;
		    	}
		    }
		    if(count == 0 && number != 1 )
		    {
                sum = sum + number;
		    	System.out.print(number + " ");
		    }  
        }
        
        System.out.println("The sum of prime number is "+sum);
	}
}

