package kh.java.point.model.vo;

public class Gold extends Grade{
	
	public Gold() {}
	public Gold(String name, String rank, int score) {
		this.name = name;
		this.rank = "Gold";
		this.setScore(score);
	}


	public int point(int purchase) {
		double interest = 0.05;
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
//		double interest = 0.05;
//		point = score*0.03;
//	}