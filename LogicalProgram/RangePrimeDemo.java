class RangePrimeDemo{
  public static void main(String args[]){
   getPrimeNumbers(30);
  }
  
  private static void getPrimeNumbers(int num){
    for(int i=0;i<num;i++){
	    if(i==0||i==1){
			System.out.println(i+" Number is not a prime number");
		}
		else{
			if(isPrimeNumber(i)){
				System.out.println(i+" Number is a prime number");
			}else{
				System.out.println(i+" Number is not a prime number");
		}
	}
  }
 }
  private static boolean isPrimeNumber(int num){
      boolean flag=true;
	  for(int k=2;k<num;k++){
		  if(num%k==0){
			  flag=false;
			  break;
		  }
	  }
	  return flag;
  }
}