package nextstep.ladder.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Line {
    private int position;
    private List<Boolean> points;

    // 라인의 좌표 값에 선이 있는지 유무를 판단하는 로직 추가
    public Line(List<Boolean> points) {
        this.points = points;
    }

    public void assignPosition(int position) {
        this.position = position;
    }

    public List<Boolean> getPoints() {
        return points;
    }

    public Boolean getPoint(int index){
        return points.get(index);
    }

    public int size(){
        return points.size();
    }

    public boolean isHaveLine(Line line){
        if(Math.abs(this.position - line.position) != 1){
            return false;
        }
        for (int i = 0; i < line.points.size(); i++) {
            if(line.points.get(i) == points.get(i)){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Line line = (Line) o;
        return Objects.equals(points, line.points);
    }

    @Override
    public int hashCode() {
        return Objects.hash(points);
    }

}
