class TryCatchControlFlow{
    public static void main(String args[]){
        int arr[]=new int[4];
        // This is the try-catch block where exception occourred and handle it and printing the rest of the code
           try{
                int i=arr[4];
                System.out.println("This is inside try block");
           }
          catch(ArrayIndexOutOfBoundsException ex)
           {
               System.out.println("Exception caught here");
           }
         System.out.println("outside the try-catch block");
           
         //Here try-catch block where handle the exception after that finally block executed and then rest of the code printed
         try{
                int j=arr[4];
                System.out.println("This is inside try block");
            }
          catch(ArrayIndexOutOfBoundsException ex)
           {
               System.out.println("Exception caught here");
           }
           finally{
                     
           }
         System.out.println("outside the try-catch block");
    }
}