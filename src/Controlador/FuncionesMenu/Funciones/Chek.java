package Controlador.FuncionesMenu.Funciones;

import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Chek implements ItemListener {
    JRadioButton checkBox;

    public Chek(JRadioButton checkBox) {
        this.checkBox = checkBox;
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getStateChange() == ItemEvent.SELECTED) {
            // Si checkBox1 se marca, desmarca checkBox2
            checkBox.setSelected(false);
        }
    }
}
