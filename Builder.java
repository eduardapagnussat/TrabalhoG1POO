public class Builder {
    
    public static void main(String[] args){
        
        Teclado teclado1 = new Teclado("Dell RX12", 250.99);
        Mouse mouse1 = new Mouse("Dell Pro", 2.5);
        Notebook notebook1 = new Notebook("Dell Inspirion", 25, "Windows 11", teclado1, mouse1);
        
        notebook1.liga();
        notebook1.mostrarPerifericos();

    }
}
