package com.github.thesis.model;

/**
 * @author PRECUP Cristina
 * @author cpcristinaprecup@gmail.com
 *
 */

public class Thesis {
	private static final double MIN = 5.0;
	private static final double AVERAGE_MIN = 6.0;
	
	private int id;
	private final String title;
	private double theoryMark;
	private double dissertationMark;
	
	/**
	 * Constructor
	 * @param title
	 */
	public Thesis(String title) {
		this.title = title;
		this.theoryMark = 0;
		this.dissertationMark = 0;
	}	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Constructor
	 * @param title
	 * @param theoryMark
	 * @param dissertationMark
	 */
	public Thesis(String title, double theoryMark, double dissertationMark) {
		this.title = title;
		this.theoryMark = theoryMark;
		this.dissertationMark = dissertationMark;
	}

	/**
	 * @return the theoryMark
	 */
	public double getTheoryMark() {
		return theoryMark;
	}

	/**
	 * @param theoryMark the theoryMark to set
	 */
	public void setTheoryMark(float theoryMark) {
		this.theoryMark = theoryMark;
	}

	/**
	 * @return the dissertationMark
	 */
	public double getDissertationMark() {
		return dissertationMark;
	}

	/**
	 * @param dissertationMark the dissertationMark to set
	 */
	public void setDissertationMark(float dissertationMark) {
		this.dissertationMark = dissertationMark;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	
	/**
	 * @return the average between theoryMark and dissertationMark
	 */
	public double getAverageMark() {
		return (theoryMark + dissertationMark)/2;
	}
	
	/**
	 * 
	 * @return false, if student doesn't pass the examination
	 *         true, otherwise
	 */
	public boolean passExamination() {
		if((theoryMark < MIN) || (dissertationMark < MIN) || getAverageMark() < AVERAGE_MIN)
			return false;
		return true;
	}
	
}
