package testProject;
//import java.util.Scanner;

public class Calculator2 implements CalcImpl{		// Ŭ��������� extends ����ϰ� implements �� �̷��� ����.
	// ����� implement�� �� ���� ������ ���⼭ �ϴ°�

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

