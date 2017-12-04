import java.util.Scanner;
import java.util.Stack;

public class Lab2Automata {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		//System.out.println("Enter arithmetic extpression");
		//String expression = scnr.nextLine();
		intoPostfix("(1+1)*(2+2)");
		
		
	}
	
	public static int intoPostfix(String expression) {
		Stack<String> stack = new Stack<String>();
		String numAnswer="";
		String temp;
		
		for(int i=0;i<expression.length();i++) {
			
			if(expression.charAt(i)==')') {
				System.out.println("push" + stack.push(Character.toString(expression.charAt(i))));;
				String var = stack.pop();
				System.out.println("found ')'");
				System.out.println("pop: "+var);
				while(!((temp=stack.pop()).equals("(")))
					numAnswer+=temp;
				System.out.println(numAnswer);
			}
			else if(expression.charAt(i)>='0'&& expression.charAt(i)<='9') {
				numAnswer += expression.charAt(i);				
			} else {
				System.out.println("push"+stack.push(Character.toString(expression.charAt(i))));
				//System.out.println(expression.charAt(i));
			}
		
			
		}
		
		System.out.println(numAnswer);
		
		System.out.println(makeOperation(stack.pop(), answers[0] , answers[1]));
		return 0;
	}
	public static int makeOperation(String operator, int num1, int num2) {
		int answer = 0;
		if(operator.equals("*")) {
			answer = num1*num2;
		}
		if(operator.equals("/")) {
			answer = num1/num2;
		}
		if(operator.equals("+")) {
			answer = num1+num2;
		}
		if(operator.equals("-")) {
			answer = num1-num2;
		}
		return answer;
	}
}
