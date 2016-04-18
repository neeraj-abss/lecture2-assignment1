
import java.util.Scanner;

class assignment1 {

	public static void main(String[] args) {
		int age;

		Scanner in = new Scanner(System.in);
		System.out.println("enter age");
		age = in.nextInt();
		if(age<18){
			System.out.println("You are not eligible to vote");
		}else{
			System.out.println("You are eligible to vote");
		}
	}

}