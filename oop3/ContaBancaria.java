
package objetos3;

public class ContaBancaria {
    private String nome;
    private String apellido;
    private String IdCuenta;
    private String IdPersona;
    private float saldoActual;
    private double interesAnual;
    private boolean cuentaActiva;
    

    
//4) Crie um outro pacote especifico para o exercício  4, onde a classe conta (mostrada no material this/slide 24) 
   // deverá ser alterada, juntamente com o main do novo pacote. 
    //O método retirada devolverá um feedback por booleano.  
   // Altere o main para dar feedBack positivo ou negativo para o usuário.
    
    public String setRetirar(float retirar) {
        
        if(retirar < this.saldoActual){
            this.saldoActual = this.saldoActual - retirar;
            return "retirada con exito";
        }
        else{
            return "no tiene fondo suficiente";
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getIdCuenta() {
        return IdCuenta;
    }

    public void setIdCuenta(String IdCuenta) {
        this.IdCuenta = IdCuenta;
    }

    public String getIdPersona() {
        return IdPersona;
    }

    public void setIdPersona(String IdPersona) {
        this.IdPersona = IdPersona;
    }

    public float getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(float saldoActual) {
        this.saldoActual = saldoActual;
    }

    public double getInteresAnual() {
        
        return interesAnual;
    }

    public void setInteresAnual(float interesAnual) {
        
        this.saldoActual =  (float) (this.saldoActual + this.saldoActual * this.interesAnual);
        this.interesAnual = interesAnual;
    }

    public boolean isCuentaActiva() {
        return cuentaActiva;
    }

    public void setCuentaActiva(boolean cuentaActiva) {
        this.cuentaActiva = cuentaActiva;
    }
    
    
}
