package kr.ac.kopoctc.algoritm.t2;

public class Student {
	
	public int studentid;
	public String name;
	public int kor;
	public int eng;
	public int mat;
	
	public Student (int studentid) {
		this.studentid = studentid;
		this.name = String.format("È«±æ%02d", studentid);
		this.kor = (int)(Math.random() * 100);
		this.eng = (int)(Math.random() * 100);
		this.mat = (int)(Math.random() * 100);
	}

}
