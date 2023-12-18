import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashSet<E> implements Set<E> {

    private final Map<E, Boolean> hash;

    public HashSet() {
        hash = new HashMap<>();
    }

    @Override
    public Object[] toArray() {
        return null;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
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
    public Iterator<E> iterator() {
        return null;
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
        return hash.keySet().containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        boolean isValue = false;
        for (E element : c) {
            if (add(element)) {
                isValue = true;
            }
        }
        return isValue;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        boolean isValue = false;
        Iterator<E> iterator = iterator();
        while (iterator.hasNext()) {
            if (!c.contains(iterator.next())) {
                iterator.remove();
                isValue = true;
            }
        }
        return isValue;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        boolean isValue = false;
        for (Object element : c) {
            if (remove(element)) {
                isValue = true;
            }
        }
        return isValue;
    }

    @Override
    public void clear() {
        hash.clear();
    }
}
