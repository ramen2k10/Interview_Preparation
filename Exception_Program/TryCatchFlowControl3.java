class TryCatchFlowControl3{
 public static void main(String args[]){
   int arr[]=new int[4];
    try
      {
       int i=arr[4];
       System.out.println("This is inside try block");
      }
    catch(NullPointerException ex)
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