//Functional-2 > noZ


import java.util.List;
import java.util.stream.Collectors;

public class RemoveZStrings {

    public List < String > removeZ(List < String > strings) {
        List < String > result = strings.stream().filter(n->!n.contains("z")).collect(Collectors.toList());

        return result;
    }

}