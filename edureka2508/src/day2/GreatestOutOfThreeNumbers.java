package day2;

public class GreatestOutOfThreeNumbers {

	public static void main(String[] args) {
		
		int firstNum, secondNum, thirdNum;
		firstNum = 90; secondNum = 90; thirdNum = 26;
		if((firstNum > secondNum) && (firstNum > thirdNum)) {
			System.out.println("First Number is greatest");
		}else if((secondNum > firstNum) && (secondNum> thirdNum)) {
				System.out.println("second Number is greatest");
		}else if(( thirdNum > firstNum) && ( thirdNum>secondNum )) {
			System.out.println("third Number is greatest");
			}else if((firstNum==secondNum)&&(firstNum>thirdNum)) {
				System.out.println("First and Second are greater than third");
			}else if((firstNum==thirdNum)&&(firstNum>secondNum)) {
				System.out.println("First and third are greater than second");
				
			}else if((secondNum==thirdNum)&&(secondNum>firstNum)) {
				System.out.println("second and third are greater than first");
				
				
				
				
				
				
				
				System.out.println("All three are equal");
		}
		
		
		
		
		
		
		
		
	}

}
