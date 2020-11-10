package membership.model.vo;

import kh.java.point.model.vo.Grade;

public class Silver extends Grade{

	public Silver() {}
	public Silver(String name, String rank, int score) {
		//this.index = index;
		this.name = name;
		this.rank = "Silver";
		this.score = score;
	}
	
	public int point(int purchase) {
		double interest = 0.03;
		point = (int)(purchase*interest);
		return point; 
	}
	
	public double getInterest() {
		return interest;
	}
	
	@Override
	public int point() {
		// TODO Auto-generated method stub
		return 0;
	}
}
	
	
//double interest = 0.03;     

//	@Override
//	public void interest() {
//		double interest = 0.03;
//		point = score*interest; 
//	}

//Grade a = new Grade;
//a.setInterest(score);
	
	
	
	
	
	
	
	
//
//	@Override
//	public int getInterest() {
//		// TODO Auto-generated method stub
//		return 0;
//	}


