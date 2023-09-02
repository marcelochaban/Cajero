package Controlador.FuncionesMenu.Funciones;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Filtro implements KeyListener {
    @Override
    public void keyTyped(KeyEvent e) {
        char c = e.getKeyChar();
        if (!((c >= '0' && c <= '9') || c == '.')) {
            e.consume();
            // Esto evita que el carácter no deseado se muestre en el campo de texto
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
