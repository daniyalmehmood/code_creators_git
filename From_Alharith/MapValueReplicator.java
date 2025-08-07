public class MapValueReplicator  {

    public Map<String, String> replicateMissingABKeys(Map<String, String> map) {
        if (!map.containsKey("a")&& map.containsKey("b")) map.put ("a", map.get("b") );
        if (!map.containsKey("b")&& map.containsKey("a")) map.put ("b", map.get("a") );
        return map;
    }

}
