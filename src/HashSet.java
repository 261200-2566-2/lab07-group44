import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Collection;

public class HashSet<E> implements Set<E> {

    private final Map<E, Boolean> hash;

    public HashSet() {
        hash = new HashMap<>();
    }

    @Override
    public <E> E[] toArray(E[] a) {
        return hash.keySet().toArray(a);
    }

    @Override
    public Iterator<E> iterator() {
        return hash.keySet().iterator();
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean isEmpty() {
        return hash.isEmpty();
    }

    @Override
    public int size() {
        return hash.size();
    }

    @Override
    public boolean contains(Object o) {
        return hash.containsKey(o);
    }

    @Override
    public boolean add(E e) {
        return hash.put(e, Boolean.TRUE) == null;
    }

    @Override
    public boolean remove(Object o) {
        return hash.remove(o) != null;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {
        hash.clear();
    }
}
