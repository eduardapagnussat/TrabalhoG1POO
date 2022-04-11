package TrabalhoG1;


public class Notebook {
    
    public String modelo;
    public float tela;
    public String sistema;
    public Teclado teclado;
    public Mouse mouse;
    protected Boolean status;
                    
    public Notebook(){}

    public Notebook(String modelo, float tela, String sistema, Teclado teclado, Mouse mouse){

        this.modelo = modelo;
        this.tela = tela;
        this.sistema = sistema; 
        this.teclado = teclado; 
        this.mouse = mouse;
    }

    public Boolean liga(){

        this.status = true;
        return this.status
    }
    
    public Boolean desliga(){

        this.status = false
        return this.status
    }
    
    public void mostrarPerifericos(){

        System.out.println("\nNotebook:" + this.modelo + "de Tela de:" + this.tela + "Polegadas, com o Sistema Operacional:" + this.sistema);
        System.out.println("\nNotebook está ligado?" + this.status);
        System.out.println("\nTeclado:" + this.teclado.marca + "de" + this.teclado.valorMedio + "R$");
        System.out.println("\nMouse:" + this.mouse.marca + "com" + this.mouse.comprimentoCabo + "m de Comprimento no Cabo");

    }
}
