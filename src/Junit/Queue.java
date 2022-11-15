// TP Partie 1 : Gestion de file FIFO, Flobert JOHNSON 3eme Bachelor CDA option Full Stack
package Junit;
import java.util.*;

public class Queue {
	
	int rear = 0,front = 0,size = 0;
	LinkedList<Integer> tab = new LinkedList<Integer>();
	public void push(int elem) {
		tab.add(null);
		tab.set(rear,elem);
		size++;
		rear++;
	}
	
	public int pop() {
		int elem = tab.get(front);
		size--;
		front++;
		return elem;
	}
	
	public int ValSuperieure() {
		int max = 0;
		if(size != 0) {
			max = Integer.MIN_VALUE;
			for(int i=0; i<size; i++) {
				if(tab.get(front+i) > max) {
					max = tab.get(front+i);
				}
			}	
		}
		return max;
	}
	
	
	public boolean isEmpty() {
		if(tab.size() == 0)	return true;
		else return false;		
	}
	
	
	public void show() {
		
		for(int i=0; i<size; i++) {
			System.out.print(tab.get(front+i)+" ");
		}
	}
	
	
	public int size() {
		return size;
	}
	
	public int front() {
		return tab.get(front);
	}

}






/*	public int ValSuperieure(LinkedList<Integer> list) {
int max = 0;
if(list.size() != 0) {
	max = Integer.MIN_VALUE;
	for(int i=0; i<list.size(); i++) {
		if(list.get(i) > max) {
			max = list.get(i);
		}
	}	
}
return max;
}
*/