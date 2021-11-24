package matrixzauberei.model;

import matrixzauberei.control.MatrixController;

public class Matrix
{
    private int[][] matrix = null;
    private int rowCount = 0;
    private int columnCount = 0;
    
    public Matrix (int rowCount, int columnCount, boolean isRandom)
    {
        this.setMatrix(new int[rowCount][columnCount]);
        this.setRowCount(rowCount);
        this.setColumnCount(columnCount);
        
        if (isRandom)
        {
            MatrixController.fillWithRandomIntValues(this);
        }
    }
            
    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        
        for (int i = 0; i < this.getRowCount(); i++)
        {
            for (int j = 0; j < this.getColumnCount(); j++)
            {
                // Wir kennen noch keine Interfaces :(
                builder.append(this.getElement(i, j));
                builder.append(" ");
            }
            
            builder.append("\n\r");
        }
        
        return builder.toString();
    }
    
/*---------------------------- Getter and Setter -----------------------------*/
    
    public void setElement (int row, int column, int value)
    {
        this.getMatrix()[row][column] = value;
    }
    
    public int getElement (int row, int column)
    {
        return this.getMatrix()[row][column];
    }
    
    
    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public int getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    public int getColumnCount() {
        return columnCount;
    }

    public void setColumnCount(int columnCount) {
        this.columnCount = columnCount;
    }
}
