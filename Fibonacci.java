import java.util.Scanner;

class Fibonacci{
	public static void main( String [] args){
		//System.out.println("Hello world");
		int i = 0, j= 1, k ;

		System.out.println("enter the string: ");
		int num = new Scanner(System.in).nextInt();

		System.out.println("fibbonacci series upto " + num + "is");
		System.out.print(i+" ");
		System.out.print(j+" ");
		for (int x= 2 ; x<num;x++){
				k = i + j ;
				System.out.print(k+" ");
				i=j;
				j=k;
			}
		}
}