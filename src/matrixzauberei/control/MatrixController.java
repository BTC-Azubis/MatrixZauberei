package matrixzauberei.control;

import java.util.Random;
import matrixzauberei.model.Matrix;

/**
 * 
 * @author Jesse Gollub
 */
public class MatrixController
{
    /**
     * Fills the Matrix A with random Integer values
     * @param A 
     */
    public static void fillWithRandomIntValues (Matrix A)
    {
        Random randomizer = new Random();
        
        for (int i = 0; i < A.getRowCount(); i++)
        {
            for (int j = 0; j < A.getColumnCount(); j++)
            {
                A.setElement(i, j, randomizer.nextInt(10));
            }
        }
    }
    
    /**
     * Adds Matrix B to Matrix A
     * @param A
     * @param B
     * @return returns null if (A.getColumnCount() != B.getColumnCount()) || (A.getRowCount() != B.getRowCount())
     */
    public static Matrix add (Matrix A, Matrix B)
    {
        if ((A.getColumnCount() != B.getColumnCount()) || (A.getRowCount() != B.getRowCount()))
        {
            // Ab Kapitel 8: Exception werfen!
            return null;
        }
     
        Matrix C = new Matrix(A.getRowCount(), A.getColumnCount(), false);
        
        for (int i = 0; i < A.getRowCount(); i++)
        {
            for (int j = 0; j < A.getColumnCount(); j++)
            {
                C.setElement(i, j, A.getElement(i, j) + B.getElement(i, j));
            }
        }
        
        return C;
    }
    
    /**
     * Multiplies the Matrix B to Matrix A
     * @param A
     * @param B
     * @return returns null if A.getColumnCount() != B.getRowCount()
     */
    public static Matrix multiply (Matrix A, Matrix B)
    {
        if (A.getColumnCount() != B.getRowCount())
        {
            // Ab Kapitel 8: Exception werfen!
            return null;
        }
        
        Matrix C = new Matrix(A.getRowCount(), B.getColumnCount(), false);
        
        for (int row = 0; row < C.getRowCount(); row++)
        {
            for (int column = 0; column < C.getColumnCount(); column++)
            {
                int value = 0;
                for (int i = 0; i < A.getRowCount(); i++)
                {
                    value += A.getElement(row, i) * B.getElement(i, column);
                }
                C.setElement(row, column, value);
            }
        }
        
        return C;
    }
    
    /**
     * Does the same as {@link matrixzauberei.control.MatrixController#multiply multiply}
     * @param A
     * @param B
     * @return 
     */
    public static Matrix multiplyAlternativeWhile (Matrix A, Matrix B)
    {
        if (A.getColumnCount() != B.getRowCount())
        {
            // Ab Kapitel 8: Exception werfen!
            return null;
        }
        
        Matrix C = new Matrix(A.getRowCount(), B.getColumnCount(), false);
        int row = 0;
        while (row < C.getRowCount())
        {
            int column = 0;
            while (column < C.getColumnCount())
            {
                int value = 0;
                int index = 0;
                while (index < A.getRowCount())
                {
                    value += A.getElement(row, index) * B.getElement(index, column);
                    index++;
                }
                C.setElement(row, column, value);
                column++;
            }
            row++;
        }
        
        return C;
    }
    
    /**
     * Does the same as {@link matrixzauberei.control.MatrixController#multiply multiply}
     * @param A
     * @param B
     * @return 
     */
    public static Matrix multiplyAlternativeDoWhile (Matrix A, Matrix B)
    {
        if (A.getColumnCount() != B.getRowCount())
        {
            // Ab Kapitel 8: Exception werfen!
            return null;
        }
        
        Matrix C = new Matrix(A.getRowCount(), B.getColumnCount(), false);
        int row = 0;
        do
        {
            int column = 0;
            do
            {
                int value = 0;
                int index = 0;
                do
                {
                    value += A.getElement(row, index) * B.getElement(index, column);
                    index++;
                } while (index < A.getRowCount());
                C.setElement(row, column, value);
                column++;
            } while (column < C.getColumnCount());
            row++;
        } while (row < C.getRowCount());
        
        return C;
    }
}
