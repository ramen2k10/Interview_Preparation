class PrimeDemo{
	public static void main(String[] args) {
		int num =2;
		isPrimeNumber(num);
	}

	private static void isPrimeNumber(int num) {
		boolean isprime=true;
		if (num == 0 || num == 1) {
			System.out.println("number is not a prime ");
		} else {
           for(int i=2;i<num;i++){
        	   if(num%i==0){
        		   isprime=false;
        		   break;
        	   }
        	   isprime=true;
           }
		}
		
		if(isprime){
			System.out.println("number is prime");
		}else{
			System.out.println("number is not  a prime");
		}
	}
}