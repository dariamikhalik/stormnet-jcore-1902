package by.stormnet.task.math;

import by.stormnet.task.TaskNotImplementedException;

class DivideOnZeroTask {

  /**
   * Выполнитие деление чисел x на y типа float.
   * Если результат от деления равен:
   *  - положительный бесконечности, то в качестве ответа верните 1.
   *  - отрицательной бесконечности, то в качестве ответа верните -1.
   *  - не числу (NaN), то в качестве ответа верните 0.
   *  - иначе верните получившийся результат от деления.
   */
  float floatDivide(float x, float y) {
    float z=x/y;
    if(z==Float.POSITIVE_INFINITY){
      return 1;
    }else if(z==Float.NEGATIVE_INFINITY){
      return -1;
    }else if(Float.isNaN(z)){
      return 0;
    }else{
      return z;
    }
  }

  /**
   * Выполнитие деление чисел x на y типа double.
   * Если результат от деления равен:
   *  - положительный бесконечности, то в качестве ответа верните 1.
   *  - отрицательной бесконечности, то в качестве ответа верните -1.
   *  - не числу (NaN), то в качестве ответа верните 0.
   *  - иначе верните получившийся результат от деления.
   */
  double doubleDivide(double x, double y) {
    double z=x/y;
    if(z==Double.POSITIVE_INFINITY){
      return 1;
    }else if(z==Double.NEGATIVE_INFINITY){
      return -1;
    }else if(Double.isNaN(z)){
      return 0;
    }else{
      return z;
    }
  }
}
