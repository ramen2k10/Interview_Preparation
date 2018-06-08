class TryCatchFlowControl6{
 public static void main(String args[]){
 
    int[] arr = new int[4];
        try
        {
            int i = arr[4];
       System.out.println("This is inside try block");
      }
     // System.out.println("This is out of try catch block1"); this is wrong
      finally
       {
        System.out.println("This is inside finally block");
       }
     System.out.println("This is out of try catch block");
 }
}