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
				
//				검사 1. 1~45의 숫자가 맞는가?
//				검사 결과는 true / false. boolean으로 저장.
				boolean isRangeOk = false;
				
//				검사로직 : 1보다 크거나 같고, 45보다 작거나 같다를 동시에 만족해야 true.
				
				if (1 <= tempInput && tempInput <= 45) {
//					범위 검사에 통과한 상황에만 진입.
//					검사 결과를 true로 설정.
					isRangeOk = true;
				}
				else {
//					범위 밖의 숫자다! => 검사결과를 false로 설정.
					isRangeOk = false;
//					범위 밖의 숫자라는 안내 메세지 출력
					System.out.println("1~45의 숫자만 입력 가능합니다.");
				}
				
//				무조건 true => 범위 검사 결과 반영.
				if (isRangeOk) {
 					userLottoArr[i] = tempInput;
					break;
				}
			}
			
		}
		
		
		
	}
	
}








