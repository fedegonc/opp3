package objetos3;

public class Persona {

    private String nome;
    private String apellido;
    private int idade;
    private int quantVida;
    private boolean habildadeParaAtirar;
    
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    
    public String getNome() {
        return nome;
    }

    public boolean setNome(String nome) {
        
        if(nome.equalsIgnoreCase(" "))
        {
            return false;
        }
        else
        { 
            this.nome = nome;
            return true;
        }
        
        
    }

    public int getIdade(int idade) {
          
          return idade;
    }

    public String setIdade(int idade) {
        
        this.idade = idade;
        
        if (idade >= 0 && idade < 3) {
            return "bebe";
        }

        if (idade >= 3 && idade < 12) {
            return "crianza";
        }

        if (idade >= 18 && idade < 59) {
            return "adulto";
        }

        if (idade >= 60) {
           return  "idoso";
        }
        else {
            return "Ingrese una edad valida";
        }
        
       
    }

    

    public int getQuantVida() {
        return quantVida;
    }

    public void setQuantVida(int quantVida) {
        this.quantVida += quantVida;
    }

    public boolean isHabildadeParaAtirar() {
        return habildadeParaAtirar;
    }

    public void setHabildadeParaAtirar(boolean habildadeParaAtirar) {
        this.habildadeParaAtirar = habildadeParaAtirar;
    }

}
