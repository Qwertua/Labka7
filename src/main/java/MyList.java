interface MyList<E> extends Iterable<E> {
    int size();
    boolean isEmpty();
    boolean add(E element);
    E get(int index);

}
