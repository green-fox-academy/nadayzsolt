package listTasks;

import java.util.ArrayList;
import java.util.List;

public class ListToSaveTheNewTaskReadByAddNewClass {
  List<String> todoLines = new ArrayList<>();

  public List<String> getTodoLines() {
    return todoLines;
  }

  public void setTodoLines(List<String> todoLines) {
    this.todoLines = todoLines;
  }
}
