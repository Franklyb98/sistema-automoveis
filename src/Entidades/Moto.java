/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author danis
 */
public class Moto extends Veiculo {

    private String tipoDeFreio;
    private String carenagem;

    public Moto(String marca, String modelo, String combustivel, String placa, String tipoDeFreio, String carenagem) {
        super(marca, modelo, combustivel, placa);
        this.tipoDeFreio = tipoDeFreio;
        this.carenagem = carenagem;
    }

    public String getTipoDeFreio() {
        return tipoDeFreio;
    }

    public void setTipoDeFreio(String tipoDeFreio) {
        this.tipoDeFreio = tipoDeFreio;
    }

    public String getCarenagem() {
        return carenagem;
    }

    public void setCarenagem(String carenagem) {
        this.carenagem = carenagem;
    }
}
