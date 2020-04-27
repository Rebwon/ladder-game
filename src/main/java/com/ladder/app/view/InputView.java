package com.ladder.app.view;

import java.util.Scanner;

import com.ladder.app.domain.LadderPosition;

public class InputView {
	private static final Scanner SCANNER = new Scanner(System.in);

	public static int startGamerPosition() {
		System.out.println("시작할 사다리 번호를 입력하세요");
		return SCANNER.nextInt();
	}

	public static LadderPosition createLadderPosition() {
		System.out.println("초기 사다리의 높이와 참여할 인원을 입력하세요");
		return new LadderPosition(SCANNER.nextInt(), SCANNER.nextInt());
	}

	public static LadderPosition createLadderLine() {
		System.out.println("사다리 라인을 그을 높이와 참여할 인원을 입력하세요");
		return new LadderPosition(SCANNER.nextInt(), SCANNER.nextInt());
	}
}
