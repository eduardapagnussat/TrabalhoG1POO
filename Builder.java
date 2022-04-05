/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrabalhoG1;

/**
 *
 * @author 1128127
 */
public class Builder {
    
    public static void main(String[] args){
        Teclado dellRX12 = new Teclado();
        Mouse dellPro = new Mouse();
        Notebook dellInspirion = new Notebook();
        dellInspirion.teclado = dellRX12;
        dellInspirion.mouse = dellPro;
    }
    
}
