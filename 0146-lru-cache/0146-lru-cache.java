class LRUCache {

    private final LinkedHashMap<Integer, Integer> map;
    private final int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.map = new LinkedHashMap<>(capacity, 0.75f, true);
    }
    
    public int get(int key) {
        if (map.containsKey(key)) {
            return map.get(key); 
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if (map.containsKey(key) || map.size() < capacity) {
            map.put(key, value);
            return;
        }

        if (!map.isEmpty()) {
            Integer oldestKey = map.sequencedKeySet().getFirst(); 
            map.remove(oldestKey);
        }
        
        map.put(key, value);
    }
}
