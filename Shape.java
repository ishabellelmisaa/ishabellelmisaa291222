public abstract class Shape {
    private String nm;

    Shape(String nama) 
    {
        nm = nama; 
    }
    public String getName() 
    {
        return nm;
    }
    abstract float getArea();
}
