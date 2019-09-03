package util;

import domain.lot.Lot;

public class Transaction {

  private String seller;
  private String buyer;
  private Double price;
  private Lot lot;

  public Transaction build(String seller, String buyer, Double price, Lot lot){
    Transaction temp = new Transaction();
    temp.seller = seller;
    temp.buyer = buyer;
    temp.price = price;
    temp.lot = lot;
    return temp;
  }

}
