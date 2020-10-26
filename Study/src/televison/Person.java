package televison;
import java.util.Scanner;

//import oop.sample.Person;
public class Person {
	Scanner sc = new Scanner(System.in);

    //field
    private String name;
    private int age;
    private String gender; // 멤버필드
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
//        	System.out.println("환영합니다"+name+"님!");
//        }
//        else {
//        	
//        	System.out.println(name+"! 당신은 가족 구성원으로 등록되지 않았습니다. 프로그램을 강제 종료합니다. 안녕히가세요ㅎㅎ");
//        	System.exit(0);
//        }
//    	}
    }
    public void setAge(int age) {
        if (age < 1)
            System.out.println("나이는 1살부터 가능합니다.");
        else
            this.age = age;
    }
    public void setGender(String gender) {
        if ((!gender.equals("남자")) && (!gender.equals("여자")))
            System.out.println("성별은 남자와 여자만 있습니다.");
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
//            System.out.println(name + "이(가) 텔레비전 켜기를 시도했습니다.");
//        else
//            System.out.println(name + "이(가) 텔레비전 끄기를 시도했습니다.");
//        tv.setPower(power);
//    }
//    public void setTelevisionVolume(Television tv, int volume) {
//        System.out.println(name + "이(가) 텔레비전 볼륨을 " + volume + "으로 설정하기를 시도했습니다.");
//        tv.setVolume(volume);
//    }
//    public void setTelevisionChannel(Television tv, int channel) {
//        System.out.println(name + "이(가) 텔레비전 채널을 " + channel + "으로 설정하기를 시도했습니다.");
//        tv.setChannel(channel);
//    }
//    public void setTelevisionBrightness(Television tv, double brightness) {
//        System.out.println(name + "이(가) 텔레비전 밝기를 " + brightness + "으로 설정하기를 시도했습니다.");
//        tv.setBrightness(brightness);
//    }
    
    public Person(String name, int age, String gender) {		// 매개변수 있는 생성자
      	 this.name=name;
      	 this.age=age;
      	 this.gender=gender;
      	}
    
    public String toString() {
		return "[이름=" + name + ", 나이=" + age + ", 성별=" + gender +"]";
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

//System.out.print(count+"번째 구성원 이름 : ");
//name = sc.next();	//
//System.out.print("구성원 나이 : ");
//age = sc.nextInt();

