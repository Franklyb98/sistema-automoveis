/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Perfis;

import Cadastro.*;

import java.util.Scanner;

import Outros.MenuPrincipal;

public class PerfilGerente {

    public void visualizacaoGerente(MenuPrincipal menuPrincipal, SistemaAutomoveisUtils utils) {
        Scanner scanner = new Scanner(System.in);

        int escolha = 0;

        do {
            System.out.println("Digite a opÃ§Ã£o: ");
            System.out.println("1 - Cadastrar motorista \n "
                    + "2 - Cadastrar moto \n"
                    + "3 - Cadastrar automÃ³vel \n"
                    + "4 - Cadastrar caminhÃ£o \n"
                    + "5 - Cadastrar multa \n"
                    + "6 - Visualizar multas de moto \n"
                    + "7 - Visualizar multas de automoveis \n"
                    + "8 - Visualizar multas de caminhoes \n"
                    + "9 - Visualizar todos os motoristas \n"
                    + "10 - Vizualizar as motos cadastradas  \n"
                    + "11 - Vizualizar os caminhôes cadastrados \n"
                    + "12 - Vizualizar os automoveis cadastrados \n"
                    + "\n"
                    + "0 - Voltar para o menu anterior");
            escolha = scanner.nextInt();

            switch (escolha) {
                case 0:
                    menuPrincipal.executarMenuPrincipal();
                    break;
                case 1:
                    utils.getMotoristas().add(utils.getCadastroDeMotorista().cadastrarMotorista());
                    break;
                case 2:
                    utils.getMotos().add(utils.getCadastroDeVeiculo().cadastrarMoto());
                    break;
                case 3:
                    utils.getAutomoveis().add(utils.getCadastroDeVeiculo().cadastrarAutomovel());
                    break;
                case 4:
                    utils.getCaminhoes().add(utils.getCadastroDeVeiculo().cadastrarCaminhao());
                    break;
                case 5:
                    utils.getMultas().add(utils.getCadastroDeMultas()
                            .cadastrarMulta(utils.getMotoristas(), utils.getMotos(), utils.getCaminhoes(), utils.getAutomoveis()));
                    break;
                case 6:
                    utils.getBancoDeDados().retornaMultasDeMotos(utils.getMultas());
                    break;
                case 7:
                    utils.getBancoDeDados().retornaMultasDeAutomoveis(utils.getMultas());
                    break;
                case 8:
                    utils.getBancoDeDados().retornaMultasDeCaminhoes(utils.getMultas());
                    break;
                case 9:
                    System.out.println("Digite o nome do motorista: ");
                    String nomeMotorista = scanner.next();
                    System.out.println(utils.getBancoDeDados().retornaMotoristas(nomeMotorista, utils.getMotoristas()));
                    break;
                case 10:
                    System.out.println("Digite a placa da moto: ");
                    String placaMoto = scanner.next();
                    System.out.println(utils.getBancoDeDados().retornaMoto(placaMoto, utils.getMotos()));
                    break;
                case 11:
                    System.out.println("Digite a placa do caminhão: ");
                    String placaCaminhao = scanner.next();
                    System.out.println(utils.getBancoDeDados().retornaCaminhao(placaCaminhao, utils.getCaminhoes()));
                    break;
                case 12:
                    System.out.println("Digite a placa do automovel: ");
                    String placaAutomovel = scanner.next();
                    System.out.println(utils.getBancoDeDados().retornaAutomovel(placaAutomovel, utils.getAutomoveis()));
                    break;    
            }

        } while (escolha != 99);

    }
}
