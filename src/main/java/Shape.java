public abstract class Shape {

    abstract String draw();
}
class Square extends Shape
{
    private int sides;
    public Square(int length)
    {
        sides = length;
    }

    @Override
    String draw() {
        String draw = "";
        for (int i = 0; i<sides; i++)
        {
            for (int j = 0; j < sides; j++)
            {
                if (i == 0 || i == sides-1)
                {
                    draw += "*";
                }
                else if (i > 0 && i < sides-1)
                {
                    if (j == 0 || j == sides-1)
                        draw += "*";
                    else
                        draw += " ";
                }
                else draw += " ";
            }
            draw += "\n";
        }
        return draw;
    }
}
class Rectangle extends Shape
{
    private int length, width;
    public Rectangle (int l, int w)
    {
        length = w;
        width = l;
    }

    @Override
    String draw() {
        String draw = "";
        for (int i = 0; i<length; i++)
        {
            for (int j = 0; j < width; j++)
            {
                if (i == 0 || i == length-1)
                {
                    draw += "*";
                }
                else if (i > 0 && i < length-1)
                {
                    if (j == 0 || j == width-1)
                        draw += "*";
                    else
                        draw += " ";
                }
                else draw += " ";
            }
            draw += "\n";
        }
        return draw;
    }
}
