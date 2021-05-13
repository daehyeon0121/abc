
public class Hellojava {

	 public static void main(String[] args)
	 {
		int a = 9;
		int b = 3;
		
		add3(a,b);

//주석 추가함
		
		
	 }
	 
	 //3개의 float 값을 받아서 더하고 더한값을 리턴하는 함수를 만들어봅시다. add2
	public static float add2(float a, float b, float c)
	{ 
		float result;
		
		result = a + b + c;
		
		return result;
		
		}
	
	// 2개의 int값을 잆력받아 더하고, "res = 더한 값" 출력하는 함수를 만듭니다.
	// return형 없음.
	// 함수 이름은 add3
	
		public static void add3(int a, int b)
		{
			int f = a + b;
			System.out.println("res = " + f );
			
			
		}
	
	
}



	