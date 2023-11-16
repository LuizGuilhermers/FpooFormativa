package Desafio3;

public class PrincipalUsuario {
	
	public static void main (String[] args) {
		
	Usuario user1 = new Usuario (1, "Luiz", 12345, "Pública", "Visitante");
	
	System.out.println("Identificação: " + user1.getId());
	System.out.println("Nome: " + user1.getNome());
	
	}
}
