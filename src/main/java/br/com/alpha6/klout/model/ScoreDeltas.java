package br.com.alpha6.klout.model;

/**
 * Class with all the score deltas of an user. Contains the score
 * changes for the day, week and month.
 */
public class ScoreDeltas {

	public double dayChange;
	public double weekChange;
	public double monthChange;

	/**
	 * Creates a new instance of this class
	 */
	public ScoreDeltas() {}
	
	/**
	 * Creates a new instance of this class with all data information defined.
	 * 
	 * @param dayChange the score changes for the day.
	 * @param weekChange the score changes for the day.
	 * @param monthChange the score changes for the month.
	 */
	public ScoreDeltas(double dayChange, double weekChange, double monthChange) {
		this.dayChange = dayChange;
		this.weekChange = weekChange;
		this.monthChange = monthChange;
	}
	
	/**
	 * Returns the score changes for the day.
	 *
	 * @return score changes for the day.
	 */
	public double getDayChange() {
		return dayChange;
	}

	/**
	 * Defines the score changes for the day.
	 * 
	 * @param dayChange the score changes for the day.
	 */
	public void setDayChange(double dayChange) {
		this.dayChange = dayChange;
	}

	/**
	 * Returns the score changes for the week.
	 *
	 * @return score changes for the week.
	 */
	public double getWeekChange() {
		return weekChange;
	}

	/**
	 * Defines the score changes for the week.
	 * 
	 * @param weekChange the score changes for the week.
	 */
	public void setWeekChange(double weekChange) {
		this.weekChange = weekChange;
	}

	/**
	 * Returns the score changes for the month.
	 *
	 * @return score changes for the month.
	 */
	public double getMonthChange() {
		return monthChange;
	}

	/**
	 * Defines the score changes for the week.
	 * 
	 * @param monthChange the score changes for the week.
	 */
	public void setMonthChange(double monthChange) {
		this.monthChange = monthChange;
	}

	@Override
	public String toString() {
		return "ScoreDeltas{" +
				"dayChange=" + dayChange +
				", weekChange=" + weekChange +
				", monthChange=" + monthChange +
				'}';
	}
}
