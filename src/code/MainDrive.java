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
				
//				검사 2. 기존 배열과 중복된 값이 있는가?
//				 => 기존 배열에 들어있는 값을 하나하나 전부 꺼내봄.
//				 => 지금 입력한 값과 같은가? 검사
//				 => 만약 같은걸 하나라도 찾았다면? 중복되어서 사용 X.
//				 => 끝까지 하나도 같지 않다면.? => 중복이 아니니 사용 O.
				
//				중복 검사 결과도 : boolean으로 저장.
//				 => 일단 통과된다고 전제 => 중복값을 찾으면 안된다고 말바꾸기.
				boolean isDuplOk = true;
				
//				로또번호 배열에서 num라는 이름으로 하나하나 꺼내봄.
				for (int num : userLottoArr) {
					
//					지금 입력한 값과 num이 같은가?
//					같다면 중복통과 실패.
					
					if (num == tempInput) {
//						여기에 들어왔다? 배열에 이미 값이 들어있다!
//						중복검사 결과를 실패로 변경.
						isDuplOk = false;
						
//						에러 메세지를 출력.
						System.out.println("이미 입력한 숫자입니다.");
						
//						중복된 숫자가 하나라도 있으면 사용하면 안됨.
//						하나라도 같은값을 찾으면 그 뒤는 검사할 필요가 없다.
						break;
						
					}
					
				}
				
//				범위 검사 결과 반영. => 범위검사+중복검사 동시에 통과해야하도록.
				if (isRangeOk && isDuplOk) {
 					userLottoArr[i] = tempInput;
					break;
				}
			}
			
		}
		
////		1. Selection Sort
////		 => 별개의 배열에 정렬된 결과를 저장.
//		int[] orderedNumArray = new int[6];
//		
////		원본(userLottoArr)을 돌아보면서 하나하나 작은 값을 집어넣자.
//		
////		결과를 저장하는데 사용되는 for문 => ordered에 연관
//		for (int i=0 ; i < orderedNumArray.length ; i++) {
//			
////			원본 내부의 최소값을 찾는 for문 => userLotto에 연관
////			일단 맨 앞 숫자가 제일 작다고 전제 => 뒤로 가면서 더 작은 값이 있나?
////			내가 알던 최소값보다 더 작은걸 발견하면, 최소값을 갱신.
////			최종적으로 결정된 최소값은 배열에 집어넣고 => 검사대상에서 제외. (9999로 변경)
//			
////			0번칸의 값이 제일 작다고 전제.
//			int minNum = userLottoArr[0];
////			그 최소값이 몇번칸이지도 기록.
//			int minNumIndex = 0;
//			
//			for (int j=0 ; j < userLottoArr.length ; j++) {
//				
////				배열 안에서 더 작은 값을 발견!
//				if(userLottoArr[j] < minNum) {
//					
////					새로운 최소값을 발견했으니 갱신시켜줌.
//					minNum = userLottoArr[j];
////					그 최소값이 어느 위치인지도 기록.
//					minNumIndex = j;
//					
//				}
//			}
//			
////			여기에 남아있는 minNum이 제일 작은 값.
////			정렬된 배열에 최소값을 맞는 자리에 대입.
//			orderedNumArray[i] = minNum;
//			
////			입력한 최소값을 9999로 변경. (검사대상에서 제외)
//			userLottoArr[minNumIndex] = 9999;
//			
//			
//		}
		
		
//		2. Bubble Sort 구현.
//		userLottoArr을 곧바로 수정.
		
//		반복요소 2개. 1) 쌍을묶어서 자리바꾸기검사 + 2) 이 과정을 통으로 반복.
		
//		검사를 통으로 반복시키는 for
		for (int i=0 ; i < userLottoArr.length ; i++) {
			
//			두 숫자씩 묶어서 검사 for
			for (int j=0 ; j < userLottoArr.length-1 ; j++) {
//				6개 숫자 : 0번칸,1번칸 / 1,2 / ... / 4,5
//				0번과 1번중 0번이 더 크다? => 바꿔줘야.
//				아니다? => 현상 유지.
				
//				앞의 칸의 숫자가 더 크다면?
				if (userLottoArr[j] > userLottoArr[j+1]) {
//					두 칸에 들어있는 값을 바꿔줘야함.
					
					int backUp = userLottoArr[j];
					userLottoArr[j] = userLottoArr[j+1];
					userLottoArr[j+1] = backUp;
					
				}
			}
			
		}
		
		
		
//		입력한 값이 어떤값들인지 출력.
//		정렬된 입력값을 출력하는것으로 변경.
		for (int num : userLottoArr) {
			System.out.println(num);
		}
		
		
	}
	
}








