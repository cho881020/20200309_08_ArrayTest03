package code;

import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {
		
//		여섯개의 숫자를 저장할 배열
		int[] userLottoArr = new int[6];
		
//		입력받을 스캐너
		Scanner scan = new Scanner(System.in);
		
//		여섯개의 숫자를 반복으로 입력받게 하자.
//		여섯개 = 로또 배열 갯수. length 활용
		for (int i=0 ; i < userLottoArr.length ; i++) {
			
//			맞는 숫자를 입력할때까지  i번째 번호를 다시 입력.
//			 => 몇번만에 맞는 숫자가 들어올지는 알 수 없다.
//			 => while (true)로 무한반복.
//			 => 맞는 숫자가 들어오면 이 while을 깨고 나오자.
			
			while (true) {
//				번호를 임시로 변수를 만들어 저장하자.
//				이 변수를 검사해서 통과 되면 배열에 집어넣자.
//				통과 안되면 에러메세지 출력만.
				
				System.out.print((i+1) + "번째 숫자 입력 : ");
				int tempInput = scan.nextInt();
				
				if (true) {
 					userLottoArr[i] = tempInput;
					break;
				}
			}
			
		}
		
		
		
	}
	
}








