package cleaningService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RoomCleaningService {
  List<Street> streets = new ArrayList<>();
  Street street;
  House house;
  Room room;

  // here we come w/ the lambda&stream things however at the moment I don't get it:
//  public void writeMeNiceThings(){
//    List<Street> openStreets = new ArrayList<>();
//    streets
//        .stream()
//        .filter(s -> s.isNotClosed)
//        .collect(Collectors.toSet(s))
//    ;
//  }

  public List<Boolean> cleanerCleansEverything() {
    if (room.isRoomDoorOpen) {
      for (int i = 0; i < room.checkList.size(); i++) {
        if (!room.checkList.get(i)) {
          room.checkList.set(i, true);
        }
      }
    }
    return room.checkList;
  }

  public boolean cleanTheShelves() {
    if (street.isNotClosed) {
      if (house.isPermission) {
        if (!room.areShelvesClean) {
          room.areShelvesClean = true;
        }
      }
    }
    return room.areShelvesClean;
  }

  public boolean sortBooks() {
    if (street.isNotClosed) {
      if (house.isPermission) {
        if (!room.areBooksSorted) {
          room.areBooksSorted = true;
        }
      }
    }
    return room.areBooksSorted;
  }

  public boolean cleanTheCarpet() {
    if (street.isNotClosed) {
      if (house.isPermission) {
        if (!room.isCarpetClean) {
          return room.isCarpetClean = true;
        }
      }
    }
    return room.isCarpetClean;
  }

  public boolean tidyTheTables() {
    if (street.isNotClosed) {
      if (house.isPermission) {
        if (!room.areTablesTidy) {
          return room.areTablesTidy = true;
        }
      }
    }
    return room.areTablesTidy;
  }

  public boolean cleanTheWindows() {
    if (street.isNotClosed) {
      if (house.isPermission) {
        if (!room.areWindowsClean) {
          return room.areWindowsClean = true;
        }
      }
    }
    return room.areWindowsClean;
  }

  public boolean freshTheAir() {
    if (street.isNotClosed) {
      if (house.isPermission) {
        if (!room.isAirFresh) {
          return room.isAirFresh = true;
        }
      }
    }
    return room.isAirFresh;
  }

  @Override
  public String toString() {
    return "RoomCleaningService{" +
        "streets=" + streets +
        ", street=" + street +
        ", house=" + house +
        ", room=" + room +
        '}';
  }

  public String reportStatus() {
    String roomStatus = "The above mentioned questions are checked and true:\n ";
    for (Boolean check : room.checkList) {
      if (check) {
        roomStatus = roomStatus + check.getClass().getName() + ", ";
      }
    }
    return toString() + roomStatus;
  }
}