class AramstrongDemo{
  public static void main(String args[]){
	  int number=123,sum=0;
	  int temp=number;
	  while(number>0){
		  int rem=temp%10;
		  sum+=rem;
	  }
	  temp=temp/10;
	  
	  if(number==sum){
		  System.out.println("The number is an aramstronnumber");
	  }else{
		  System.out.println("The number is not an aramstronnumber");
	  }
  }
}