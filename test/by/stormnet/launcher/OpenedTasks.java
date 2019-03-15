package by.stormnet.launcher;

import by.stormnet.task.arrays.ArraysTaskTest;
import by.stormnet.task.conditionals.IfElseTaskTest;
import by.stormnet.task.conditionals.SwitchTaskTest;
import by.stormnet.task.loops.DoWhileLoopTaskTest;
import by.stormnet.task.loops.ForLoopTaskTest;
import by.stormnet.task.loops.WhileLoopTaskTest;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface OpenedTasks {

  List<Class> classes = Stream.of(
      IfElseTaskTest.class,
      SwitchTaskTest.class,
      DoWhileLoopTaskTest.class,
      ForLoopTaskTest.class,
      WhileLoopTaskTest.class,
      ArraysTaskTest.class
  ).collect(Collectors.toList());

  List<String> packages = Stream.of(
      "by.stormnet.task.numsys",
      "by.stormnet.task.types",
      "by.stormnet.task.operators"
  ).collect(Collectors.toList());
}
