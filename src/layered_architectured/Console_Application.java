package layered_architectured;
import java.util.*;
public class Console_Application {
   public static void main(String args[])
   {
	   // opr1= First operand, opr2= Second operand, opr= Operator;
	  int opr1,opr2;
	  String opr=" ";
	   Scanner scan=new Scanner(System.in);
	   System.out.println("Welcome to the Calculator");
       System.out.println("Enter the first operand:");
	   opr1=scan.nextInt();
	   System.out.println("Enter the second operand:");
	   opr2=scan.nextInt();
	   System.out.println("Enter the operator :");
	   opr=scan.next();
	   Method_Operations obj=new Method_Operations(opr1,opr2,opr);
	   if(opr.equals("+"))
	   {
		  obj.add(obj);
	   }
	   else if(opr.equals("-"))
	   {
		   obj.sub(obj);
	   }
	   else if(opr.equals("*"))
	   {
		   obj.mul(obj);
	   }
	   else if(opr.equals("/"))
	   {
		   obj.div(obj);
	   }
	   else if(opr.equals("%"))
	   {
		   obj.mod(obj);
	   }
	   else
	   {
		   System.out.println("Ivalid option");
	   }
	   }
}
	   
   
