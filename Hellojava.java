
public class Hellojava {

	 public static void main(String[] args)
	 {
		int a = 9;
		int b = 3;
		
		add3(a,b);

//�ּ� �߰���
		
		
	 }
	 
	 //3���� float ���� �޾Ƽ� ���ϰ� ���Ѱ��� �����ϴ� �Լ��� �����ô�. add2
	public static float add2(float a, float b, float c)
	{ 
		float result;
		
		result = a + b + c;
		
		return result;
		
		}
	
	// 2���� int���� ��¹޾� ���ϰ�, "res = ���� ��" ����ϴ� �Լ��� ����ϴ�.
	// return�� ����.
	// �Լ� �̸��� add3
	
		public static void add3(int a, int b)
		{
			int f = a + b;
			System.out.println("res = " + f );
			
			
		}
	
	
}



	