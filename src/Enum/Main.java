package Enum;

class Main {
	public enum Day {
		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
	}

	Day day;

	public Main(Day day) {
		this.day = day;
	}

	public void tellItLikeItIs() {
		switch (day) {
		case MONDAY:
			System.out.println("Mondays are bad.");
			break;

		case FRIDAY:
			System.out.println("Fridays are better.");
			break;

		case SATURDAY:
		case SUNDAY:
			System.out.println("Weekends are best.");
			break;

		default:
			System.out.println("Midweek days are so-so.");
			break;
		}
	}

	public static void main(String[] args) {
		Main firstDay = new Main(Day.MONDAY);
        firstDay.tellItLikeItIs();
        Main thirdDay = new Main(Day.WEDNESDAY);
        thirdDay.tellItLikeItIs();
        Main fifthDay = new Main(Day.FRIDAY);
        fifthDay.tellItLikeItIs();
        Main sixthDay = new Main(Day.SATURDAY);
        sixthDay.tellItLikeItIs();
        Main seventhDay = new Main(Day.SUNDAY);
        seventhDay.tellItLikeItIs();
	}
}
