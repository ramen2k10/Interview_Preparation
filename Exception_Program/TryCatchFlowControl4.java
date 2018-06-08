class TryCatchFlowControl4{
 public static void main(String args[]){
 
    try
      {
           String str = "123";
           int num = Integer.parseInt(str);
       System.out.println("This is inside try block");
      }
    catch(NumberFormatException ex)
      {
        System.out.println("This is inside catch block");
      }
      finally
       {
        System.out.println("This is inside finally block");
       }
     System.out.println("This is out of try catch block");
 }
}