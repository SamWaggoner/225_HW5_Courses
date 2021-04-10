
public class CollegeCourse {
	public String courseName;
	public int maxCapacity;
	
	public CollegeCourse(String courseName, int maxCapacity) {
		this.courseName = courseName;
		this.maxCapacity = maxCapacity;
	}
	
//	@Override
	public String toString() {
		return courseName + "   " + maxCapacity;
	}
}
