package Cadastro;

import Entidades.*;
import Outros.BancoDeDados;

import java.util.ArrayList;

public class SistemaAutomoveisUtils {

    private BancoDeDados bancoDeDados = new BancoDeDados();
    private CadastroDeMotorista cadastroDeMotorista = new CadastroDeMotorista();
    private CadastroDeVeiculo cadastroDeVeiculo = new CadastroDeVeiculo();
    private CadastroDeMultas cadastroDeMultas = new CadastroDeMultas();
    private ArrayList<Motorista> motoristas = new ArrayList<>();
    private ArrayList<Moto> motos = new ArrayList<>();
    private ArrayList<Automovel> automoveis = new ArrayList<>();
    private ArrayList<Caminhao> caminhoes = new ArrayList<>();
    private ArrayList<Multa> multas = new ArrayList<>();

    public BancoDeDados getBancoDeDados() {
        return bancoDeDados;
    }

    public void setBancoDeDados(BancoDeDados bancoDeDados) {
        this.bancoDeDados = bancoDeDados;
    }

    public CadastroDeMotorista getCadastroDeMotorista() {
        return cadastroDeMotorista;
    }

    public void setCadastroDeMotorista(CadastroDeMotorista cadastroDeMotorista) {
        this.cadastroDeMotorista = cadastroDeMotorista;
    }

    public CadastroDeVeiculo getCadastroDeVeiculo() {
        return cadastroDeVeiculo;
    }

    public void setCadastroDeVeiculo(CadastroDeVeiculo cadastroDeVeiculo) {
        this.cadastroDeVeiculo = cadastroDeVeiculo;
    }

    public CadastroDeMultas getCadastroDeMultas() {
        return cadastroDeMultas;
    }

    public void setCadastroDeMultas(CadastroDeMultas cadastroDeMultas) {
        this.cadastroDeMultas = cadastroDeMultas;
    }

    public ArrayList<Motorista> getMotoristas() {
        return motoristas;
    }

    public void setMotoristas(ArrayList<Motorista> motoristas) {
        this.motoristas = motoristas;
    }

    public ArrayList<Moto> getMotos() {
        return motos;
    }

    public void setMotos(ArrayList<Moto> motos) {
        this.motos = motos;
    }

    public ArrayList<Automovel> getAutomoveis() {
        return automoveis;
    }

    public void setAutomoveis(ArrayList<Automovel> automoveis) {
        this.automoveis = automoveis;
    }

    public ArrayList<Caminhao> getCaminhoes() {
        return caminhoes;
    }

    public void setCaminhoes(ArrayList<Caminhao> caminhoes) {
        this.caminhoes = caminhoes;
    }

    public ArrayList<Multa> getMultas() {
        return multas;
    }

    public void setMultas(ArrayList<Multa> multas) {
        this.multas = multas;
    }
}
