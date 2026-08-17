class MyHashSet {
    boolean[] mark;

    public MyHashSet() {
        mark = new boolean[1_000_001];
    }
    
    public void add(int key) {
        mark[key] = true;
    }
    
    public void remove(int key) {
        mark[key] = false;
    }
    
    public boolean contains(int key) {
        return mark[key];
    }
}