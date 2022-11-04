/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author danis
 */
public class Automovel extends Veiculo {

    private String portas;
    private String airBag;

    public Automovel(String marca, String modelo, String combustivel, String placa, String portas, String airBag) {
        super(marca, modelo, combustivel, placa);
        this.portas = portas;
        this.airBag = airBag;
    }

    public String getPortas() {
        return portas;
    }

    public void setPortas(String portas) {
        this.portas = portas;
    }

    public String getAirBag() {
        return airBag;
    }

    public void setAirBag(String airBag) {
        this.airBag = airBag;
    }

}
