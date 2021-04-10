
public class LinkedNode<CollegeCourse> {
	public CollegeCourse element;
	public LinkedNode<CollegeCourse> next;
	
	public LinkedNode(CollegeCourse element){
		this.element = element;
		next = null;
	}

	public CollegeCourse getElement() {
		return element;
	}

	public void setElement(CollegeCourse element) {
		this.element = element;
	}

	public LinkedNode<CollegeCourse> getNext() {
		return next;
	}

	public void setNext(LinkedNode<CollegeCourse> next) {
		this.next = next;
	}

//	@Override
	public String toString() {
		return "LinkedNode [element=" + element + ", next=" + next + "]";
	}

	
}
