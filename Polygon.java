public class Polygon extends Isosceles
	{
	
	private int sides;
	
	// This polygon class assumes that the user uses the polygons sides length as the length (in constructor)
	
	public Polygon( double lengthValue, int sidesValue )
		{
			super(lengthValue / (2 * Math.sin(3.14159/sidesValue)) );
			sides = sidesValue;
		}

	public double polygonArea()
		{
			
			return area(360/sides) * sides;
		}
	
	public double perimeter()
		{
			return baseLength(360/sides) * sides;
		}
	
	
	}