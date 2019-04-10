package pkgGame;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.Test;

public class RectangleTest {
	private Rectangle Arectangle;
	private Rectangle B;

	@Test
	public void Rectangle_test1(){
		Arectangle = new Rectangle(1,1);
		assertTrue(1 == Arectangle.getWidth());
		assertTrue(1 == Arectangle.getLength());	
	}
	@Test
	public void Rectangle_test3() {
		Arectangle = new Rectangle(1,1);
		assertFalse(0==Arectangle.getLength());
		assertFalse(0==Arectangle.getWidth());
	}
	@Test
	public void getWidth_test1(){
		Arectangle = new Rectangle(100,100);
		assertTrue(100 == Arectangle.getWidth());
	}
	@Test
	public void setWidth_test1(){
		Arectangle = new Rectangle(100,100);
		int iWidth = 100;
		Arectangle.setWidth(100);
		int width = Arectangle.getWidth();
		assertTrue(iWidth == width);
	}
	@Test
	public void setWidth_test2(){
		Arectangle = new Rectangle(100,100);
		int iWidth = 100;
		Arectangle.setWidth(99);
		int width = Arectangle.getWidth();
		assertFalse(iWidth == width);
	}
	
	@Test
	public void setLength_test1(){
		Arectangle = new Rectangle(100,100);
		int iLength = 100;
		Arectangle.setLength(100);
		int Length = Arectangle.getLength();
		assertTrue(iLength == Length);
	}
	@Test
	public void setLength_test2(){
		Arectangle = new Rectangle(100,100);
		int L = 100;
		Arectangle.setLength(6);
		int l = Arectangle.getLength();
		assertFalse(L==l);
	}
	@Test
	public void area_test1() {
		Arectangle = new Rectangle(1,1);
		assertEquals(Arectangle.area(),1);
	}
	@Test
	public void area_test2(){
		Arectangle = new Rectangle(1,1);
		assertFalse(100 == Arectangle.area());
	}
	@Test
	public void perimeter_test1(){
		Arectangle = new Rectangle(100,100);
		assertFalse(Arectangle.perimeter()==0);
	}
	@Test
	public void perimeter_test2(){
		Arectangle = new Rectangle(1,1);
		assertTrue(Arectangle.perimeter()==4);
	}
	@Test
	public void compareTo_test1() {
		Arectangle = new Rectangle(100,100);
		B = new Rectangle(100,100);
		assertTrue(B.compareTo(Arectangle)==0);
	}
	@Test
	public void compareTo_test2() {
		Arectangle = new Rectangle(1,2);
		B = new Rectangle(100,100);
		assertFalse(0==B.compareTo(Arectangle));
	}
	@Test
	public void compareTo_test3() {
		Arectangle = new Rectangle(100,100);
		B = new Rectangle(2,1);
		assertFalse(0==B.compareTo(Arectangle));
	}
	@Test( expected = IllegalArgumentException.class)
	public void setWidth_Exception_test() {
		Rectangle A = new Rectangle(1,1);
		A.setWidth(-16);
	}
	@Test( expected = IllegalArgumentException.class)
	public void Rectangle_Exception_test() {
		Rectangle r = new Rectangle(1,-1);
	}
	@Test( expected = IllegalArgumentException.class)
	public void setLength_Exception_test() {
		Rectangle S = new Rectangle(1,1);
		S.setLength(-1);
	}
}

