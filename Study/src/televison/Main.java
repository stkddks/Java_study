package televison;

import java.util.Scanner;

public class Main {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			Television myTv = new Television();
			System.out.println("TV를 켜시겠습니까? : (TurnOn: true / TurnOff: false)");
			boolean power1 = sc.nextBoolean();
			myTv.setPower(power1);
			
			//Person family = new Person();
			System.out.println("*** 가족구성원의 정보를 입력하세요 *** ");
			System.out.printf("구성원 수: ");
			int count = sc.nextInt();
			
			Person[] list = new Person[count];
			for(int i=0; i<count; i++) {
				System.out.print((i+1)+"번째 구성원 이름 : ");
				String name = sc.next();	
				System.out.print("구성원 나이 : ");
				int age = sc.nextInt();
				System.out.print((i+1)+"번째 구성원 성별 : ");
				String gender = sc.next();
				
				list[i]=new Person(name, age, gender);
				System.out.println(list[i].toString());
				
//				Person p1 = new Person(name, age, gender);
//				p1.register(name, age, gender, count);
			}
			
			System.out.println("*** 축하합니다. 하나의 가족이 등록되었습니다 :) ***\n");
			
			System.out.println("당신의 이름은 무엇입니까? : ");
			String name = sc.next();
//			for(int i=0; i<count; i++) {
//				System.out.println(list[i].toString());
//		        }
			for(int i=0; i<count; i++) {
				//System.out.println(list[i].toString());
		        if (name.equals(list[i].getName())) {
		        	System.out.println("환영합니다"+name+"님!");
		        }
		        else {
		        	System.out.println(name+"! 당신은 가족 구성원으로 등록되지 않았습니다. 프로그램을 강제 종료합니다. 안녕히가세요ㅎㅎ");
		        	System.exit(0);
		        }
		    	}
			//p2.setName(name, count);
			//System.out.println("환영합니다"+name+"님!");
			
			
			System.out.printf("\n어느 채널로 틀까요? : ");
			int channel1 = sc.nextInt();
			myTv.setChannel(channel1);
			
			System.out.printf("\n볼륨을 얼마로 할까요? : ");
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
			  
			  
//			System.out.println("TV를 켜시겠습니까? : (TurnOn: true / TurnOff: false)");
//			
//			
//			String power = sc.next();
//			if(power.equals("true")) {
//				 myTv.turnOn(power);}
//			else if(power.equals("false")) { 
//				myTv.turnOff();}
//			else {
//				System.out.println("시스템을 종료합니다.");}
//			
			  //myTv.print();
			  
			  //int ch = myTv.getChannel();
