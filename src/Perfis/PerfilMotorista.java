/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Perfis;

import Entidades.Motorista;
import Entidades.Multa;
import Outros.BancoDeDados;
import Outros.MenuPrincipal;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author danis
 */
public class PerfilMotorista {

    public void visualizacaoMotorista() {
        Scanner scanner = new Scanner(System.in);

        MenuPrincipal menuPrincipal = new MenuPrincipal();
        BancoDeDados banco = new BancoDeDados();
        ArrayList<Multa> multas = new ArrayList<>();

        int escolha = 0;
        do {
            System.out.println("Digite a opção:");
            System.out.println("1 - Visualizar Multas de moto \n"
                    + "\n 2 - Vizualizar Multa de Caminhão"
                    + "\n 3 - Vizualizar Multa de Automovel"
                    + "0 - Voltar para o menu principal");
            escolha = scanner.nextInt();

            switch (escolha) {
                case 0:
                    menuPrincipal.executarMenuPrincipal();
                    break;
                case 1:
                    banco.retornaMultasDeMotos(multas);
                    break;
                case 2:
                    banco.retornaMultasDeCaminhoes(multas);
                    break;
                case 3:
                    banco.retornaMultasDeAutomoveis(multas);
                    break;
            }
        } while (escolha != 99);
    }
}