public class Box extends Rectangle
	{
	
	double height;
	
	public Box( double lengthValue, double widthValue, double heightValue )
		{
			super(lengthValue, widthValue);
			height = heightValue;
		}
	
	public double volume()
		{
			return area() * height;
		}
	
	public double surfaceArea()
		{
			return 2 * area() + perimeter() * height;
		}
	
	public double bodyDiagonalLength()
		{	
			
			return Math.sqrt(diagonalLength() * diagonalLength() + height * height);
			
		}
	
	public double angle()
		{
			return Math.toDegrees(Math.asin( height / bodyDiagonalLength() ));
		}
	
	
	//public double getHeight()
		//{
			//return height;
		//}
	
	
	}