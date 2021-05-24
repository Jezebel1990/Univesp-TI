package univespjava.semana4;

public class Animais {
    
    private String nome;
    private String tipo;
    private String cor;
    
    Animais(String nome, String tipo, String cor){
        
        this.nome=nome;
        this.tipo=tipo;
        this.cor=cor;
    }
    public String toString(){
        return this.nome;
       }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
}
