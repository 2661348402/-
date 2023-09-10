package summer_day14;

public class Student {
	private String name;
	private int english,chinese,math,sum;
	
	
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	Student(){}
	Student(String name,int chinese,int english,int math){
		this.chinese=chinese;
		this.english=english;
		this.math=math;
		this.name=name;
		sum=english+chinese+math;
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public int getChinese() {
		return chinese;
	}
	public void setChinese(int chinese) {
		this.chinese = chinese;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	

}
