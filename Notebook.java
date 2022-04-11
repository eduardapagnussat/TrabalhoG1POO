public class Notebook {
    
    public String modelo;
    public float tela;
    public String sistema;
    public Teclado teclado;
    public Mouse mouse;
    public Boolean status;

    // Construtores         
    public Notebook(){}

    public Notebook(String modelo, float tela, String sistema, Teclado teclado, Mouse mouse){

        this.modelo = modelo;
        this.tela = tela;
        this.sistema = sistema; 
        this.teclado = teclado; 
        this.mouse = mouse;
    }

    public void liga(){

        this.status = true;
    }
    
    public void desliga(){

        this.status = false
    }
    
    public void mostrarPerifericos(){

        System.out.println("\nNotebook: " + this.modelo + " de Tela de: " + this.tela + " Polegadas, com o Sistema Operacional: " + this.sistema);
        System.out.println("\nNotebook está ligado?" + this.status);
        System.out.println("\nTeclado: " + this.teclado.marca + " com Padrão " + this.teclado.padrao + " custando R$" + this.teclado.valorMedio + " com " + this.teclado.peso + "Kg de Peso");
        System.out.println("\nMouse: " + this.mouse.marca + " de cor " this.mouse.cor + " com " + this.mouse.comprimentoCabo + " m de Comprimento de Cabo.");
        System.out.println("\nMouse é Wireless?" + this.mouse.wireless);

    }
}
