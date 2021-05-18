package exercicios;
public class CanetaTeste {
    
    public static void main(String[]args){
         Caneta bic = new Caneta();
        
        bic.setMarca("bic");
        bic.setCor("azul");
        bic.setTamanho("18cm");
        
        System.out.println("Tamanho:"+bic.getTamanho());
        System.out.println("Cor:"+bic.getCor());
        System.out.println("Marca:"+bic.getMarca());
    }
}

