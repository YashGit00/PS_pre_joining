
public class Matrix 
{
	int mat[][];
	public Matrix() 
	{
		mat = new int[3][3];
	}
	public Matrix(int row, int col)
	{
		mat = new int[row][col];
	}
	public Matrix(int matrix[][])
	{
		mat = matrix.clone();
	}
	public Matrix(Matrix m)
	{
		mat = m.mat.clone();
	}
	private void display() 
	{
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j]+"\t");
			}
			System.out.println();
		}
	}
	public Matrix add(Matrix b)
	{
		Matrix c = new Matrix(b);
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				c.mat[i][j] = mat[i][j]+b.mat[i][j];
			}
		}
		return c;
	}
	public boolean isScalar()
	{
		if ( mat.length == 1) return true;
		if ( mat[0].length == 1) return true;
		return false;
	}
	public Matrix multiply(Matrix b)
	{
		Matrix c = new Matrix(b);
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				c.mat[i][j] = 0;
			}
		}
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++)
			{
				for (int k = 0; k < b.mat[0].length; k++) 
				{
					c.mat[i][k] += mat[i][j]*b.mat[j][k];
				}
			}
		}
		return c;
	}
}