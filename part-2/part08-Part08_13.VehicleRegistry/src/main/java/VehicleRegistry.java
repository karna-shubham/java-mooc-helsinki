import java.util.HashMap;
import java.util.ArrayList;

public class VehicleRegistry {

    private HashMap<LicensePlate, String> owners;

    public VehicleRegistry() {
        this.owners = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (!owners.containsKey(licensePlate)) {
            owners.put(licensePlate, owner);
            return true;
        }
        return false;
    }

    public String get(LicensePlate licensePlate) {
        return owners.get(licensePlate);
    }

    public boolean remove(LicensePlate licensePlate) {
        if (owners.containsKey(licensePlate)) {
            owners.remove(licensePlate);
            return true;
        }
        return false;
    }

    public void printLicensePlates() {
        for (LicensePlate lp : owners.keySet()) {
            System.out.println(lp);
        }
    }

    public void printOwners() {
        ArrayList<String> printed = new ArrayList<>();
        for (String owner : owners.values()) {
            if (!printed.contains(owner)) {
                printed.add(owner);
                System.out.println(owner);
            }
        }
    }
}
