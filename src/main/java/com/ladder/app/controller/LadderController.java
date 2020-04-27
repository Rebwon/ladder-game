package com.ladder.app.controller;

import com.ladder.app.domain.LadderGame;
import com.ladder.app.view.InputView;

public class LadderController {
	public void run() {
		LadderGame ladderGame = new LadderGame(InputView.createLadderPosition());
		ladderGame.drawLine(InputView.createLadderLine());
		ladderGame.run(InputView.startGamerPosition());
	}
}
