package chapter19;

public class GenericStack<E> {
	private E[] list = (E[])new Object[10];
	private int size = 0;
 	
 	/** Return size of the stack */
	public int getSize() {
		return size;
	}

	/* Return the top element from the stack */
	public E peek() {
		return list[size - 1];
	}

	/* Add new element to the top of the stack */
	public void push(E o) {
		if (size >= list.length) {
			doubleList();
		}
		list[size++] = o;
	}

	/* Remove top element from stack */
	public E pop() {
		E o = list[--size];
		return o;
	}

	/* Check if stack is empty */
	public boolean isEmpty() {
		return size == 0;
	}

	/* Creating new array of double the size and copying contents */
	private void doubleList() {
		E[] tempList = (E[])new Object[list.length * 2];
		System.arraycopy(list, 0, tempList, 0, list.length);
		list = tempList;
	}

	@Override // Override toString
	public String toString() {
		return "stack: " + list.toString();
	}
}