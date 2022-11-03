
package Carro;
public class Carro {

    String cor;
    int capTanque;
    String modelo;

    Carro(){

    }
    Carro(String cor, String modelo, int capTanque){
        this.cor = cor;
        this.modelo = modelo;
        this.capTanque = capTanque;
    }
    Carro(String cor, String modelo){
        this.cor = cor;
        this.modelo = modelo;
    }

    void setCor(String cor){
        this.cor = cor;
    }

    String getCor(){
        return cor;
    }

    
    void setModelo(String modelo){
        this.modelo = modelo;
    }

    String getModelo(){
        return modelo;
    }

    void setCapTanque(int capTanque){
        this.capTanque = capTanque;
    }

    int getCapTanque(){
        return capTanque;
    }

    double totalValorTanque(double valorGasolina) {
        
        return capTanque * valorGasolina;
    }

    

}
