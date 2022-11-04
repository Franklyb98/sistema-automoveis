/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Outros;
import Cadastro.CadastroDeMultas;
import Cadastro.SistemaAutomoveisUtils;
import Perfis.PerfilAgente;
import Perfis.PerfilGerente;
import Perfis.PerfilMotorista;
import java.util.Scanner;
/**
 *
 * @author danis
 */
public class MenuPrincipal {
    SistemaAutomoveisUtils listas = new SistemaAutomoveisUtils();
    public void executarMenuPrincipal() {
        Scanner scanner = new Scanner(System.in);

        PerfilMotorista perfilMotorista = new PerfilMotorista();
        PerfilAgente perfilAgente = new PerfilAgente();
        PerfilGerente perfilGerente = new PerfilGerente();

        CadastroDeMultas cadastroDeMultas = new CadastroDeMultas();

        System.out.println("Olá, seja bem vindo ao sistema de cadastro de multas");
        System.out.println("Qual perfil deseja acessar: \n" +
                "1 - Motorista \n" +
                "2 - Agente \n" +
                "3 - Gerente");
        int escolhaPerfil = scanner.nextInt();

        switch(escolhaPerfil) {
            case 1:
                perfilMotorista.visualizacaoMotorista();
                break;
            case 2:
                perfilAgente.visualizacaoAgente(this, listas);
                break;
            case 3:
                perfilGerente.visualizacaoGerente(this, listas);
        } while (escolhaPerfil != 99);
    }
}
