package televison;

import java.util.Scanner;

public class Main {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			Television myTv = new Television();
			System.out.println("TV�� �ѽðڽ��ϱ�? : (TurnOn: true / TurnOff: false)");
			boolean power1 = sc.nextBoolean();
			myTv.setPower(power1);
			
			//Person family = new Person();
			System.out.println("*** ������������ ������ �Է��ϼ��� *** ");
			System.out.printf("������ ��: ");
			int count = sc.nextInt();
			
			Person[] list = new Person[count];
			for(int i=0; i<count; i++) {
				System.out.print((i+1)+"��° ������ �̸� : ");
				String name = sc.next();	
				System.out.print("������ ���� : ");
				int age = sc.nextInt();
				System.out.print((i+1)+"��° ������ ���� : ");
				String gender = sc.next();
				
				list[i]=new Person(name, age, gender);
				System.out.println(list[i].toString());
				
//				Person p1 = new Person(name, age, gender);
//				p1.register(name, age, gender, count);
			}
			
			System.out.println("*** �����մϴ�. �ϳ��� ������ ��ϵǾ����ϴ� :) ***\n");
			
			System.out.println("����� �̸��� �����Դϱ�? : ");
			String name = sc.next();
//			for(int i=0; i<count; i++) {
//				System.out.println(list[i].toString());
//		        }
			for(int i=0; i<count; i++) {
				//System.out.println(list[i].toString());
		        if (name.equals(list[i].getName())) {
		        	System.out.println("ȯ���մϴ�"+name+"��!");
		        }
		        else {
		        	System.out.println(name+"! ����� ���� ���������� ��ϵ��� �ʾҽ��ϴ�. ���α׷��� ���� �����մϴ�. �ȳ��������䤾��");
		        	System.exit(0);
		        }
		    	}
			//p2.setName(name, count);
			//System.out.println("ȯ���մϴ�"+name+"��!");
			
			
			System.out.printf("\n��� ä�η� Ʋ���? : ");
			int channel1 = sc.nextInt();
			myTv.setChannel(channel1);
			
			System.out.printf("\n������ �󸶷� �ұ��? : ");
			int volume1 = sc.nextInt();
			myTv.setVolume(volume1);
			myTv.print();
			
			sc.close();
		}
			
}


//			Television myTv1 = new Television();
//			  myTv1.setChannel(7);
//			  myTv1.setVolume(9);
//			  myTv1.print();
			  
			  
//			System.out.println("TV�� �ѽðڽ��ϱ�? : (TurnOn: true / TurnOff: false)");
//			
//			
//			String power = sc.next();
//			if(power.equals("true")) {
//				 myTv.turnOn(power);}
//			else if(power.equals("false")) { 
//				myTv.turnOff();}
//			else {
//				System.out.println("�ý����� �����մϴ�.");}
//			
			  //myTv.print();
			  
			  //int ch = myTv.getChannel();
