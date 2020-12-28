import java.util.*;

class RandomizedCollection {
    private List<Integer> list;
    private Map<Integer, Set<Integer>> map;

    /** Initialize your data structure here. */
    public RandomizedCollection() {
        list = new ArrayList<>();
        map = new HashMap<>();
    }

    /** Inserts a value to the collection. Returns true if the collection did not already contain the specified element. */
    public boolean insert(int val) {
        Set<Integer> set;
        int index = list.size();
        list.add(index, val);
        if (!map.containsKey(val)) {
            set = new HashSet<>();
            set.add(index);
            map.put(val, set);
            return true;
        } else {
            set = map.get(val);
            set.add(index);
            return false;
        }
    }

    /** Removes a value from the collection. Returns true if the collection contained the specified element. */
    public boolean remove(int val) {
        if (!map.containsKey(val)) {
            return false;
        }
        Set<Integer> set;
        set = map.get(val);
        int index = set.iterator().next();
        set.remove(index);
        if (set.isEmpty()) {
            map.remove(val);
        }
        int lastIndex = list.size() - 1;
        if (index == lastIndex) {
            list.remove(index);
            return true;
        }
        int lastVal = list.get(lastIndex);
        list.set(index, lastVal);
        list.remove(lastIndex);
        set = map.get(lastVal);
        set.remove(lastIndex);
        set.add(index);
        return true;
    }

    /** Get a random element from the collection. */
    public int getRandom() {
        return list.get((int)(Math.random() * list.size()));
    }
}

/**
 * Your RandomizedCollection object will be instantiated and called as such:
 * RandomizedCollection obj = new RandomizedCollection();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
