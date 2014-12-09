class VolcanoRobot5 
{
	String status;
	int speed;
	float temperature;
	
	VolcanoRobot5(int inspeed, float intemperature, String instatus) 
	{
			speed = inspeed;
			status = instatus;
			temperature = intemperature;
	}
	
	void checkTemperature() 
	{
		if (temperature>660) 
		{
			status = "returning home";
			speed = 5;
		}
	}
	void ShowAttributes()
	{
	System.out.println("Status: " + status);
	System.out.println("Speed: " + speed);
	System.out.println("Temperature: " + temperature);
	}
}
