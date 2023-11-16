package pt.iade.unimanager.models.repositories;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import pt.iade.unimanager.models.Student;
import pt.iade.unimanager.models.Unit;

public class UnitRepository {

    private static ArrayList<Unit> units = new ArrayList<Unit>();

  public static void populate() {
    Unit u; // auxiliary variable
    u = new Unit(1, "POO", 6);
    units.add(u);
    u = new Unit(2, "BD", 6);
    units.add(u);
  }

    public static List<Unit> getUnits() {
        return units;
    }

    public static Unit getUnit(int number) {
        for (Unit unit : units)
            if (unit.getId() == number)
                return unit;
        return null;
    }

    public static boolean deleteUnit(int number) {
        return units.removeIf(
                (u) -> u.getId() == number);
    }

    public static Unit addStudent(Unit unit) {
        units.add(unit);
        return unit;
    }

}