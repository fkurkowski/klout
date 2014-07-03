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
	 * Returns the score changes for the day.
	 *
	 * @return score changes for the day.
	 */
	public double getDayChange() {
		return dayChange;
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
	 * Returns the score changes for the month.
	 *
	 * @return score changes for the month.
	 */
	public double getMonthChange() {
		return monthChange;
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
