/*
 *  CANCEL(예약취소) 예제 입니다.
 */
public class CancelExample {

	public static void main(String[] args) {
		Coolsms coolsms = new Coolsms(); 

		Set set = new Set();
		set.setMid("R1M530E9A84A631A"); // message_id
		//set.setGid("R2G52F9A0CDB76F8"); //group_id
		
		//message_id나 group_id중 하나는 반드시 입력하셔야 됩니다.

		CancelResult result = coolsms.cancel(set);	
		
		
		if (result.getErrorString() != null) {
			System.out.println("예약취소 실패");
			System.out.println(result.getErrorString());			
		} else{
			System.out.println("예약취소 성공");
		}
	}
	
}
