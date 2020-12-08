package domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class LinesTest {
    private Lines lines;

    @BeforeEach
    void setUp() {
        List<Point> points1 = new ArrayList<>();
        points1.add(Point.of(Position.of(0), Direction.RIGHT));
        points1.add(Point.of(Position.of(1), Direction.LEFT));
        points1.add(Point.of(Position.of(2), Direction.DOWN));
        Line line1 = new Line(new Points(points1));

        List<Point> points2 = new ArrayList<>();
        points2.add(Point.of(Position.of(0), Direction.DOWN));
        points2.add(Point.of(Position.of(1), Direction.RIGHT));
        points2.add(Point.of(Position.of(2), Direction.LEFT));
        Line line2 = new Line(new Points(points2));

        List<Point> points3 = new ArrayList<>();
        points3.add(Point.of(Position.of(0), Direction.DOWN));
        points3.add(Point.of(Position.of(1), Direction.DOWN));
        points3.add(Point.of(Position.of(2), Direction.DOWN));
        Line line3 = new Line(new Points(points3));

        lines = new Lines(Arrays.asList(line1, line2, line3));
    }
    @Test
    @DisplayName("아래 주석과 같이 생긴 Lines 객체에서의 departsAt()을 테스트한다.")
    /* 0     1     2
    *  |-----|     |
    *  |     |-----|
    *  |     |     |
    *  2     0     1
    */
    void ofTest() {
        assertThat(lines.departsAt(Position.of(0))).isEqualTo(Position.of(2));
        assertThat(lines.departsAt(Position.of(1))).isEqualTo(Position.of(0));
        assertThat(lines.departsAt(Position.of(2))).isEqualTo(Position.of(1));
    }
}