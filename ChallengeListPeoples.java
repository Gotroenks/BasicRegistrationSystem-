package Treino.Projects;

import java.util.Scanner; // Data enter

public class ChallengeListPeoples {

	public static void main(String[] args) {

		int Esc, Number = 0; // Variables
		Scanner Enter = new Scanner(System.in); // Enter data

		System.out.print("\n\nInsira uma quantidade para registrar: ");
		Number = Enter.nextInt(); // People numbers

		String[] Name = new String[Number]; // Object transformation
		int[] Mat_Num = new int[Number];

		if (Number != 0) {
			for (int j = 0; j < Number; j++) {

				System.out.println("\n\nInsira o " + (1 + j) + "º nome e em seguida " + "o número da matricula.");
				Name[j] = Enter.next();
				Mat_Num[j] = Enter.nextInt();
			}
		} else {

			System.err.println("Nenhum dado para inserir\n");
		}

		do {
			int i = 0;

			System.out.println("\n\n\t0 - Sair do programa");
			System.out.println("\t1 - Exibir lista completa ");
			System.out.println("\t2 - Modificar lista ");
			System.out.println("\t3 - Excluir dados \n");
			System.out.print("Onde deseja ir: ");
			Esc = Enter.nextInt();

			if (Esc == 1) {

				for (String Members : Name) {

					if (Mat_Num[i] != 0) {

						System.out.println("\nName: " + Members + "\t\t" + "M:" + Mat_Num[i]);
					} else {

						System.err.println("\nNenhum registro encontrado");
						break;
					}
					i++;
				}

			} else if (Esc == 2) {

				System.out.print("Insira um nome para modificar: ");
				String SearchName = Enter.next();

				for (i = 0; i < Number; i++) {

					if (SearchName.equalsIgnoreCase(Name[i])) {

						System.out.print("Insira o novo nome: ");
						Name[i] = Enter.next();
					} else {
						System.err.println("\nNenhum nome encontrado");
						break;
					}

				}
			} else if (Esc == 3) {

				System.out.print("Insira um nome para remover: ");
				String SearchName = Enter.next();

				for (i = 0; i < Number; i++) {

					if (SearchName.equals(Name[i])) {

						Name[i] = Name[i].replaceAll(Name[i], ""); // atribui a nada
						Mat_Num[i] -= Mat_Num[i]; // zera a matricula
					} else { // se não encontrar
						System.err.println("\nNenhum nome encontrado");
						break;
					}
				}
			} else {
				
				System.err.println("Opção Inválida");
			}

		} while (Esc != 0);

		System.out.println("\n\n\nFIM DO PROGRAMA");
		Enter.close(); // Enter data closed
	}
}
