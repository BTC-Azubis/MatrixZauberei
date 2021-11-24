package matrixzauberei;

import matrixzauberei.control.MatrixController;
import matrixzauberei.model.Matrix;
import matrixzauberei.utilities.MyIO;

public class Main
{
    public static void main(String[] args)
    {
        runMatrixMultiplication();
    }
    
    private static void runMatrixMultiplication ()
    {
        MyIO.print("Type in the size of the first n*n-Matrix");
        int sizeA = Integer.valueOf(MyIO.getNextInput());
        Matrix A = new Matrix(sizeA, sizeA, true);
        MyIO.print(A.toString());
        MyIO.print("Type in the size of the second n*n-Matrix");
        int sizeB = Integer.valueOf(MyIO.getNextInput());
        Matrix B = new Matrix(sizeB, sizeB, true);
        MyIO.print(B.toString());
        
        MyIO.print(MatrixController.multiply(A, B).toString());
    }
}
