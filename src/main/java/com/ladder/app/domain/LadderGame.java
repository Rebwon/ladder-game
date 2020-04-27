package com.ladder.app.domain;

public class LadderGame {
	private int[][] rows;

	public LadderGame(LadderPosition ladderPosition) {
		rows = new int[ladderPosition.getCountOfRows()][ladderPosition.getNthOfPersons()];
	}

	public void drawLine(LadderPosition ladderPosition) {
		rows[ladderPosition.getCountOfRows()][ladderPosition.getNthOfPersons()] = 1;
		rows[ladderPosition.getCountOfRows()][ladderPosition.getNthOfPersons()+1] = 1;
	}

	public int run(int nthOfPerson) {
		for (int i = 0; i < rows.length; i++) {
			int[] row = rows[i];

			if(row[nthOfPerson] == 0) {
				continue;
			}
			if(nthOfPerson -1 >= 0) {
				int leftValue = row[nthOfPerson-1];
				if(leftValue == 1) {
					nthOfPerson -= 1;
					continue;
				}
			}
			nthOfPerson += 1;
		}
		return nthOfPerson;
	}
}
