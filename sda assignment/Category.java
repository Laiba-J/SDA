class Category {
    public int cid;
    public String name;
    public Category next;

    public Category(int cid, String name, Category next) {
        this.cid = cid;
        this.name = name;
        this.next = next;
    }
}