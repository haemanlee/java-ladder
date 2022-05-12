package nextstep.ladder.domain;

import nextstep.ladder.domain.Ladder;
import nextstep.ladder.domain.Line;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

class LadderTest {

    @Test
    void is_ladder_have_line(){
        ArrayList<Line> lines = new ArrayList<>();
        lines.add(new Line(List.of(true,true,true,true), 1));
        lines.add(new Line(List.of(false,false,true,true), 2));
        Ladder ladder = new Ladder(lines);
        assertThat(ladder.getLines().get(0)).isEqualTo(new Line(List.of(true,true,true,true), 1));
        assertThat(ladder.getLines().get(1)).isEqualTo(new Line(List.of(false,false,true,true), 2));
    }
}