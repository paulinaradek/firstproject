package service;

import model.House;
import model.Offer;

import java.rmi.server.UID;

public interface OfferService {
    void addOffer(House house);
    Offer searchOfferByArrea (int min, int max);
    Offer seachOfferByPrice (int min, int max);
    Offer searchOfferByRooms (int rooms);
    void removeOffer (UID ID);

}
