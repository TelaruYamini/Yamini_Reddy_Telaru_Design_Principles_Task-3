package layered_architectured;
public class Method_Operations extends Console_Application{
	 // opr1=First operand, opr2=Second operand, opr=operator;
	int opr1,opr2;
	   String opr="";
	   public Method_Operations(int opr1,int opr2,String opr)
	   {
		   this.opr1=opr1;
		   this.opr2=opr2;
		   this.opr=opr;
	   }
	   
	   public static void add(Method_Operations obj)
	   {
		   System.out.println(obj.opr1+obj.opr2);
	   }
	   public static void sub(Method_Operations obj)
	   {
		   System.out.println(obj.opr1-obj.opr2);
	   }

      public static void mul(Method_Operations obj)
      {
    	  System.out.println(obj.opr1*obj.opr2);
      }
      public static void div(Method_Operations obj)
	   {
    	  System.out.println(obj.opr1/obj.opr2); 
	   }
      public static void mod(Method_Operations obj)
	   {
    	  System.out.println(obj.opr1%obj.opr2);
	   }




}
