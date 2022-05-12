package nextstep.ladder.domain;

import org.junit.jupiter.api.Test;

import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

class LineTest {

    @Test
    void is_have_line_apart_test() {
        Line line1 = new Line(List.of(true,true,true,true), 1);
        Line line2 = new Line(List.of(true,true,true,true), 3);

        assertThat(line1.isHaveLine(line2)).isFalse();
    }

    @Test
    void is_have_line_no_true_test() {
        Line line1 = new Line(List.of(true,true,true,true), 1);
        Line line2 = new Line(List.of(false,false,false,false), 2);

        assertThat(line1.isHaveLine(line2)).isFalse();
    }
}