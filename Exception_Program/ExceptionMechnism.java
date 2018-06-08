class ExceptionMechnism{
   static int division(int a,int b){
       int i=a/b;
        return i;
   }
   
   static int computeDivision(int a,int b){
      int res=0;
       try{
           res=division(a,b);
       }catch(NumberFormatException ex){
           System.out.println("Exception not caught here**");
         }
      return res;
   }
  
   public static void main(String args[]){
     int x=1;int y=0;
      try{
      int result=computeDivision(x,y);
      }catch(ArithmeticException  ex)
        {
          ex.printStackTrace();
         System.out.println("Exception caught here "+ ex);}
   }
}