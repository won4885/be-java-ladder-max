package kr.codesquad;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Console implements Printer {
    public Console() {
    }

    @Override
    public void askParticipants() {
        System.out.println("참여할 사람은 몇 명인가요?");
    }

    @Override
    public void askLadderHeight() {
        System.out.println("최대 사다리 높이는 몇 개인가요?");
    }

    public int returnIntInput() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(br.readLine());
    }
}
