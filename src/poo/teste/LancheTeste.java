package poo.teste;

import java.util.Scanner;

import poo.carne.Carne;
import poo.carne.Frango;
import poo.carne.Peixe;
import poo.carne.Peru;
import poo.carne.Presunto;
import poo.carne.Rosbife;
import poo.carne.SemCarne;
import poo.lanche.Centeio;
import poo.lanche.Integral;
import poo.lanche.Pao;
import poo.lanche.SemPao;
import poo.lanche.Tradicional;
import poo.molho.*;
import poo.salada.*;

public class LancheTeste {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		Pao pao = new SemPao();
		Carne carne = new SemCarne(pao);
		Molho molho = new SemMolho(pao);
		Molho molho2 = new SemMolho(pao);
		Salada salada = new SemSalada(pao);
		Salada salada2 = new SemSalada(pao);
		Salada salada3 = new SemSalada(pao);
		
		
		System.out.println("Escolha seu p�o: \n");
		
		System.out.println("1 - Tradicional \n2 - Centeio \n3 - Integral\n");
		int opcao = ler.nextInt();

		switch (opcao) {
		case 1: 
			pao = new Tradicional();
			break;
		case 2:
			pao = new Centeio();
			break;
		case 3:
			pao = new Integral();
			break;
		}

		System.out.println("Escolha a carne: \n");
		System.out.println("1 - Frango \n2 - Peixe \n3 - Presunto \n4 - Peru \n5 - Rosbife\n");
		opcao = ler.nextInt();

		switch (opcao) {
		case 1: 
			carne = new Frango(pao);
			break;
		case 2:
			carne = new Peixe(pao);
			break;
		case 3:
			carne = new Presunto(pao);
			break;
		case 4:
			carne = new Peru(pao);
			break;
		case 5:
			carne = new Rosbife(pao);
			break;
		}
		
		System.out.println("Quantos molhos deseja adicionar? (max 2)\n");
		opcao = ler.nextInt();
		
		if(opcao >= 1) {
            System.out.println("Escolha o molho 1: \n1 - Azeite \n2 - Mostarda \n3 - Parmesao\n");
            opcao = ler.nextInt();
            switch (opcao) {
                case 1:
                    molho = new Azeite(carne);
                    break;

                case 2:
                    molho = new Mostarda(carne);
                    break;

                case 3:
                    molho = new Parmesao(carne);
                    break;
            }
        }

		if(opcao >= 2){
                System.out.println("Escolha o molho 2: \n1 - Azeite \n2 - Mostarda \n3 - Parmesao\n");
                opcao = ler.nextInt();
                switch (opcao) {
                    case 1:
                        molho2 = new Azeite(molho);
                        break;

                    case 2:
                        molho2 = new Mostarda(molho);
                        break;

                    case 3:
                        molho2 = new Parmesao(molho);
                        break;
                }
		}

            System.out.println("Quantas saladas deseja adicionar? (max 3)\n");
            opcao = ler.nextInt();

            if(opcao >= 1) {
                System.out.println("Escolha a salada 1: \n1 - Alface \n2 - Tomate \n3 - Rúcula \n4 - Agrião \n5 - Cebola \n6 - Azeitona \n");
                opcao = ler.nextInt();
                switch (opcao) {
                    case 1:
                        salada = new Alface(molho2);
                        break;

                    case 2:
                        salada = new Tomate(molho2);
                        break;

                    case 3:
                        salada = new Rucula(molho2);
                        break;

                    case 4:
                        salada = new Agriao(molho2);
                        break;

                    case 5:
                        salada = new Cebola(molho2);
                        break;

                    case 6:
                        salada = new Azeitona(molho2);
                        break;
                }
            }

            if(opcao >= 2){
                System.out.println("Escolha a salada 2: \n1 - Alface \n2 - Tomate \n3 - Rúcula \n4 - Agrião \n5 - Cebola \n6 - Azeitona \n");
                opcao = ler.nextInt();
                    switch (opcao) {
                        case 1:
                            salada2 = new Alface(salada);
                            break;

                        case 2:
                            salada2 = new Tomate(salada);
                            break;

                        case 3:
                            salada2 = new Rucula(salada);
                            break;

                        case 4:
                            salada2 = new Agriao(salada);
                            break;

                        case 5:
                            salada2 = new Cebola(salada);
                            break;

                        case 6:
                            salada2 = new Azeitona(salada);
                            break;
                }
            }

        if(opcao >= 3){
            System.out.println("Escolha a salada 3: \n1 - Alface \n2 - Tomate \n3 - Rúcula \n4 - Agrião \n5 - Cebola \n6 - Azeitona \n");
            opcao = ler.nextInt();
            switch (opcao) {
                case 1:
                    salada3 = new Alface(salada2);
                    break;

                case 2:
                    salada3 = new Tomate(salada2);
                    break;

                case 3:
                    salada3 = new Rucula(salada2);
                    break;

                case 4:
                    salada3 = new Agriao(salada2);
                    break;

                case 5:
                    salada3 = new Cebola(salada2);
                    break;

                case 6:
                    salada3 = new Azeitona(salada2);
                    break;
            }
        }

        Pao lanche = salada3;
        System.out.println(lanche);
	}
}
