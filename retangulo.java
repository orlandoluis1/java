// Criar um retângulo e fazer um método get e set para cada atributo, calcular area e perimetro e exibir no metodo main.

public class retangulo {
	private double largura = 1.0
	private double altura = 1.0

	public double getlargura() {
		return largura;
	}
	public void setlargura(double largura) {
        this.largura = largura;
	}
	
	public double getaltura() {
		return largura;
	}
	public void setaltura(double altura) {
        this.altura = altura;
	}
	
	public double calculararea() {
		return largura * altura;
	}

	public double calculperimetro() {
		return (largura + altura) * 2;
	}
	
	public void mostrarDados() {
		system.out.println("largura: " + largura + ", altura: " + altura);
        system.out.println("area: " + calculararea());
        system.out.println("perimetro: " + calcularperimetro());
	}
}