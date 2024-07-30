/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telasPesquisas;

import bean.VcsUsuarios;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author vivic
 */
public class UsuariosController extends AbstractTableModel{

    private  List lista;
    
    
    
    public VcsUsuarios getbean(int linha){
return (VcsUsuarios) lista.get(linha);
       //M.P R.NúmLinha 
       // retorna o objeto Usuario correspondente numero de linha na lista.   
}
    
    
    @Override
    public int getRowCount() {
     return lista.size();
        //retorna o número de linhas da tabela
    }

    @Override
    public int getColumnCount() {
       return 4;
       //número de colunas 
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex)  {
        //retorna o valor a ser exibido em uma célula específica da tabela
        VcsUsuarios usuarios = (VcsUsuarios) lista.get(rowIndex);
      if (columnIndex == 0) {
          // número da coluna (columnIndex)
             return usuarios.getVcsIdusuarios();
        }
        if (columnIndex == 1) {
             return usuarios.getVcsNome();
        }
        if (columnIndex == 2) {
             return usuarios.getVcsApelido();
        }
        if (columnIndex == 3) {
             return usuarios.getVcsSenha();
        
        }
       return "";

    }
    
    public String getColumnName(int columnIndex)  {
        if (columnIndex == 0) {
            return "ID";
        }
        if (columnIndex == 1) {
            return "Nome";
        }
        if (columnIndex == 2) {
            return "Apelido";
        }
        if (columnIndex == 3) {
            return "Senha";
        }
        return "";

    }
    
}
