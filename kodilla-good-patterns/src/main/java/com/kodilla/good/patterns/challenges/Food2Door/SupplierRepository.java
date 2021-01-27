package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.*;

public class SupplierRepository {
    private List<Supplier> suppliers = new ArrayList<>();

    public SupplierRepository(){


    }
    public boolean checkAvailability() {
        for (Supplier s : suppliers) {
            if (s.canBeOrdered()) {
                return true;
            }
        }
        return false;
    }
}
