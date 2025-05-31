public class test_static {
    
    private int n1;
    private int n2;

    public test_static(int n1, int n2) 
    {
        this.n1 = n1;
        this.n2 = n2;
    }

    public int get_n1()
    {
        return this.n1;
    }

    public int get_n2()
    {
        return this.n2;
    }

    public int get_ttl()
    {
        return get_n1() + get_n2();
    }
}
