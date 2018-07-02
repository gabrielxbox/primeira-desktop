package src.modeltable;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class ModeloTable extends AbstractTableModel{
    private ArrayList linhas = null;
    private String[] colunas=null;

    public ModeloTable(ArrayList linhas, String[] colunas) {  
        this.setLinhas(linhas);
        this.setColunas(colunas);
    }

    public ArrayList getLinhas() {
        return linhas;
    }

    public void setLinhas(ArrayList linhas) {
        this.linhas = linhas;
    }

    public String[] getColunas() {
        return colunas;
    }

    public void setColunas(String[] colunas) {
        this.colunas = colunas;
    }
    
    @Override
    public int getRowCount() {
        return this.linhas.size();
    }

    @Override
    public int getColumnCount() {
        return this.colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object[] linha = (Object[]) this.getLinhas().get(rowIndex);
        return linha[columnIndex];
    }
    
    @Override
    public String getColumnName(int numCol){
        return this.colunas[numCol];
    }
}
