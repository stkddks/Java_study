
package testProject;

public interface CalcImpl {

	public double sum(double num1, double num2);	//개발자A			
	public double sub(double num1, double num2);	//개발자B
	public double mul(double num1, double num2);	//개발자C
	public double div(double num1, double num2);	//개발자D
}


//interface 파일은 서로 개발자들의 변수명 등의 정의들을 약속해 놓는것!