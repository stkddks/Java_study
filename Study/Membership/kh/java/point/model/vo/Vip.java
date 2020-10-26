package kh.java.point.model.vo;

public class Vip extends Grade{
	
	public Vip() {}
	public Vip(String name, String rank, int score) {
		this.name = name;
		this.rank = "Vip";
		this.setScore(score);
	}
	
	public int point(int purchase) {
		double interest = 0.10;
		point = (int)(purchase*interest);
		return point; 
	}
	
	@Override
	public int point() {
		// TODO Auto-generated method stub
		return 0;
	}
}


//	@Override
//	public void interest() {
//		double interest = 0.10;
//		point = score*0.03;
//		// TODO Auto-generated method stub
//		
//	}