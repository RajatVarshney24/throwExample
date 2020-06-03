import java.io.*;
 class Example1 { 
  void myMethod(int num)throws IOException, ClassNotFoundException{ 
     if(num==1)
		
     throw new IOException("IOException Occurred");

     else
        throw new ClassNotFoundException("ClassNotFoundException");
  } 
} 
class ThrowExample { 
  public static void main(String args[])
  { 
   try{ 
     Example1 obj=new Example1(); 
     obj.myMethod(10); 
   }catch(Exception ex){
     System.out.println(ex);
    } 
  }
}