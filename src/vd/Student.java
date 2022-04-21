package vd;

import java.util.Arrays;

public class Student {

	private String name;
	private String std;
	private int id;
	private int[] marks;
	private double finalScore;

	public Student() {
	}

	public Student(int id, String name, String std, int[] marks) {
		this.id = id;
		this.name = name;
		this.std = std;
		this.marks = marks;

		calculateScore();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStd() {
		return std;
	}

	public void setStd(String std) {
		this.std = std;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int[] getMarks() {
		return marks;
	}

	public void setMarks(int[] marks) {
		this.marks = marks;
	}

	public double getFinalScore() {
		return finalScore;
	}

	public void setFinalScore(double finalScore) {
		this.finalScore = finalScore;
	}

	public void calculateScore() {
		int sum = 0;
		for (int i = 0; i < marks.length; i++) {
			sum += marks[i];
		}

		this.finalScore = sum / 6;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", std=" + std + ", id=" + id + ", marks=" + Arrays.toString(marks) + "]";
	}

}
