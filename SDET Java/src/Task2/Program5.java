package Task2;

public class Program5 {

	int sec;
	int min;
	int hr;

	public Program5(int hr, int min, int sec) {
		this.hr = hr;
		this.min = min;
		this.sec = sec;
	}

	public static void main(String[] args) {

		// create objects of Time class

		Program5 start = new Program5(6, 00, 29);
		Program5 stop = new Program5(11, 30, 32);
		Program5 diff;

		// call difference method
		diff = difference(start, stop);

		System.out.printf("TIME DIFFERENCE: %d:%d:%d - ", start.hr, start.min, start.sec);
		System.out.printf("%d:%d:%d ", stop.hr, stop.min, stop.sec);
		System.out.printf("= %d:%d:%d\n", diff.hr, diff.min, diff.sec);
	}

	public static Program5 difference(Program5 start, Program5 stop) {
		Program5 diff = new Program5(0, 0, 0);

		// if start second is greater
		// convert minute of stop into seconds
		// and add seconds to stop second
		if (start.sec > stop.sec) {
			--stop.min;
			stop.sec += 60;
		}

		diff.sec = stop.sec - start.sec;

		// if start minute is greater
		// convert stop hour into minutes
		// and add minutes to stop minutes
		if (start.min > stop.min) {
			--stop.hr;
			stop.min += 60;
		}

		diff.min = stop.min - start.min;
		diff.hr = stop.hr - start.hr;

		// return the difference time
		return (diff);
	}

}
