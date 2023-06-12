package exercicios.poo.aula69.exercicio03;

public class Retangulo {

    private double altura;
    private double largura;

    public double area(){
        return altura * largura;
    }
    public double perimetro(){
        return 2 * (largura + altura);
    }
    public double diagonal(){
        return Math.sqrt(altura * altura + largura * largura);
    }



    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }
}
