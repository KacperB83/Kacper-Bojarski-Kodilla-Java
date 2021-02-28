package com.kodilla.good.patterns.srp;

import java.time.LocalDateTime;

public class CarRentalService implements RentalService {
    @Override
    public boolean rent(User user, LocalDateTime from, LocalDateTime to) {
        return false;
    }
}
