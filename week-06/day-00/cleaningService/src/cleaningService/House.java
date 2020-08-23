package cleaningService;

import java.util.ArrayList;
import java.util.List;

public class House {
  String owner;
  boolean isPermission;
  List<Room> rooms = new ArrayList<>();
  int numOfRooms = rooms.size();

  public House(String owner, boolean isPermission) {
    this.owner = owner;
    this.isPermission = isPermission;
  }
}
