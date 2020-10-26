package kh.java.point.model.vo;

public abstract class Grade {
	
	public String name;		// �̸�
	public String rank;		// ���
	public int score;		// ����Ʈ���� ��	//�־���ϳ�..
	public int purchase;	//���űݾ�
	public double interest;	//��������Ʈ
	public int point;	// ����Ʈ=���űݾ�*����
	public int index;
	
	public Grade() {}
	public Grade(String name, String rank, int score) {
		//this.index = 0;
		this.name = name;
		this.rank = rank;
		this.setScore(score);
	}
	
	public abstract int point();	// ����Ʈ
	
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
		return "[�ε��� = " + index + "\t �̸�= " + name + "\t ���= " + rank + "\t ����= " + score +"]";
	}

}
