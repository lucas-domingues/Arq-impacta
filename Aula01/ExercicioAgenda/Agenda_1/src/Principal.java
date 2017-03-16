import java.util.ArrayList;
import java.util.Scanner;
import Model.contato;

public class Principal {

	public static ArrayList<contato> agendaList = new ArrayList<contato>();

	public static void main(String[] args) {
		int operacao = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Sistema de Gerenciamento de Contatos");
			System.out.println();
			System.out.println("Inserir contato: digite 1");
			System.out.println("Consultar: digite 2");

			operacao = sc.nextInt();
			switch (operacao) {

			case 1:
				contato cont = new contato(inserirLinha(), inserirLinha());
				AdicionarContato(agendaList, cont);
				break;
			case 2:
				contato cont2 = new contato(inserirLinha(), inserirLinha());
				verificaList(cont2, true);
				break;
			case 3:
				operacao = 3;
				break;
			}
		} while (operacao != 3);
		sc.close();
	}

	/*
	 * private static boolean isNumeric(String str, Class<? extends Number>
	 * clazz) { boolean isNumeric = false; if (clazz.equals(Integer.class)){
	 * isNumeric = true; } return isNumeric; }
	 */

	private static String verificaList(contato cont, boolean retornarContato) {
		String valorExistenteLista = "Valor não encontrado!";
		
			for (int x = 0; x < agendaList.size(); x++) {
				if (agendaList.get(x).getNome() == cont.getNome()
						&& agendaList.get(x).getTelefone() == cont.getTelefone()) {
					valorExistenteLista = String.format("Nome:%s Telefone:%s", agendaList.get(x).getNome(),
							agendaList.get(x).getNome());
				}
			}
		
		return valorExistenteLista;

	}

	private static boolean verificaList(contato cont) {
		boolean valorExistenteLista = true;
		for (int x = 0; x < agendaList.size(); x++) {

			if (agendaList.get(x).getNome() == cont.getNome()
					&& agendaList.get(x).getTelefone() == cont.getTelefone()) {
				valorExistenteLista = false;
			}
		}
		return valorExistenteLista;
	}

	private static String inserirLinha() {
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}

	private static void AdicionarContato(ArrayList<contato> arrayList, contato cont) {
		if (validarTamanhoString(cont, 200, 25)) {
			if (verificaList(cont)) {
				agendaList.add(cont);
				System.out.println("Contato cadastrado com Sucesso!");
			} else {
				System.out.println("Já existe um Contato com esse nome, tente novamente!");
			}

		} else {
			System.out.println("Valor maior que o esperado, nome deve conter no maximo 200 caracteres , telefone 25.");
		}

	}

	private static boolean validarTamanhoString(contato cont, int tamanhoMaximoNome, int tamanhoMaximoTelefone) {
		boolean valorValido = false;
		if (tamanhoMaximoNome >= cont.getNome().length() && tamanhoMaximoTelefone >= cont.getTelefone().length()) {
			valorValido = true;
		}
		return valorValido;
	}

}
