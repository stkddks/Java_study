package coffee;

public class Coffee {

	// Ŀ������ ��ü�� ���� Ŭ����

	// Ŀ���� �Ӽ���.
	private String coffeeTemp;
	private String coffeeBeanName;
	private String coffeeName;
	private String coffeeSize;
	private int coffeeCount;

	// getters
	public String getCoffeeTemp() {
		return coffeeTemp;
	}
	// Ŀ�� �µ� �ҷ�����(���)

	public String getCoffeeBeanName() {
		return coffeeBeanName;
	}
	// Ŀ���� �̸� �ҷ�����(���)

	public String getCoffeeName() {
		return coffeeName;
	}
	// Ŀ�� �̸� �ҷ�����(���)

	public String getCoffeeSize() {
		return coffeeSize;
	}
	// Ŀ�� ũ�� �ҷ�����(���)

	public int getCoffeeCount() {
		return coffeeCount;
	}
	// Ŀ�� ���� �ҷ�����(���)

	// setters
	public void setCoffeeTemp(String coffeeTemp) {
		this.coffeeTemp = coffeeTemp;
	}
	// Ŀ�� �µ� �Է¹ޱ�(�Է�)

	public void setCoffeeBeanName(String coffeeBeanName) {
		this.coffeeBeanName = coffeeBeanName;
	}
	// Ŀ���� �̸� �Է¹ޱ�(�Է�)

	public void setCoffeeName(String coffeeName) {
		this.coffeeName = coffeeName;
	}
	// Ŀ�� �̸� �Է¹ޱ�(�Է�)

	public void setCoffeeSize(String coffeeSize) {
		this.coffeeSize = coffeeSize;
	}
	// Ŀ�� ������ �Է¹ޱ�(�Է�)

	public void setCoffeeCount(int coffeeCount) {
		this.coffeeCount = coffeeCount;
	}
	// Ŀ�� ���� �Է¹ޱ�(�Է�)
}
