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
        lines.add(new Line(List.of(true,true,true,true)));
        lines.add(new Line(List.of(false,false,true,true)));
        Ladder ladder = new Ladder(lines);
        assertThat(ladder.getLineByPosition(1)).isEqualTo(new Line(List.of(true,true,true,true)));
        assertThat(ladder.getLineByPosition(2)).isEqualTo(new Line(List.of(false,false,true,true)));
    }
}