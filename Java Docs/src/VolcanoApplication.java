class VolcanoApplication 
{
	public static void main (String[] arguments)
	{
	VolcanoRobot dante = new VolcanoRobot ();
	System.out.println("Dante:");
	dante.status = "exploring";
	dante.speed = 2;
	dante.temperature = 510;
	
	dante.showAttributes();
System.out.println("Increasing speed to 3.");
dante.speed = 3;
System.out.println("Changing temperature to 670.");
dante.temperature = 670;



















dante.showAttributes();
System.out.println("Checking the temperature.");
dante.checkTemperature();
dante.showAttributes();

VolcanoRobot virgil = new VolcanoRobot ();
System.out.println("Virgil:");
virgil.status = "exploring";
virgil.speed = 20;
virgil.temperature = 510;

virgil.showAttributes();

System.out.println("Increasing speed to 3.");
virgil.speed = 3;
System.out.println("Changing temperature to 670.");
virgil.temperature = 670;
dante.showAttributes();
System.out.println("Checking the temperature.");
virgil.checkTemperature();
virgil.showAttributes();

VolcanoRobot Becki = new VolcanoRobot();



System.out.println("Becki:");
Becki.status = "exploring";
Becki.speed = 20;
Becki.temperature = 510;

Becki.checkTemperature();
Becki.showAttributes();
	}
}