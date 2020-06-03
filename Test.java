public class Test
{
	
	public static void main(String []  args)
		{
			System.out.println("Old code:");
			Box steve = new Box(2, 2, 2);
			//System.out.println("height: " + steve.getHeight());
			System.out.println("vol: " + steve.volume());
			System.out.println("surface area: " + steve.surfaceArea());
			System.out.println("diagonal: " + steve.bodyDiagonalLength());
			System.out.println("angle: " + steve.angle());
		}
}