/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Perfis;

import Cadastro.CadastroDeMotorista;
import Cadastro.SistemaAutomoveisUtils;
import Entidades.*;
import java.util.ArrayList;
import java.util.Scanner;

import Outros.MenuPrincipal;

public class PerfilAgente {
    public void visualizacaoAgente(MenuPrincipal menuPrincipal, SistemaAutomoveisUtils utils) {
        Scanner scanner = new Scanner(System.in);

        int escolha = 0;

        do {
            System.out.println("O que deseja fazer?");
            System.out.println("Digite a opÃ§Ã£o: ");
            System.out.println("1 - Cadastrar motorista \n" +
                    "2 - Cadastrar moto \n" +
                    "3 - Cadastrar automóvel \n" +
                    "4 - Cadastrar caminhão \n" +
                    "5 - Cadastrar multa \n" +
                    "6 - Visualizar multas de motos \n" +
                    "7 - Visualizar multas em automóveis \n" +
                    "8 - Visualizar multas em caminhões \n" +
                    "\n" +
                    "0 - Voltar para o menu anterior \n" +
                    "99 - sair do sistema");

            escolha = scanner.nextInt();

            switch (escolha) {
                case 0:
                    menuPrincipal.executarMenuPrincipal();
                    break;
                case 1:
//                    motoristas.add(cadastroDeMotorista.getCadastroMotorista());
                    CadastroDeMotorista cadastroDeMotorista = utils.getCadastroDeMotorista();
                    utils.getMotoristas().add(cadastroDeMotorista.cadastrarMotorista());
                    break;
                case 2:
                    ArrayList<Moto> motos = utils.getMotos();
                    motos.add(utils.getCadastroDeVeiculo().cadastrarMoto());
                    break;
                case 3:
                    ArrayList<Automovel> automoveis = utils.getAutomoveis();
                    automoveis.add(utils.getCadastroDeVeiculo().cadastrarAutomovel());
                    break;
                case 4:
                    ArrayList<Caminhao> caminhoes = utils.getCaminhoes();
                    caminhoes.add(utils.getCadastroDeVeiculo().cadastrarCaminhao());
                    break;
                case 5:
                    ArrayList<Multa> multas = utils.getMultas();
                    multas.add(utils.getCadastroDeMultas()
                            .cadastrarMulta(utils.getMotoristas(), utils.getMotos(), utils.getCaminhoes(), utils.getAutomoveis()));
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("ESTE PERFIL NAO TEM ACESSO A ESSA OPCAO");
                    break;
            }

        } while (escolha != 99);

    }

}
