package algorithmStudy;
//배열을 이용한 성적표 작성하기(2차원 배열,합계,평균 기능)
public class JavaAlgorithm {
	public static void main(String[] args) {
		int sum =0;
		int temp =0;
		String[] title = {"이름","국어","영어", "수학", "총점", "평균"};
		String[] name = {"김우리","이미연","김지나","최제나"};
		
		int [][] score = {{90,50,20},{80,85,75},{72,58,60},{78,40,85}};
		int arr[] = new int[3];
		
		System.out.println("성적표\n");
		for(String t: title) {
			System.out.print(t+"\t");
		}
		System.out.println();
		for(int i=0; i<44; i++) {
			System.out.print("=");
		}
		System.out.println();
		for(int i=0; i<score.length; i++) {
			System.out.print(name[i]+"\t"); //이름 출력
			for(int j=0; j<score[i].length; j++) { //과목별 합계 출력
				System.out.print(score[i][j]+"\t");
				arr[j]+=score[i][j];
			}
			//총점
			int summ =0;
			for(int j=0; j<score[i].length; j++) {
				summ +=score[i][j];
			}
			System.out.print(summ+"\t");
			
			//평균
			int avg =0;
			for(int j=0; j<score[i].length; j++) {
				avg +=score[i][j];
			}
			System.out.print(avg/3+"\t");
			System.out.println();
		}
		for(int m =0; m<44;m++) {
			System.out.print("=");
		}
		System.out.println();
		
		//행별 합계
		System.out.print("\t");
		for(int r=0;r<3;r++) {
			System.out.print(arr[r]+"\t");
		}
			

	}

}
