/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author danis
 */
public class Caminhao extends Veiculo {

    private String categoria; //pesado, semipesado, leve
    private String eixos;

    public Caminhao(String marca, String modelo, String combustivel, String placa, String categoria, String eixos) {
        super(marca, modelo, combustivel, placa);
        this.categoria = categoria;
        this.eixos = eixos;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getEixos() {
        return eixos;
    }

    public void setEixos(String eixos) {
        this.eixos = eixos;
    }
}
