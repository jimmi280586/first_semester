
public class Time
{
	private int hours;
	private int minutes;
	private int seconds;
	
	public Time(int hours, int minutes, int seconds) 
	{
		super();
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	public int getSeconds() {
		return seconds;
	}

	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}

	@Override
	public String toString() {
		return hours + ":" + minutes + ":" + seconds;
	}
	
	public Time copy()
	{
		return new Time(hours, minutes, seconds);
	}
	

	public void advanceSeconds()
	   {
	      this.seconds++;
	      if (this.seconds == 60)
	      {
	         this.seconds = 0;
	         this.minutes++;
	         if (this.minutes == 60)
	         {
	            this.minutes = 0;
	            this.hours++;
	            if (this.hours == 24)
	            {
	               this.hours = 0;
	            }
	         }
	      }

	   }
}
