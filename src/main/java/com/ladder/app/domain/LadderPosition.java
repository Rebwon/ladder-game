package com.ladder.app.domain;

import java.util.Objects;

public class LadderPosition {
	private int countOfRows;
	private int nthOfPersons;

	public LadderPosition(int countOfRows, int nthOfPerson) {
		this.countOfRows = countOfRows;
		this.nthOfPersons = nthOfPerson;
	}

	public int getCountOfRows() {
		return countOfRows;
	}

	public int getNthOfPersons() {
		return nthOfPersons;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		LadderPosition that = (LadderPosition)o;
		return countOfRows == that.countOfRows &&
			nthOfPersons == that.nthOfPersons;
	}

	@Override
	public int hashCode() {
		return Objects.hash(countOfRows, nthOfPersons);
	}
}
