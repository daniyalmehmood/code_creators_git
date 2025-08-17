public class ToppingValueDuplicator  {

    public Map<String, String> duplicateToppingValues(Map<String, String> map) {
        if (map.containsKey("potato")) map.put("fries", map.get("potato"));
        if (map.containsKey("salad")) map.put("spinach", map.get("salad"));
        return map;

    }

}
