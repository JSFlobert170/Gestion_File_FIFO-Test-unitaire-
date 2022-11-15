// Gestion de file FIFO, Flobert JOHNSON 3eme Bachelor CDA option Full Stack
package Junit;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class QueueTest {
	
	LinkedList<Integer> list = new LinkedList<Integer>();
//	Queue test = new Queue();
	
	@Test
	public void TestPush() {
		Queue test = new Queue();
		assertTrue(test.isEmpty());
		test.push(4); 
        test.push(23); 
        assertFalse(test.isEmpty());
	}
	
	@Test
	public void TestPop(){
		Queue tt = new Queue();
		assertEquals(0, tt.size());
	 	tt.push(45);
        tt.push(3458);
        assertEquals(2, tt.size());
        tt.push(11);
        tt.push(6);
        tt.push(4);  
        tt.pop();
        int front = tt.pop();
        assertEquals(3458, front);
        assertEquals(11, tt.ValSuperieure());
        assertEquals(3, tt.size());
	}
	
	@Test
	public void TestPlusGrandNombre() {
		Queue tt = new Queue();
        tt.push(14);
        tt.push(4);
        tt.push(3);
        tt.push(9);

        System.out.print("size : "+tt.size());
        System.out.print("front"+tt.front());
        
	    int GrandeValeur = tt.ValSuperieure();
	    System.out.print("Grandevaleur : "+GrandeValeur);
	    System.out.println("Taille de LinkedList = " + list.size());
	    assertEquals(14, GrandeValeur);
	}
	
	@Test
	public void TestNombreMelange() {
		Queue tt = new Queue();
		tt.push(4); 
        tt.push(23); 
        tt.push(7); 
        tt.push(1); 
        assertEquals(23, tt.ValSuperieure());
	}
	
	@Test
	public void TestNombreNegatif(){
	Queue list = new Queue();
		list.push(-4); 
        list.push(-9); 
        list.push(-1); 
        list.push(-7); 
        assertEquals(-1, list.ValSuperieure());
	}
	
	@Test
	public void TestFront(){
		Queue tt = new Queue();
		tt.push(59); 
        tt.push(23); 
        tt.push(47);
        assertEquals(59, tt.front());
        tt.pop();
        assertEquals(23, tt.front());
	}
	
	@Test
	public void TestSize(){
		Queue tt = new Queue(); 
		assertEquals(0, tt.size());
        tt.push(23); 
        tt.push(7); 
        tt.push(10); 
        tt.push(234); 
        tt.push(47);
        assertEquals(5, tt.size());
	}
	
	@Test
	public void TestIsEmpty() throws NullPointerException {
			
			Queue tt = new Queue();	
//	        list.removeAll(list);  // Vider le tableau       
	        assertTrue(tt.isEmpty());
	        assertEquals(0, tt.size());
	        tt.push(23);
 	      	assertFalse(tt.isEmpty());  		   
	}
	
/*	@Test
	public void TestNombreVirgule(){
	
	}

	@Test
	public void TestIsLettre() {
	  	try{
			list.add(4); 
	        list.add(9); 
	        list.add(7); 
	        list.add(1); 
	        
	        int GrandeValeur = test.ValSuperieure(list);
	        assertEquals(9, GrandeValeur);   
  		}
		catch(Exception e) {
    		System.out.print("D�sol� la valeur saisie n'est pas un nombre.");
		}
	}
	
*/
}
