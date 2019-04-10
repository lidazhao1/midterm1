package pkgGame;
import java.util.Comparator;
public class Cuboid extends Rectangle{
    private int iDepth;
    public static void main(String[] args) {

    }
    
    public Cuboid(int width, int length, int depth) {
        super(length, width);
        if(depth<0){
            throw new IllegalArgumentException();
        }
        this.iDepth=depth;
    }

    public int getDepth() {
        return iDepth;
    }

    public void setDepth(int depth){
        if(depth<0){
            throw new IllegalArgumentException();
        }
        this.iDepth=depth;
    }

    public double volume() {
        double volume = getLength()*getWidth()*getDepth();
        return volume;
    }

    @Override
    public double area() {
        double area = 2*(getLength()*getWidth())+2*(getLength()*getDepth())+2*(getDepth()*getWidth());
        return area;
    }
    @Override
    public double perimeter() {
    	throw new UnsupportedOperationException();
    }

    @Override
    public int compareTo(Object O) {
    	if(area() > ((Cuboid)O).area()) {
        	return 1;
        }else if (area() < ((Cuboid)O).area()) {
        	return -1;
        }else {
        	return 0;
        }
    }

    public class SortByArea implements Comparator<Cuboid>{
        SortByArea() {}
        public int compare(Cuboid A, Cuboid B) {
        	if(A.area() > B.area()) {
            	return 1;
            }else if  (A.area() < B.area()){
            	return -1;
            }else {
            	return 0;
            }
        }

    }
    public class SortByVolume implements Comparator<Cuboid>{
        SortByVolume(){}
        public int compare(Cuboid A, Cuboid B) {
        	if(A.volume() > B.volume()) {
            	return 1;
            }else if  (A.volume() < B.volume()){
            	return -1;
            }else {
            	return 0;
            }
        }

    }
}

