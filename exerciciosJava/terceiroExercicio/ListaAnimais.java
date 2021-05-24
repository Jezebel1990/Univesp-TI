package univespjava.semana4;
import java.util.ArrayList;
import java.util.List;

public class ListaAnimais {
   // public static void main(String[] args) { 
 // List<String> lista = new LinkedList<String>(); 
//  lista.add("Leão"); 
//  lista.add("Sapo"); 
//  lista.add("Cachoro"); 
//  System.out.println(lista); 
//  lista.add(1,"Gato"); 
// System.out.println(lista); 
//  lista.add(3,"Cobra"); 
//  System.out.println(lista); 
//  Collections.sort(lista); 
//  System.out.println(lista); 

    public static void main(String[]args){
     List<Animais> lista = new ArrayList<Animais>(); 

    Animais x = new Animais("Leão", "mamífero", "laranja"); 

    Animais y = new Animais("Sapo", "anfíbio", "cinza"); 

    Animais z = new Animais("Cachorro", "mamífero", "preto"); 

    Animais w = new Animais("Gato", "mamífero", "branco"); 

    Animais k = new Animais("Cobra", "réptil", "verde"); 

    lista.add(x); 

    lista.add(y); 

    lista.add(z); 

    lista.add(w); 

    lista.add(k); 

    System.out.println(lista);   

  } 

} 


    
