package testProject;

import java.util.Scanner;

class CurrencyConverter{
	private static double rate;
	public static double toDollar(double won) {
		return won/rate;		// �ѱ� ��ȭ�� �޷��� ��ȯ
	}

	public static double toKWR(double dollar) {
		return dollar*rate;		// �޷��� ��ȭ�� ��ȯ
	}	
	public static void setRate(double r) {
		rate = r;		// ȯ�� ���� KWR/$1
	}
}

public class StaticMember {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("ȯ��(1�޷�)>> ");
		double rate = scanner.nextDouble();
		
		CurrencyConverter.setRate(rate);		//�̱� �޷� ȯ�� ����
		
		System.out.println("�鸸���� $" + CurrencyConverter.toDollar(1000000)+"�Դϴ�");
		System.out.println("$100sms " + CurrencyConverter.toKWR(100) + "���Դϴ�.");
		scanner.close();
		
	}

}
