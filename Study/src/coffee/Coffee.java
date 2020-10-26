package coffee;

public class Coffee {

	// 커피음료 자체에 대한 클래스

	// 커피의 속성들.
	private String coffeeTemp;
	private String coffeeBeanName;
	private String coffeeName;
	private String coffeeSize;
	private int coffeeCount;

	// getters
	public String getCoffeeTemp() {
		return coffeeTemp;
	}
	// 커피 온도 불러오기(출력)

	public String getCoffeeBeanName() {
		return coffeeBeanName;
	}
	// 커피콩 이름 불러오기(출력)

	public String getCoffeeName() {
		return coffeeName;
	}
	// 커피 이름 불러오기(출력)

	public String getCoffeeSize() {
		return coffeeSize;
	}
	// 커피 크기 불러오기(출력)

	public int getCoffeeCount() {
		return coffeeCount;
	}
	// 커피 개수 불러오기(출력)

	// setters
	public void setCoffeeTemp(String coffeeTemp) {
		this.coffeeTemp = coffeeTemp;
	}
	// 커피 온도 입력받기(입력)

	public void setCoffeeBeanName(String coffeeBeanName) {
		this.coffeeBeanName = coffeeBeanName;
	}
	// 커피콩 이름 입력받기(입력)

	public void setCoffeeName(String coffeeName) {
		this.coffeeName = coffeeName;
	}
	// 커피 이름 입력받기(입력)

	public void setCoffeeSize(String coffeeSize) {
		this.coffeeSize = coffeeSize;
	}
	// 커피 사이즈 입력받기(입력)

	public void setCoffeeCount(int coffeeCount) {
		this.coffeeCount = coffeeCount;
	}
	// 커피 수량 입력받기(입력)
}
