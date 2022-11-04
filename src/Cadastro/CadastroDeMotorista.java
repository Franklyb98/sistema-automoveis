/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cadastro;

import Entidades.Motorista;
import java.util.Scanner;

public class CadastroDeMotorista {
    public Motorista cadastrarMotorista() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do Motorista: ");
        String nomeMotorista = scanner.next();

        System.out.println("Digite a CNH do Motorista: ");
        String cnhMotorista = scanner.next();

        return new Motorista(nomeMotorista, cnhMotorista);

    
}
}
