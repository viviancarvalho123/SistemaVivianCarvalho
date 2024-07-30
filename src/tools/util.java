/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JTextPane;

/**
 *
 * @author vivic
 */
public class util {
    // ter uma coisa util em que uso sempre.

    public static void habilitar(boolean valor, JComponent... vetComponent) {
        //jcomponent esta usando o polimosfismo
        //Escolhemos o (objeto)jcomponent por que ele é como om pai de todos os component, como jtxt, jfmt...
        // jcomponent foi escolhido tambem por conta da arvore de derivação, pois de acordo com o site da oracle o jcomponent tem o setenabled em sua familia.
        // static significa que não preciso instancia para chamar o metodo.
        // os tres pontinhos se chama varargus, que significa que podemos passar varios componentes.
        for (int i = 0; i < vetComponent.length; i++) {
            vetComponent[i].setEnabled(valor);
            // ele esta fazendo um laço para percorrer tdos os componentes do vetor.
        }

    }

    public static void limparCampos(JComponent... vetComponent) {
        for (JComponent jComponent : vetComponent) {

            if (jComponent instanceof JTextField) {
                ((JTextField) jComponent).setText("");
                //O metodo começa a depender de cada objeto(jcomponent).
            }
            if (jComponent instanceof JComboBox) {
                ((JComboBox) jComponent).setSelectedIndex(-1);

            }

            if (jComponent instanceof JCheckBox) {
                ((JCheckBox) jComponent).setSelected(false);
            }
            if (jComponent instanceof JPasswordField) {
                JPasswordField comp = (JPasswordField) jComponent;
                comp.setText("");
            }
            if (jComponent instanceof JTextPane) {
                JTextPane comp = (JTextPane) jComponent;
                comp.setText("");
            }

        }
    }

    public static void mensagem(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }

    public static boolean perguntar(String msg) {
        return JOptionPane.showConfirmDialog(null, msg, "Pergunta", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE) == JOptionPane.YES_OPTION;
    }

    
}
