package pkgGame;

import static org.junit.Assert.*;
import pkgGame.Cuboid.SortByArea;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.Test;

import pkgGame.Cuboid.SortByVolume;

public class CuboidTest {
	private Cuboid cuboid;
	private Cuboid Cuboid;
	@Test
	public void Cuboid_test1(){
		Cuboid = new Cuboid(1,1,1);
		assertFalse(1 != Cuboid.volume());
	}
	@Test
	public void Cuboid_test2(){
		Cuboid = new Cuboid(1,1,1);
		assertEquals(1 , Cuboid.volume());
	}
	@Test
	public void getDepth_test1(){
		Cuboid = new Cuboid(1,1,1);
		assertEquals(1 , Cuboid.getDepth());
	}
	@Test
	public void getDepth_test2(){
		Cuboid = new Cuboid(1,1,1);
		assertFalse(1 != Cuboid.getDepth());
	}
	@Test
	public void setDepth_test1(){
		int Depth = 49;
		Cuboid = new Cuboid(1,1,1);
		int depth = Cuboid.getDepth();
		assertTrue(Depth != depth);
	}
	@Test
	public void setDepth_test2(){
		int Depth = 100;
		Cuboid = new Cuboid(1,1,1);
		int depth = Cuboid.getDepth();
		assertFalse(Depth == depth);
	}
	@Test
	public void area_test1(){
		Cuboid = new Cuboid(1,1,1);
		double Area = Cuboid.area();
		assertFalse(6.00 != Cuboid.area());
	}
	@Test
	public void area_test2(){
		Cuboid = new Cuboid(1,1,1);
		double Area = Cuboid.area();
		assertEquals(6.00 , Cuboid.area());
	}
	@Test
	public void volume_test1(){
		Cuboid = new Cuboid(1,1,1);
		double Volume = Cuboid.volume();
		assertTrue(1.00 == Cuboid.volume());
	}
	@Test
	public void volume_test2(){
		Cuboid = new Cuboid(1,1,1);
		double Volume = Cuboid.volume();
		assertFalse(2.00 == Cuboid.volume());
	}
	@Test
	public void setDepth_Test1() {
		Cuboid = new Cuboid(1,1,1);
		Cuboid.setDepth(1);
		int a = Cuboid.getDepth();
		assertTrue(a == 1);
	}
	@Test
	public void compareTo_Test1() {
		Cuboid= new Cuboid(1,1,2);
		cuboid= new Cuboid(1,1,1);
		assertTrue(Cuboid.compareTo(cuboid)==1);
	}
	@Test
	public void compareTo_Test2() {
		Cuboid= new Cuboid(1,1,2);
		cuboid= new Cuboid(1,1,1);
		assertTrue(cuboid.compareTo(Cuboid)!=1);
	}
	@Test
	public void compareTo_test3() {
		Cuboid = new Cuboid(1,1,1);
		cuboid = new Cuboid(1,1,1);
		assertTrue(cuboid.compareTo(Cuboid)==0);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void Cuboid_Exception_test() {
		Cuboid = new Cuboid(1,1,-1);
	}
	@Test(expected = UnsupportedOperationException.class)
	public void perimeter_Exception_test() {
		Cuboid = new Cuboid(1,1,1);
		Cuboid.perimeter();
		}
	@Test(expected = IllegalArgumentException.class)
	public void setDepth_Exception_test() {
		Cuboid = new Cuboid(1,1,1);
		Cuboid.setDepth(-7);
		}
	@Test
	public void SortByVolume_test1() {
		Cuboid = new Cuboid(1,1,1);
		cuboid = new Cuboid(1,1,2);
		SortByVolume Volume = cuboid.new SortByVolume();
		assertTrue(Volume.compare(Cuboid, cuboid)==-1);
	}
	@Test
	public void SortByVolume_test2() {
		Cuboid = new Cuboid(1,1,1);
		cuboid = new Cuboid(1,1,2);
		SortByVolume Volume = cuboid.new SortByVolume();
		assertFalse(Volume.compare(cuboid, Cuboid)!=1);
	}
	@Test
	public void SortByVolume_test3() {
		Cuboid = new Cuboid(1,1,1);
		cuboid = new Cuboid(1,1,1);
		SortByVolume Volume = cuboid.new SortByVolume();
		assertTrue(Volume.compare(Cuboid, cuboid)==0);
	}
	@Test
	public void SortByArea() {
		Cuboid = new Cuboid(1,1,1);
		cuboid = new Cuboid(1,1,1);
		SortByArea area = cuboid.new SortByArea();
		assertTrue(area.compare(Cuboid, cuboid)==0);
	}
	@Test
	public void SortByArea1() {
		Cuboid = new Cuboid(1,1,2);
		cuboid = new Cuboid(1,1,1);
		SortByArea area = cuboid.new SortByArea();
		assertTrue(area.compare(Cuboid, cuboid)==1);
	}
	@Test
	public void SortByArea2() {
		Cuboid = new Cuboid(1,1,1);
		cuboid = new Cuboid(1,1,2);
		SortByArea Volume = cuboid.new SortByArea();
		assertTrue(Volume.compare(Cuboid, cuboid)==-1);
	}
}

