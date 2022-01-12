import java.util.Scanner;
class Main{
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter array length:");
		int len=scan.nextInt();
		int[] arr=new int[len];
		int big=0;
		int count=0;
		int check=0;
		//To find big number in array
		for(int i=0;i<arr.length;i++){
			System.out.println("Enter element "+i+" :");
			arr[i]=scan.nextInt();
			if(arr[i]>big){
				big=arr[i];
			}
		}
		//To find Number is prime or not
		for(int i=1;i<=big;i++){
			if(big%i==0){
				count++;
			}
		}
		if(count==2){
			System.out.println("Number ignored");
			check++;
		}
		//To find number is perfect square or not
		int sqr=(int)Math.sqrt(big);
		if((sqr*sqr)==big){
			System.out.println("reat Number is "+big);
			check++;
		}
		if(check==0){
			System.out.println("Big number "+big);
		}
	}
}
