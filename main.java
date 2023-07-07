import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class main {
    public static void main(String[] args) {
        Set set = new Set();
        set.add(100);
        set.add(200);
        set.add(300);
        Iterator<Integer> i = set.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());

        }
        System.out.println(set.get(0));
        System.out.println(set.toString());
    }

    static class Set<E> extends ArrayList<E> {
        private HashMap<E, Object> set = new HashMap<>();
        private static final Object value = new Object();


        public boolean add(E elem) {
            if (set.containsKey(elem)) return false;
            return set.put(elem, value) == null;
        }

        public boolean remove(Object elem) {
            return set.remove(elem) == value;
        }

        public int size() {
            return set.size();
        }

        public boolean isEmpty() {
            return set.isEmpty();
        }

        public Iterator<E> iterator() {
            return set.keySet().iterator();
        }

        public void clear() {
            set.clear();
        }

        public String toString() {
            return set.toString();
        }

        public E get(int index) {
            if (index >= 0 && index < set.size()) {
                return (E) (set.keySet().toArray())[index];
            } else throw new IndexOutOfBoundsException();
        }
    }
}
