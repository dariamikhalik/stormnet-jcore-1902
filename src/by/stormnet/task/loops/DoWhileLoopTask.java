package by.stormnet.task.loops;

import by.stormnet.task.TaskNotImplementedException;

class DoWhileLoopTask {

  /**
   * Используя цикл do-while напишие код, который вернет
   * сумму чисел от 1 до 57 (не включительно).
   */
  int calculateSum() {
    int a = 1;
    int res = 0;
    do {
      res += a++;
    }
    while (a < 57);
    return res;
  }

  /**
   * Используя цикл do-while напишие код, который вернет
   * сумму чисел от x до y (не включительно).
   * Учитывайте, что:
   *  - если x равно y, то нужно вернуть 0
   *  - если x меньше y, то значения x будут возрастать на каждой итерации
   *  - если x больше y, то значения x будут убывать на каждой итерации
   */
  int calculateSum(int x, int y) {
    int res = 0;
    do {
      if (x < y) {
        res += x;
        x++;
      } else if (x > y) {
        res += x;
        x--;
      } else {
        res = 0;
      }
    } while (x < y || x > y);
    return res;
  }

  /**
   * Используя цикл do-while напишие код, который вернет
   * разность чисел от x до y (включительно).
   * Учитывайте, что:
   *  - если x меньше y, то значения x будут возрастать на каждой итерации
   *  - если x больше y, то значения x будут убывать на каждой итерации
   */
  int calculateSub(int x, int y) {
    int res = x;
    do {
      if (x < y) {
        x++;
        if (x == y) {
          res -= x;
          break;
        }
        res -= x;
      } else if (x > y) {
        x--;
        if (x == y) {
          res -= x;
          break;
        }
        res -= x;
      } else {
        res -= x;
        break;
      }
    } while (x < y || x > y || x == y);
    return res;
  }

  /**
   * Используя цикл do-while напишие код, который вернет
   * произведение только четных чисел от 1 до 42 (не включительно).
   */
  long calculateEvenMultiply() {
    long res = 1;
    long a = 1;
    do {
      if (a % 2 == 0) {
        res *= a;
      }
      a++;
    } while (a > 0 && a < 42);
    return res;
  }
}
