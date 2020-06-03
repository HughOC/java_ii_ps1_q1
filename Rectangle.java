public class Rectangle
	{
	
		private double length, width;
	
		public Rectangle(double lengthValue, double widthValue)
		{
			
			length = lengthValue;
			width = widthValue;
		
		}
		public double area()
		{
			return length * width;
		}
		
		public double perimeter()
		{
			return 2 * length + 2 * width;
		}
		
		public double diagonalLength()
		{
			return Math.sqrt( length * length + width * width );
		}
	
	}