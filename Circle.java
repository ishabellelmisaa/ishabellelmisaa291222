class Circle extends Shape{
    int r;

    Circle(String nama) 
    {
        super(nama);
        r= 3;
    }
    float getArea() 
    {
        float luas;
        luas = (float)(3.14 * r * r);
        return luas;
    }
}
