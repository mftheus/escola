import javax.swing.JOptionPane;

public class AtividadeGlauco {
    public static void main(String[] args) {
        
    String nome = JOptionPane.showInputDialog(null, "Qual o seu nome?", "ORACULO", 3);
    String input = JOptionPane.showInputDialog(null, nome + ", digite uma palavra", "ORACULO", 3);
    char[] letras;
    char[] vogais = {'a','e','i','o','u'};
    String palavra = input;
    
    JOptionPane.showMessageDialog(null, "Sua palavra tem: " + input.length() + " letras", "Informações da Palavra: " + input, 1);
    JOptionPane.showMessageDialog(null, "Sua palavra em CAPS: " + input.toUpperCase(), "Informações da Palavra: " + input, 1);
        
    palavra = palavra.toLowerCase();

    StringBuilder vogaisInput = new StringBuilder();


    // loop para rodar a palavra o numero de caracteres que ela tem
    for (int i = 0; i < palavra.length(); i++) {
        char c = palavra.charAt(i);
        // compara cada letra com as vogais
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            vogaisInput.append(c); // metodo .append da classe StringBuilder junta o que foi notado como igual no if em uma string
            vogaisInput.append(" ");// Adicionando um espaço entre os números
        }
    }

    palavra =  vogaisInput.toString();

    JOptionPane.showMessageDialog(null, "Vogais da sua palavra: " + palavra, "Informações da Palavra: " + input, 1);
    JOptionPane.showMessageDialog(null, "Começa com SEN? " + input.toUpperCase().startsWith("SEN"), "Informações da Palavra: " + input, 1);
    JOptionPane.showMessageDialog(null, "Termina com NAC? " + input.toUpperCase().endsWith("NAC"), "Informações da Palavra: " + input, 1);
    
    Integer contador = 0;

    StringBuilder sequenciaNumeros = new StringBuilder();

    for (Integer i = 1; i < input.length() + 1; i++) {
        contador = i;
        sequenciaNumeros.append(contador.toString()); // Convertendo e concatenando o contador
        sequenciaNumeros.append(" "); 
    }
    JOptionPane.showMessageDialog(null, "Sequencia da quantidade de caracteres: " +sequenciaNumeros, "Informações da Palavra: " + input, 1);
    
    String palindromo = new StringBuilder(input).reverse().toString();
    System.out.println(palindromo);
    String palindromoConfere = new StringBuilder(palindromo).reverse().toString();
    System.out.println(palindromoConfere);
    System.out.println(input);
    boolean palindromoTrue = palindromoConfere.equalsIgnoreCase(palindromo);


    JOptionPane.showMessageDialog(null, "É um Palindromo? " + palindromoTrue, "Informações da Palavra: " + input, 1);


    }
}