
public class Box
{
     private int width;
     private int height;
     private int depth;
     
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	public int getDepth() {
		return depth;
	}
	
	public Box(int width, int height, int depth) {
		super();
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
    public int volume()
    {
    	return getWidth()*getHeight()*getDepth();
    }
    public static void main(String args[])
    {
    	Box b=new Box(2,4,6);
    	System.out.println(b.volume());
    }
}
