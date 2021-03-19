package interfacee;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		
		int i = 1;
		while (i==1) {

			
		 {

			Scanner sc2 = new Scanner(System.in);
			String string2 = sc2.nextLine();
			if (string2.equals("/q")) {
				System.out.println("종료");
				break;
			}
			int input1 = Integer.parseInt(string2.split(" ")[0]);
			char input2 = string2.split(" ")[1].charAt(0);
			int input3 = Integer.parseInt(string2.split(" ")[2]);
			if(input2 == '+') {
				Add a = new Add();
				a.setValue(input1,input3);
				System.out.println(a.calculate());
			}
			else if( input2 == '-') {
				Sub s = new Sub();
				s.setValue(input1,input3);
				System.out.println(s.calculate());
			}
			else if (input2 == '*') {
				Mul m = new Mul();
				m.setValue(input1,input3);
				System.out.println(m.calculate());
			}
			else if (input2 == '/') {
					Div d = new Div();
					d.setValue(input1,input3);
					System.out.println(d.calculate());
			}

			
			else {
				
				System.out.println("잘못입력했습니다.");

			}
		}
			
		}
	}
}
		
			
		