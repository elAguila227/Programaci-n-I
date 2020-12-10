import java.util.Arrays;
class MatrizIdentidad {

  //PRE: dimension>=0
  //POST: devuelve la matriz identidad de esa dimension. Si es 0, devolver� una matriz con 0 filas y 0
  //      columnas.
  static int[][] identidad(int dimension){
      int[][] mat = new int[dimension][dimension];
      for (int i = 0; i < mat.length; i++) {
          mat[i][i] = 1;
      }
      return mat;
 }

/////////////////////////////// ZONA METODOS PARA PRUEBAS-- NO MODIFIQUEIS NADA A PARTIR DE ESTE PUNTO

  static int[][] idRecAux(int dim, int[][] m, int index){
    if (index <dim){
      m[index][index] = 1;
      return idRecAux(dim, m, index+1);
    }
    return m;
  }
  static int [][] idRec(int dimension){
    int[][] id= new int[dimension][dimension];
    return idRecAux(dimension, id, 0);
  }




  public static void main(String[] args) {
    boolean correctoIdentidad = true;
    int[][] m1;
    int[][] m2;
    for (int i=0; i<=200 && correctoIdentidad; i++){
      m1 = idRec(i);
      m2 = identidad(i);
      correctoIdentidad = Arrays.deepEquals(m1, m2);
      if (!correctoIdentidad){
        System.out.println("Tu d�digo no genera la matriz identidad correcta para dimensi�n " + i);
        System.out.println("La matriz que generas es: \n" + Arrays.deepToString(identidad(i)));
      }
    }
    if (correctoIdentidad)
      System.out.println("PRUEBA MATRIZ IDENTIDAD SUPERADA");
  }
}
