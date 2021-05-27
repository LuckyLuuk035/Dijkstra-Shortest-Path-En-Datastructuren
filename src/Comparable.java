public interface Comparable<S> {
    public default int compareTo(Stap s1, Stap s2) {
        if (s1.waarde < s2.waarde)
            return -1;
        if (s1.waarde > s2.waarde)
            return 1;
        return 0;
    }
}