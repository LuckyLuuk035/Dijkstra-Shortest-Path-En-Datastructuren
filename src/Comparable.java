public interface Comparable<S> {
    public default int compareTo(Stap s1, Stap s2) {
//        if (s1.cost < s2.cost)
//            return -1;
//        if (s1.cost > s2.cost)
//            return 1;
        return 0;
    }
}