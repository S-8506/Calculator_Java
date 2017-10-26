import java.util.*;
class Choice extends Operation
{
public void Disp()
   {	
    Scanner obj=new Scanner(System.in);
	InputOutput obj1=new InputOutput();
    loop: while(true)
	     {
	System.out.println("\n\nPlease Chose The operation :\n");
	System.out.println(" 1. Addition");
	System.out.println(" 2. Subtraction");
	System.out.println(" 3. Multiplication");
	System.out.println(" 4. Value Of Sin");
    System.out.println(" 5. Value Of Cos");
	System.out.println(" 6. Value Of Tan");
	System.out.println(" 7. Value Of Log");
	System.out.println(" 8. Factorial");
	System.out.println(" 9. Swaping");
	System.out.println(" 10.SquareRoot");
	System.out.println(" 11.Exit\n");
	System.out.println("Enter The choice Number : ");
	try
	{
	    obj1.set_data(obj.nextInt());
	}
	catch(Exception e)
		 {
			 System.out.println("Please Enter The Valid Number !");
			 break ;
		 }
	switch(obj1.get_data())
	        {     case 1:
				 Add();
			      break ;
			    case 2:
			       Sub();
			      break;
			    case 3:
			      Multi();
				  break;
			    case 4:
				  SinValue();
				 break;
			    case 5:
			      CosValue();
				  break;
				case 6:
				   TanValue();
				   break;
				case 7:
				    LogValue();
					break;
				 case 8:
				  Factorial();
				   break;
				case 9:
				   Swap();
				   break;
				case 10:
				   SquareRoot();
				   break;
				case 11:
				   break loop;
			     default :
				  System.out.println("!Please Enter  Valid Number !");
			 }
	    } 
	}
}