
public class Clock 
{
	private Time time;
	
	// constructor
	public Clock(Time time)
	{
		this.time = time.copy();
	}
	
	// constructor( from the exercise - very common)
	public Clock(int hours, int minutes, int seconds)
	{
		this.time = new Time(hours, minutes, seconds);
	}

	public Time getTime() {
		return time.copy();
	}

	@Override
	public String toString()
	{ //add a string to (some of) the fields
		return "Time is" + this.time.toString();
	}
	
	// standard copy method
	public Clock copy()
	{
		return new Clock(this.time.copy());
	}
	
	// pure delegation
	public void advanceSeconds()
	{
		this.time.advanceSeconds();
	}
}

