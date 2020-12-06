package algorithmStudy;
//1부터 100까지 짝수의 합 구하는 프로그램(2의 배수)
public class SumAlgorithmTest {

	public static void main(String[] args) {
		// Type 1
		int sum =0;
		int i=0;
		for(i =1;i<=100;i++) {
			if(i%2==0) {
				sum = sum +i;
			}
		}
		System.out.println(sum);
		
		//Type 2
		sum =0;
		i=0;
		while (i<=100){
			if(i%2 ==0) sum = sum +i;
			i++;
		}
		System.out.println(sum);
	}

}
