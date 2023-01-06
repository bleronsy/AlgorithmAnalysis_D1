package Detyra1;

public class Algoritmi1 {
	public static int max(int[] arr) {
        int n = arr.length;
        if (n == 1) return arr[0];
        
        int[] leftMaxSum = new int[n];
        for (int i = 1; i < n; i++) {
            leftMaxSum[i] = Math.max(arr[i - 1], leftMaxSum[i - 1] + arr[i - 1]);
        }
        
        int[] rightMaxSum = new int[n];
        for (int i = n - 2; i >= 0; i--) {
            rightMaxSum[i] = Math.max(arr[i + 1], rightMaxSum[i + 1] + arr[i + 1]);
        }
        
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (i > 0) max = Math.max(max, leftMaxSum[i]);
            if (i < n - 1) max = Math.max(max, rightMaxSum[i]);
            max = Math.max(max, leftMaxSum[i] + rightMaxSum[i]);
            max = Math.max(max, leftMaxSum[i] + rightMaxSum[i] + arr[i]);
        }
        
        return max;
    }
	
	public static void main(String [] args) {
		int[] arr= {2,3,4,-3};
		int rez=max(arr);
		System.out.print(rez);
	}

}
