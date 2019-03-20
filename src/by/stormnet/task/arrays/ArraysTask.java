package by.stormnet.task.arrays;

import by.stormnet.task.TaskNotImplementedException;

class ArraysTask {

  /**
   * Получить длину массива.
   */
  int arrayLength(int[] values) {
    return values.length;
  }

  /**
   * Получить первый элемент массива.
   */
  int firstElement(int[] values) {
    return values[0];
  }

  /**
   * Получить последний элемент массива.
   */
  int lastElement(int[] values) {
    return values[values.length-1];
  }

  /**
   * Получить сумму 3 - 7 элементов массива.
   */
  int elementsSum(int[] values) {
    return values[3]+values[4]+values[5]+values[6]+values[7];
  }

  /**
   * Получить новый массив, в котором будут 3, 5 - 7 элементы из исходного массива.
   */
  int[] selectElements(int[] values) {
    int[] result = new int[4];
    int j=0;
     for (int i=0;i<values.length;i++){
       if (i==3||i==5||i==6||i==7) {
         result[j]=values[i];
         j++;}
     }
     return result;
  }

  /**
   * Посчитать количество букв k в строке, используя цикл foreach.
   */
  int countOfLetterInString(String str) {
  //  char[] arr=str.toCharArray();
    int result=0;
    for (char i:str.toCharArray()/*int i=0;i<arr.length;i++*/) {
      if (i=='k') {result++;}
    }
    return result;
  }

  /**
   * Посчитать сумму чисел в каждой строке матрицы,
   * затем вычислить сумму полученных сумм со строк.
   * К примеру,
   *  1 3 5
   *  2 4 5
   *
   * Сумма чисел первой строки: 1 + 3 + 5 = 9
   * Сумма чисел второй строки: 2 + 4 + 5 = 11
   * Сумма полученных сумм со строк: 9 + 10 = 20
   */
  int rowsSum(int[][] matrix) {
    int result=0;
    for (int i=0;i<matrix.length;i++){
      for (int j=0;j<matrix[i].length;j++){
        result+=matrix[i][j];
      }
    } return result;
  }
}
