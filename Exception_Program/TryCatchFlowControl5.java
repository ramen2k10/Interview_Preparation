class TryCatchFlowControl5{
 public static void main(String args[]){
 
    try
      {
           String str = "123";
           int num = Integer.parseInt(str);
       System.out.println("This is inside try block");
      }
      finally
       {
        System.out.println("This is inside finally block");
       }
     System.out.println("This is out of try catch block");
 }
}