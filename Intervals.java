import java.util.*;
class Intervals{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of intervals");
		int n = in.nextInt();
		int a[][] = new int[n][2];
		for(int i = 0; i < n; ++i){
			Arrays.fill(a[i],-1);
		}
		
		while(true){
			System.out.println("1. Add interval\n2. Get interval");
			int choice = in.nextInt();
			switch(choice){
				case 1:
					System.out.println("Enter the start value of interval");
					int start = in.nextInt();
					System.out.println("Enter the end value of interval");
					int end = in.nextInt();
					addInterval(a,start,end);
			}
		}
	}

	public static void addInterval(int a[][], int  start, int end){
		if(a[0][0] == -1){
			a[0][0] = start;
			a[0][1] = end;
			
		}
		else{
		for(int i = 1; i < a.length; ++i){
			if(a[i-1][0] == -1){
				break;
			}
			int prevStart = a[i-1][0];
			int prevEnd = a[i-1][1];
			if(start <= prevEnd){
				prevEnd = Math.max(prevEnd,end);
				prevStart = Math.min(prevStart,start);
				a[i-1][1] = prevEnd;
				a[i-1][0] = prevStart;
				start = prevStart;
				end = prevEnd;
				
			}else{
				a[i][0] = start;
				a[i][1] = end;
				break;
			}
									
			
		}
		}
		for(int j = 0; j < a.length; ++j){
			System.out.println(a[j][0] + " " + a[j][1]);
		}

	}
}
