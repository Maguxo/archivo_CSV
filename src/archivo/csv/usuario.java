
package archivo.csv;


public class usuario {


private String matricula;
private String marca;
private double tDeposito;
private String modelo;

public usuario(){}

public usuario(String matricula, String marca, double tDeposito, String modelo){
      this.matricula=matricula;
      this.marca=marca;
      this.tDeposito=tDeposito;
      this.modelo=modelo;
}

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void settDeposito(double tDeposito) {
        this.tDeposito = tDeposito;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public double gettDeposito() {
        return tDeposito;
    }

    public String getModelo() {
        return modelo;
    }
    
    public  String tousuario(){
    
    return 
            matricula+";"+marca+";$"+tDeposito+";"+modelo;
    }
     public String tocabeza(){
    
    return "Matricula;"+"Marca;"+"TDeposito;"+"Modelo\n";
           
    }
}
    

