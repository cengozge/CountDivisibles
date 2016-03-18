
public class CountDivs {

	public static void main(String[] args) {
		
		System.out.println(solution(10, 21, 3));
	}

	public static int solution(int A, int B, int K){

		int t = 0;
		for (int i = A; i <= B ; ) {
			if( i%K == 0){
				t++;
				i+=K;
			}
			else{
				i++;
			}
		}
		return t;
	}
}
