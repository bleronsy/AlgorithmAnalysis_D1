public class Algoritmi2 {
	public static int max (int[]arr) {
		if(arr.length==1) {return arr[0];}
		
		int min=0;
		int max=0;	
		int sum=0;
		boolean b=true;
		for(int i=0; i<arr.length;i++) {
			if(b&&i<arr.length-1) {b=arr[i]==arr[i+1];}
			if(min>arr[i]) {min=arr[i];}
		    if(max<arr[i]) {max=arr[i];}	
			sum=sum+arr[i];
			}
		
		if(b) {
			if(arr[0]<=0) {return arr[0];}
			else {return sum;}
		}
		
		if(min>=0) {return sum;}
		
		sum=sum-min;  
		if(sum>max) {return sum;}
		
		return max;	
	}
	
	public static void main(String [] args) {
		int[] arr= {2,3,4,-3};
		int rez=max(arr);
		System.out.print(rez);
	}
}