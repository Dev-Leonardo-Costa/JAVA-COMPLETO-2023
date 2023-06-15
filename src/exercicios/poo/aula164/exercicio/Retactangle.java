package exercicios.poo.aula164.exercicio;

public class Retactangle extends Shape{

    private double widthh;
    private double height;

    public Retactangle(){
        super();
    }

    public Retactangle(Color color, double widthh, double height) {
        super(color);
        this.widthh = widthh;
        this.height = height;
    }

    @Override
    public double area(){
        return widthh * height;
    }
}
