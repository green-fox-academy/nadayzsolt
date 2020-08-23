package cleaningService;

import java.util.ArrayList;
import java.util.List;

public class Room {
  String name;
  List<Boolean> checkList = new ArrayList<>();
  Boolean areShelvesClean;
  Boolean areBooksSorted;
  Boolean isCarpetClean;
  Boolean areTablesTidy;
  Boolean areWindowsClean;
  Boolean isAirFresh;
  Boolean isRoomDoorOpen;

  public Room(String name) {
    this.name = name;
  }
}
