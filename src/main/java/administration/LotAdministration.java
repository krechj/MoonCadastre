package administration;

import domain.lot.Lot;
import java.util.ArrayList;
import java.util.List;

public class LotAdministration {

  private List<Lot> lotList;

  public double getAverageLotSells(){
    int timesSold = 0;
    for(int i=0;i<lotList.size();i++){
      timesSold = timesSold + lotList.get(i).getTransactionList().size();
    }
    return timesSold/lotList.size();
  }

  public List<Lot> getLotsSoldAboveAverage(){
    List<Lot> lots = new ArrayList<>();

    lotList.forEach(lot -> {
      if(lot.getTransactionList().size() > getAverageLotSells()){
        lots.add(lot);
      }
    });
    return lots;
  }

  public List<Lot> getLotsSoldBelowAverage(){
    List<Lot> lots = new ArrayList<>();

    lotList.forEach(lot -> {
      if(lot.getTransactionList().size() <= getAverageLotSells()){
        lots.add(lot);
      }
    });
    return lots;
  }
}
