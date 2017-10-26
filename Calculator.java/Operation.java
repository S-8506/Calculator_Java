import java.util.*;
class Operation implements Perform
{   InputOutput obj1=new InputOutput();
    public void Add()
	{   
	    //InputOutput obj1=new InputOutput();
		Scanner obj = new Scanner(System.in);
		int total=0;
		System.out.println("Enter The Range Of Number For Addition : ");
		try
		{	
		    obj1.set_data(obj.nextInt());
			int rang = obj1.get_data();
			int [] range = new int [rang];
				
			for(int i=0;i<obj1.get_data();i++)
			{   
				System.out.print("Enter The Number : ");
				range[i]=obj.nextInt();
		        total=total+ range[i];
			}
				System.out.print("Entered Number Is :");
				
			for(int i=0;i<obj1.get_data();i++)
			{
				System.out.print(range[i]+" ");
			}
				System.out.println("Sum Of Input Numbers Is : "+total);
		}
		 catch(Exception e)
		{
			System.out.println("Please Enter Valid Number !!");
		}	
		
	}
	public void Sub()
	{   int Total;
		Scanner obj = new Scanner(System.in);
		try{
		System.out.println("Enter The Two Number for Subtract :");
		System.out.print("Enter The 1st Number : ");
		obj1.set_data(obj.nextInt());
	    System.out.print("Enter The 2nd Number : ");
	    obj1.set_data1(obj.nextInt());
		  }
		  catch(Exception e)
		  {
			  System.out.println("Please Enter Valid Number !");
			  System.exit(0);
		  }
		//if(input2>input)
		     Total=obj1.get_data()-obj1.get_data1();
			 System.out.println("The Subtraction of "+obj1.get_data()+" - "+obj1.get_data1()+" is : "+Total);
		
		  /*else
		     Total=input-input2;
			 System.out.println("The Subtraction of "+input+" - "+input2+" is : "+Total);*/
	}
	public void Multi()
	{   int i,Total=1;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter The Range Of Number For Multiplcation : ");
		try
		{
			obj1.set_data(obj.nextInt());
			int[] range=new int [obj1.get_data()];
		   
			for(i=0;i<obj1.get_data();i++)
			{   System.out.print("Enter The Number : ");
				range[i]=obj.nextInt();
				Total=Total*range[i];
		    }	
		
		
		System.out.print("Entered Number are :");
		for(i=0;i<obj1.get_data();i++)
		{
			System.out.print(range[i]+" ");
		}
        System.out.println("\nMultiplication Of Input Numbers Is : "+Total);
		}
		catch(Exception e)
		{
			System.out.println("Please Enter Valid Number !");
		}
	}
	public void SinValue()
	{    Scanner obj=new Scanner(System.in);
		 System.out.print("Find The Value Sine ");
		 System.out.println("Enter the Choice :");
		 System.out.println("1. Enter the value in Degree.");
		 System.out.println("2. Enter the value in Radian.");
		 try
		 {
			obj1.set_data(obj.nextInt());
			if(obj1.get_data()==1)
				{  
					System.out.println("Enter The Angle :");
					obj1.set_data2(obj.nextDouble());
					double degree=Math.toRadians(obj1.get_data2());
					obj1.set_output(Math.sin(degree)); 
					System.out.println("The Value of Sin("+obj1.get_data2()+") is "+obj1.get_output());
				}
			else if(obj1.get_data()==2)
				{
					System.out.println("Enter The Angle :");
					obj1.set_data2(obj.nextDouble());
					obj1.set_output(Math.sin(obj1.get_data2()) );
					System.out.println("The Value of Sin("+obj1.get_data1()+") is "+obj1.get_output());
				}
		 }
		 catch(Exception e)
		 {
			 System.out.println("Please Enter The Valid Number !");
		 }
		
	}
    public void CosValue()
	{    Scanner obj=new Scanner(System.in);
		 System.out.print("Find The Value Cosine ");
		 System.out.println("Enter the Choice :");
		 System.out.println("1. Enter the value in Degree.");
		 System.out.println("2. Enter the value in Radian.");
		 try{
				obj1.set_data(obj.nextInt());
				//double output,input2;
				if(obj1.get_data()==1)
					{  
						System.out.println("Enter The Angle :");
						obj1.set_data2(obj.nextDouble());
						double degree=Math.toRadians(obj1.get_data2());
						obj1.set_output(Math.cos(degree)); 
						System.out.println("The Value of Cos("+obj1.get_data2()+") is "+obj1.get_output());
					}
				else if(obj1.get_data()==2)
					{
						System.out.println("Enter The Angle :");
						obj1.set_data2(obj.nextDouble());
						obj1.set_output(Math.cos(obj1.get_data2()));
						System.out.println("The Value of Cos("+obj1.get_data2()+") is "+obj1.get_output());
					}
		    }
			catch(Exception e)
			{
				System.out.println("Enter the valid number !");
			}
		 
	}
	public void TanValue()
	{    Scanner obj=new Scanner(System.in);
		 System.out.print("Find The Value Tangent ");
		 System.out.println("Enter the Choice :");
		 System.out.println("1. Enter the value in degree.");
		 System.out.println("2. Enter the value in Radian.");
		 try{
					obj1.set_data(obj.nextInt());
					double output,input2;
					if(obj1.get_data()==1)
					{  System.out.println("Enter The Angle :");
						obj1.set_data2(obj.nextDouble());
						double degree=Math.toRadians(obj1.get_data2());
						obj1.set_output(Math.tan(degree)); 
						System.out.println("The Value of Tan("+obj1.get_data2()+") is "+obj1.get_output());
					}
					else if(obj1.get_data()==2)
					{  System.out.println("Enter The Angle :");
						obj1.set_data2(obj.nextDouble());
						obj1.set_output(Math.tan(obj1.get_data2()));
						System.out.println("The Value of Tan("+obj1.get_data2()+") is "+obj1.get_output());
					}
		    }
		catch(Exception e)
		 {
			 System.out.println("Please Enter The Valid Number !");
		 }
		 
	}
	public void LogValue()
	{    
		 Scanner obj = new Scanner(System.in);
		 System.out.println("<---- Find a value oF Log (Base 10) ---->\nEnter The Number : ");
		try{
				obj1.set_data2(obj.nextDouble());
		    }
		catch(Exception e)
		 {
			 System.out.println("Please Enter The Valid Number !");
			 System.exit(0);
		 }
				obj1.set_output(Math.log10(obj1.get_data2()));
				System.out.println("The Value of Log10("+obj1.get_data2()+") is "+obj1.get_output());
	}
	public void Factorial()
	{    Scanner obj= new Scanner(System.in);
		System.out.println("Find a Factorial, Enter The Number : ");
		
		try
		{
				long  input=obj.nextLong();
				long factorial=1;
			for(long j=input;j>=1;j--)
				{
					factorial=factorial*j;
				}
					System.out.println("The Factorial OF "+input+" is "+factorial);
		}
		catch(Exception e)
		 {
			 System.out.println("Please Enter The Valid Number !");
		 }
	}
	public void Swap()
	{   System.out.println(" Enter The Two Number : ");
		Scanner obj= new Scanner(System.in);
		System.out.print("Enter The Value Of A : ");
		try
		{
				obj1.set_data(obj.nextInt());
				System.out.print("Enter The Value Of B : ");
				obj1.set_data1(obj.nextInt());
		}
		catch(Exception e)
		 {
			 System.out.println("Please Enter The Valid Number !");
			   System.exit(0);
		 }
		obj1.set_data(obj1.get_data()+obj1.get_data1());
		obj1.set_data1(obj1.get_data()-obj1.get_data1());
		obj1.set_data(obj1.get_data()-obj1.get_data1());
		System.out.println("The Value Of A : "+obj1.get_data()+"\nThe Value Of B : "+obj1.get_data1());
	}
	public void SquareRoot()
	{     Scanner obj=new Scanner(System.in);
		  System.out.print("Enter The Number For SquareRoot Value ");
		  try
		  {
				obj1.set_data2(obj.nextDouble());
		  }
		  catch(Exception e)
		 {
			 System.out.println("Please Enter The Valid Number !");
			 System.exit(0);
		 }
				obj1.set_output(Math.sqrt(obj1.get_data2()));
				System.out.println("The squareRoot value of "+obj1.get_data2()+" is "+obj1.get_output());
	}
}