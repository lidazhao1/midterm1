package pkgGame;

public class Rectangle extends Shape implements Comparable<Object> {
    private int iWidth;
    private int iLength;
    public static void main(String[] args) {
    }
    

    public  Rectangle(int iwidth, int ilength) {
        if(iwidth<=0||ilength<=0){
            throw new IllegalArgumentException();
        }
        iWidth=iwidth;
        iLength=ilength;
    }
    
    public int getWidth() {
        return iWidth;
    }
    
    public void setWidth(int iwidth){
        if(iwidth<0){
            throw new IllegalArgumentException();
        }
        iWidth=iwidth;
    }
    
    public int getLength() {
        return iLength;
    }
    
    public void setLength(int ilength){
    	try {
    		if(ilength<0)
    		{throw new IllegalArgumentException();}
    		}finally {
    			iLength=ilength;
    		}
    }
    
    @Override
    public double area() {
        double area = getLength()*getWidth();
        return area;
    }

    @Override
    public double perimeter() {
        double perimeter =2*(getLength()+getWidth());
        return perimeter;
    }
    
    @Override
    public int compareTo(Object o) {
        if(area() > ((Rectangle)o).area()) {
        	return 1;
        }else if (area() < ((Rectangle)o).area()) {
        	return -1;
        }else {
        	return 0;
        }
    }
}
