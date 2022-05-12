package nextstep.ladder.view;

import nextstep.ladder.domain.Ladder;
import nextstep.ladder.domain.Line;

public class ResultView {

    public static StringBuilder makeLadderByPoint(Ladder ladder, StringBuilder sb, int point) {
        for (int i = 0; i < ladder.getLines().size() - 1 ; i++) {
            if(i == 0) sb.append("|");
            Line line = ladder.getLineByPosition(i + 1);
            Line compareLine = ladder.getLineByPosition(i + 2);
            if (line.isHaveLine(compareLine)) {
                if (line.getPoint(point).equals(compareLine.getPoint(point))) {
                    sb.append("-----|");
                } else {
                    sb.append("     |");
                }
            }
        }
        sb.append("\n");
        return sb;
    }
}
