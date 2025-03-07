package teste;

public class Estudante {	
	private String nome;
	private int idade;
	private String matricula;
	
	public Estudante(String nome, int idade, String matricula) { 
		this.nome = nome; 
		this.idade = idade; 
		this.matricula = matricula;
	}

	public String getNome(){
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade){
		this.idade = idade;
	}
	
	public String getMatricula(){
		return matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

    @Override
	public String toString() { 
		return ("Nome: " + nome + ", Idade: " + idade + ", Matrícula: " + matricula); 
	} 

	public void mostrarDados() { 
		System.out.println(this.toString()); 
	}
}
