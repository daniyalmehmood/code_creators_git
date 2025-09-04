//Functional-1 > addStar


import java.util.List;
import java.util.stream.Collectors;

public class StringStarAppender {

    public List < String > addStars(List < String > strings) {
        List < String > result = strings.stream().map(n->n + "*").collect(Collectors.toList());

        return result;
    }

}