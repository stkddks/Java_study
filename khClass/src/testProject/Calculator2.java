package testProject;
//import java.util.Scanner;

public class Calculator2 implements CalcImpl{		// 클래스상속은 extends 라고하고 implements 는 이렇게 쓴다.
	// 약속은 implement에 해 놓고 구현은 여기서 하는겨

	@Override
	public double sum (double num1, double num2) {
		return (num1 + num2);
	}

	@Override
	public double sub(double num1, double num2) {
		// TODO Auto-generated method stub
		return (num1 - num2);
	}

	@Override
	public double mul(double num1, double num2) {
		// TODO Auto-generated method stub
		return (num1 * num2);
	}

	@Override
	public double div(double num1, double num2) {
		// TODO Auto-generated method stub
		return (num1 / num2);
	}

}

