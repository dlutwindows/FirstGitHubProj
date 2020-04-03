import java.util.Scanner;

public class HelloWorld{
	public static void main(String[] args){
		int num=2;
		int sum=0;
		while(num<=100){
			sum+=num;
			num+=3;
		}
		System.out.println(sum);
	}
}

