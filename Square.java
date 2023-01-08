public class Square extends Shape {
    private int sisi;

    Square(String nama) 
    {
        super(nama);
        sisi = 3;
    }
    float getArea() 
    {
        float luas;
        luas = sisi * sisi;
        return luas;
    }
}
