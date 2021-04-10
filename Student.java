import java.util.ArrayList;

public class Student {
	
	public String name;
	public int year;
	public int numOfClasses = 0;
	
	public Student(String name, int year) {
		this.name = name;
		this.year = year;
	}
	
	ArrayList<Integer> gradeList = new ArrayList<Integer>();
	
	public char GradeAverage() {
		double total = 0;
		double average;
		try {
			for (int i = 0; i < numOfClasses; i++)
				total += gradeList.get(i);
			
			average = total / numOfClasses;
			
			if (average > 90) {
				return 'A';
			}
			else if (average > 80) {
				return 'B';
			}
			else if (average > 70) {
				return 'C';
			}
			else
				return 'D';
		}
		catch (Exception e) {
			return 'N';
		}
	}
	
	LinkedNode<CollegeCourse> head = null;
	
	public void AddCourse(Student student, LinkedNode<CollegeCourse> course) {
		if (head != null) {
			course.setNext(student.head);
			head = course;
			numOfClasses++;
		}
		else if (head == null) {
			head = course;
			numOfClasses++;
		}
	}
	
	public void RemoveCourse(LinkedNode<CollegeCourse> course) {
		// if the list is empty:
		if (head == null) {
			numOfClasses = 0;
			return;
		}
		// if there is only one node and it is course
		if (head.getNext() == null && course == head) {
			head = null;
			numOfClasses--;
			return;
		}
		// if there are more than two nodes
		else {
			LinkedNode<CollegeCourse> temp = head;
			while (temp.getNext() != null) {
				if (temp.getNext() == course) {
						temp.setNext(temp.getNext().getNext());
						numOfClasses--;
						return;
				}
			temp = temp.getNext();
			}
		}
	}

//	@Override
	public String toString() {
		return name + " " + year + " " + numOfClasses + " " + GradeAverage();
	}
}
