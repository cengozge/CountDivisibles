
public class CountDivs {

	public static void main(String[] args) {
		
		System.out.println(solution(0, 1, 11)); // K in {7,20}
		//A = B in {0,1}, K = 11
	}

	public static int solution(int A, int B, int K){

		if(A == B || A == 0 || B == 0 || A == 1 || B == 1)
			return 0;
		
		int t = 0, i = 0, j = 0;
		boolean stateA = false, stateB = false ;
		for (i = A, j = B; i <= B ; i++) {
			
			if( i%K == 0 ){
				stateA = true;
			}
			if(j%K != 0){
				j--;
			}
			else{
				stateB = true;
			}
			
			if(stateA && stateB)
				break;
			
		}
		return ((B-i)/K)+1;
	}
}
