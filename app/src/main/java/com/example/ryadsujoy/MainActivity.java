package com.example.ryadsujoy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

class Shape{
    public String name ;

    public Shape(String name){
        this.name = name ;
    }

    public String showShape() {
        return "The shape is " + name + "\n" + "Area is " + area() + "\n" + "Perimeter is " + perimeter() + "\n";
    }

    public float area(){
        return 0;
    }

    public float perimeter(){
        return 0;
    }

}

class Circle extends Shape{
    public  float radius ;

    public Circle(float radius){
        super("Circle");
        this.radius = radius ;
    }

    public float area(){
        return (float) (3.14 * radius * radius);
    }

    public float perimeter(){
        return (float) (2 * 3.14 * radius);
    }
}

class Square extends Shape{
    public  float side ;

    public Square(float side){
        super("Square");
        this.side = side ;
    }

    public float area(){
        return side * side;
    }

    public float perimeter(){
        return 4 * side;
    }
}

class Triangle extends Shape{
    public  float a, b, c ;

    public Triangle(float a, float b, float c){
        super("Triangle");
        this.a = a ;
        this.b = b ;
        this.c = c ;
    }

    public float area(){
        float s = (a + b + c) / 2;
        return (float) Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
    public float perimeter(){
        return a+b+c;
    }
}

class Color{
    public String color ;

    public Color(String color){
        this.color = color ;
    }

    public String showColor() {
        return "The color is " + color + "\n";
    }
}

class Red extends Color{
    public Red(){
        super("Red");
    }
}

class Green extends Color{
    public Green(){
        super("Green");
    }
}

class Blue extends Color{
    public Blue(){
        super("Blue");
    }
}
public class MainActivity extends AppCompatActivity {

    public EditText ShapeEditText,ColorEditText;
    public Button button;
    public TextView shapetextview, colortextview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ShapeEditText = findViewById(R.id.ShapeEditText);
        ColorEditText = findViewById(R.id.ColorEditText);
        button = findViewById(R.id.button);
        shapetextview = findViewById(R.id.ShapeTextView);
        colortextview = findViewById(R.id.ColorTextView);

        button.setOnClickListener(v -> {
            String shape = ShapeEditText.getText().toString();
            String color = ColorEditText.getText().toString();

            if(shape.equals("Circle")){
                Circle c = new Circle(5);
                shapetextview.setText(c.showShape());
            }
            else if(shape.equals("Square")){
                Square s = new Square(5);
                shapetextview.setText(s.showShape());
            }
            else if(shape.equals("Triangle")){
                Triangle t = new Triangle(3,4,5);
                shapetextview.setText(t.showShape());
            }
            else{
                shapetextview.setText("Invalid Shape");
            }

            if(color.equals("Red")){
                Red r = new Red();
                colortextview.setText(r.showColor());
            }
            else if(color.equals("Green")){
                Green g = new Green();
                colortextview.setText(g.showColor());
            }
            else if(color.equals("Blue")){
                Blue b = new Blue();
                colortextview.setText(b.showColor());
            }
            else{
                colortextview.setText("Invalid Color");
            }
        });
    }
}