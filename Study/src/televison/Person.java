package televison;
import java.util.Scanner;

//import oop.sample.Person;
public class Person {
	Scanner sc = new Scanner(System.in);

    //field
    private String name;
    private int age;
    private String gender; // ����ʵ�
    int count;
    
    Person[] list = new Person[count];
    public Person(String name){
    	this.name = name;
   
    }
    //setter
    public void setName(String name, int count) {
    	this.name = name;
    	this.count = count;
    	
//    	for(int i=0; i<count; i++) {
//        if (name.equals(list[i].getName())) {
//        	System.out.println("ȯ���մϴ�"+name+"��!");
//        }
//        else {
//        	
//        	System.out.println(name+"! ����� ���� ���������� ��ϵ��� �ʾҽ��ϴ�. ���α׷��� ���� �����մϴ�. �ȳ��������䤾��");
//        	System.exit(0);
//        }
//    	}
    }
    public void setAge(int age) {
        if (age < 1)
            System.out.println("���̴� 1����� �����մϴ�.");
        else
            this.age = age;
    }
    public void setGender(String gender) {
        if ((!gender.equals("����")) && (!gender.equals("����")))
            System.out.println("������ ���ڿ� ���ڸ� �ֽ��ϴ�.");
        else
            this.gender = gender;
    }

    //getter
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getGender() {
        return gender;
    }
    
    //action
//    public void setTelevisionPower(Television tv, boolean power) {
//        if (power == true)
//            System.out.println(name + "��(��) �ڷ����� �ѱ⸦ �õ��߽��ϴ�.");
//        else
//            System.out.println(name + "��(��) �ڷ����� ���⸦ �õ��߽��ϴ�.");
//        tv.setPower(power);
//    }
//    public void setTelevisionVolume(Television tv, int volume) {
//        System.out.println(name + "��(��) �ڷ����� ������ " + volume + "���� �����ϱ⸦ �õ��߽��ϴ�.");
//        tv.setVolume(volume);
//    }
//    public void setTelevisionChannel(Television tv, int channel) {
//        System.out.println(name + "��(��) �ڷ����� ä���� " + channel + "���� �����ϱ⸦ �õ��߽��ϴ�.");
//        tv.setChannel(channel);
//    }
//    public void setTelevisionBrightness(Television tv, double brightness) {
//        System.out.println(name + "��(��) �ڷ����� ��⸦ " + brightness + "���� �����ϱ⸦ �õ��߽��ϴ�.");
//        tv.setBrightness(brightness);
//    }
    
    public Person(String name, int age, String gender) {		// �Ű����� �ִ� ������
      	 this.name=name;
      	 this.age=age;
      	 this.gender=gender;
      	}
    
    public String toString() {
		return "[�̸�=" + name + ", ����=" + age + ", ����=" + gender +"]";
	}
	
//	public void register(String name, int age, String gender, int count) {
//		this.name = name;
//		this.age = age;
//		this.gender = gender;
//		
////		Scanner sc = new Scanner(System.in);
//
//		sc.close();
//	}   
}





//list[i].name, list[i].age, list[i].gender

//System.out.print(count+"��° ������ �̸� : ");
//name = sc.next();	//
//System.out.print("������ ���� : ");
//age = sc.nextInt();

