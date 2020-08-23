package cleaningService;

import java.util.ArrayList;
import java.util.List;

public class Street {
  String name;
  boolean isNotClosed;
  List<House> houses;
  int numOfHouses = houses.size();

  public Street(String name, boolean isNotClosed) {
    this.name = name;
    this.isNotClosed = isNotClosed;
  }
}
