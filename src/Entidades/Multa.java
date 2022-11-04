/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author danis
 */
public class Multa {
        private Motorista motorista;
    private Moto moto;
    private Automovel automovel;
    private Caminhao caminhao;
    private int valorMulta;

    public Multa(Motorista motorista, Moto moto, int valorMulta) {
        this.motorista = motorista;
        this.moto = moto;
        this.valorMulta = valorMulta;
    }

    public Multa(Motorista motorista, Caminhao caminhao, int valorMulta) {
        this.motorista = motorista;
        this.caminhao = caminhao;
        this.valorMulta = valorMulta;
    }

    public Multa(Motorista motorista, Automovel automovel, int valorMulta) {
        this.motorista = motorista;
        this.automovel = automovel;
        this.valorMulta = valorMulta;
    }
    

    /**
     * @return the motorista
     */
    public Motorista getMotorista() {
        return motorista;
    }

    /**
     * @param motorista the motorista to set
     */
    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    /**
     * @return the moto
     */
    public Moto getMoto() {
        return moto;
    }

    /**
     * @param moto the moto to set
     */
    public void setMoto(Moto moto) {
        this.moto = moto;
    }

    /**
     * @return the automovel
     */
    public Automovel getAutomovel() {
        return automovel;
    }

    /**
     * @param automovel the automovel to set
     */
    public void setAutomovel(Automovel automovel) {
        this.automovel = automovel;
    }

    /**
     * @return the caminhao
     */
    public Caminhao getCaminhao() {
        return caminhao;
    }

    /**
     * @param caminhao the caminhao to set
     */
    public void setCaminhao(Caminhao caminhao) {
        this.caminhao = caminhao;
    }

    /**
     * @return the valorMulta
     */
    public int getValorMulta() {
        return valorMulta;
    }

    /**
     * @param valorMulta the valorMulta to set
     */
    public void setValorMulta(int valorMulta) {
        this.valorMulta = valorMulta;
    }



}
