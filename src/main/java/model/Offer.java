package model;

import model.House;

import java.time.LocalDate;
import java.util.UUID;

public class Offer {
    private UUID Id;
    private LocalDate creationDate;
    private LocalDate expiredDate;
    private House house;

    public UUID getId() {
        return Id;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public LocalDate getExpiredDate() {
        return expiredDate;
    }

    public void setExpiredDate(LocalDate expiredDate) {
        this.expiredDate = expiredDate;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public Offer(House house) {
        this.house = house;
        this.creationDate = LocalDate.now();
        this.expiredDate = LocalDate.now().plusWeeks(2);
        this.Id = UUID.randomUUID();
    }
}