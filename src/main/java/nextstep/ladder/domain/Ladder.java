package nextstep.ladder.domain;

import java.util.Collections;
import java.util.List;

public class Ladder {
    final List<Line> lines;
    public Ladder(List<Line> lines) {
        this.lines = lines;
        for (int i = 0; i < lines.size(); i++) {
            lines.get(i).assignPosition(i + 1);
        }
    }

    public List<Line> getLines() {
        return Collections.unmodifiableList(lines);
    }

    public Line getLineByPosition(int position) {
        return lines.get(position - 1);
    }

    public int getLinePointsHeight() {
        return lines.get(0).size();
    }
}
