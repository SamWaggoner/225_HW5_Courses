// I helped out Graham Bridges with his code. graham.bridges@maine.edu
public class StudentTester {

	public static void main(String[] args) {
		// make the students
		Student matt = new Student("Matt",2);
		Student liz = new Student("Elizabeth",2);
		Student chris = new Student("Chris",2);
		
		// make the college courses
		CollegeCourse cos125 = new CollegeCourse("COS125",200);
		CollegeCourse cos225 = new CollegeCourse("COS225",200);
		CollegeCourse cos331 = new CollegeCourse("COS331",200);
		CollegeCourse cos420 = new CollegeCourse("COS420",200);
		
		// make individual nodes for each course
		LinkedNode<CollegeCourse> m125 = new LinkedNode<CollegeCourse>(cos125);
		LinkedNode<CollegeCourse> m225 = new LinkedNode<CollegeCourse>(cos225);
		LinkedNode<CollegeCourse> m331 = new LinkedNode<CollegeCourse>(cos331);
		LinkedNode<CollegeCourse> m420 = new LinkedNode<CollegeCourse>(cos420);
		
		LinkedNode<CollegeCourse> l125 = new LinkedNode<CollegeCourse>(cos125);
		LinkedNode<CollegeCourse> l225 = new LinkedNode<CollegeCourse>(cos225);
		LinkedNode<CollegeCourse> l331 = new LinkedNode<CollegeCourse>(cos331);
		LinkedNode<CollegeCourse> l420 = new LinkedNode<CollegeCourse>(cos420);
		
		LinkedNode<CollegeCourse> c125 = new LinkedNode<CollegeCourse>(cos125);
		LinkedNode<CollegeCourse> c225 = new LinkedNode<CollegeCourse>(cos225);
		LinkedNode<CollegeCourse> c331 = new LinkedNode<CollegeCourse>(cos331);
		LinkedNode<CollegeCourse> c420 = new LinkedNode<CollegeCourse>(cos420);
		
		// add the courses to each student's linked list
		matt.AddCourse(matt, m420);
		matt.AddCourse(matt, m331);
		matt.AddCourse(matt, m225);
		matt.AddCourse(matt, m125);
		
		liz.AddCourse(liz, l420);
		liz.AddCourse(liz, l331);
		liz.AddCourse(liz, l225);
		liz.AddCourse(liz, l125);
		
		chris.AddCourse(chris, c420);
		chris.AddCourse(chris, c331);
		chris.AddCourse(chris, c225);
		chris.AddCourse(chris, c125);
		
		// add grades so that averages result in an A, B, and a C
		matt.gradeList.add(90);
		matt.gradeList.add(96);
		matt.gradeList.add(93);
		matt.gradeList.add(93);
		
		liz.gradeList.add(80);
		liz.gradeList.add(90);
		liz.gradeList.add(70);
		liz.gradeList.add(100);
		
		chris.gradeList.add(86);
		chris.gradeList.add(67);
		chris.gradeList.add(85);
		chris.gradeList.add(81);
		
		// print the last two students
		System.out.println(liz);
		System.out.println(chris);
		
		// print first student's grade average
		System.out.println(matt.GradeAverage());
		
		// remove cos331 from every student
		matt.RemoveCourse(m331);
		liz.RemoveCourse(l331);
		chris.RemoveCourse(c331);
		// removing the grades for cos331
		matt.gradeList.remove(2);
		liz.gradeList.remove(2);
		chris.gradeList.remove(2);
		
		// print the last student's toString()
		System.out.println(chris);
		
	}
}
