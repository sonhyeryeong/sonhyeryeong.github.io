//삼각형
//중심점(x,y)
//밑변
//높이
public class Triangle extends Shape{
	private int base;
	private int height;
	
	public Triangle(int x, int y, int base, int height) {
		super(x, y);//부모클래스
		this.base = base;
		this.height = height;
	}
	
	//구현한다. 
	@Override
	public int getArea() {
		return (base*height)/2;
	}
	

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Triangle [base=" + base + ", height=" + height + "]";
	}
	
	
	
	

}
