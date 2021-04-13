package function;

public class square {
	public static int square(int a)
	{
		int res=a*a;
		return res;
	}

	public static void main(String[] args) {
		int num=9;
		double res=square(num);
		System.out.println(res);

	}

}
