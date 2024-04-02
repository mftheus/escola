public class DesafioLogico {
    public static void main(String[] args) {
        
        boolean trabalhouQ = false;
        boolean trabalhouT = false;

        if(trabalhouQ && trabalhouT){
            boolean televisaoG = true;
            System.out.println("Compra TV G? " + televisaoG);
        };
        if(trabalhouQ ^ trabalhouT){
            boolean televisaoP = true;
            System.out.println("Compra TV P? " + televisaoP );
        };
        if(!trabalhouQ && !trabalhouT){
            boolean sorvete = true;
            System.out.println("Comprou sorvete? " + sorvete);
        };

    }
}
