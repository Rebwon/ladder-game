package com.ladder.app.domain;

import static org.junit.Assert.*;

import org.junit.Test;

public class LadderGameTest {

	@Test
	public void drawLine() {
		LadderGame ladderGame = new LadderGame(new LadderPosition(4, 3));
		ladderGame.drawLine(new LadderPosition(1, 1));

		assertEquals(2, ladderGame.run(1));
	}

	@Test
	public void multiRows() {
		LadderGame ladderGame = new LadderGame(new LadderPosition(3, 4));
		ladderGame.drawLine(new LadderPosition(0,0));
		ladderGame.drawLine(new LadderPosition(1, 1));
		ladderGame.drawLine(new LadderPosition(2, 2));

		assertEquals(3, ladderGame.run(0));
		assertEquals(0, ladderGame.run(1));
		assertEquals(1, ladderGame.run(2));
		assertEquals(2, ladderGame.run(3));
	}
}