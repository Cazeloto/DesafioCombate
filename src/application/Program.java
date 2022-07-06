package application;

import java.util.Scanner;

import entities.Champion;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Champion champ1, champ2;

		System.out.println("DIGITE OS DADOS DO 1 CAMPEÂO");
		System.out.print("NOME: ");
		String nome = sc.next();
		System.out.print("VIDA INICIAL : ");
		int vidaInicial = sc.nextInt();
		System.out.print("ATAQUE : ");
		int ataque = sc.nextInt();
		System.out.print("ARMADURA : ");
		int armadura = sc.nextInt();

		champ1 = new Champion(nome, vidaInicial, ataque, armadura);

		System.out.println("DIGITE OS DADOS DO 2 CAMPEÂO");
		System.out.print("NOME: ");
		nome = sc.next();
		System.out.print("VIDA INICIAL : ");
		vidaInicial = sc.nextInt();
		System.out.print("ATAQUE : ");
		ataque = sc.nextInt();
		System.out.print("ARMADURA : ");
		armadura = sc.nextInt();

		champ2 = new Champion(nome, vidaInicial, ataque, armadura);

		System.out.print("QUANTOS TURNOS VOCE DESEJA? : ");
		int turnos = sc.nextInt();

		System.out.println();

		for (int i = 0; i < turnos; i++) {
			champ1.takeDamage(champ1, champ2);
			champ2.takeDamage(champ2, champ1);
			System.out.println();
			System.out.print("Resultado do turno: " + (i + 1));
			System.out.println();
			System.out.print(champ1.getName().toUpperCase() + ":  " + champ1.Status(champ1));
			System.out.println();
			System.out.print(champ2.getName().toUpperCase() + ":  " + champ2.Status(champ2));
			System.out.println();

			if (champ1.getLife() == 0 || champ2.getLife() == 0) {
				i = turnos;
			}

		}

		System.out.println();

		System.out.println("FIM DO COMBATE");

		sc.close();

	}
}
