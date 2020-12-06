package algorithmStudy;
//배열이 이용한 합계와 평균 구하기
public class SumAlgorthom {

	public static void main(String[] args) {
		int [ ] value = {99,95,56,23,44};
		int sum =0;
		float average = 0f;
		
		for(int i=0; i <value.length; i++) {
			sum += value[i]; //반복문을 이용해 배열에 저장되어 있는 값을더해서 sum저장
		}
		average = sum/value.length;
		System.out.println("합계"+sum);
		System.out.println("평균"+ average);

	}

}
