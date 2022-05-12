package nextstep.ladder.controller;

import nextstep.ladder.domain.Ladder;
import nextstep.ladder.domain.Line;
import nextstep.ladder.view.ResultView;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    public static void main(String[] args) {
        List<Line> lines = new ArrayList<>();
        lines.add(new Line(List.of(true,true)));
        lines.add(new Line(List.of(true,false)));
        lines.add(new Line(List.of(false,false)));

        Ladder ladder = new Ladder(lines);
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < ladder.getLinePointsHeight(); i++) {
            sb = ResultView.makeLadderByPoint(ladder, sb, i);
        }

        System.out.println(sb.toString());
    }


}
