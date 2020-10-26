package kh.java.point.model.vo;

public abstract class Grade {
	
	public String name;		// 이름
	public String rank;		// 등급
	public int score;		// 포인트들의 합	//있어야하나..
	public int purchase;	//구매금액
	public double interest;	//이자포인트
	public int point;	// 포인트=구매금액*이자
	public int index;
	
	public Grade() {}
	public Grade(String name, String rank, int score) {
		//this.index = 0;
		this.name = name;
		this.rank = rank;
		this.setScore(score);
	}
	
	public abstract int point();	// 포인트
	
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	public String toString() {
		return "[인덱스 = " + index + "\t 이름= " + name + "\t 등급= " + rank + "\t 점수= " + score +"]";
	}

}
