package nextstep.ladder.domain;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

class LineTest {

    @Test
    void is_have_line_apart_test() {
        Line line1 = new Line(List.of(true,true,true,true));
        Line line2 = new Line(List.of(true,true,true,true));
        Line line3 = new Line(List.of(true,true,true,true));
        List<Line> lines = new ArrayList<>();
        lines.add(line1);
        lines.add(line2);
        lines.add(line3);
        Ladder ladder = new Ladder(lines);

        assertThat(line1.isHaveLine(line3)).isFalse();
    }

    @Test
    void is_have_line_no_true_test() {
        Line line1 = new Line(List.of(true,true,true,true));
        Line line2 = new Line(List.of(false,false,false,false));

        assertThat(line1.isHaveLine(line2)).isFalse();
    }
}