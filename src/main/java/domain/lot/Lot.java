package domain.lot;

import java.util.List;
import util.Location;
import lombok.Getter;
import lombok.Setter;
import util.Transaction;

@Getter
@Setter
public class Lot {

  private Location location;
  private List<Transaction> transactionList;

}
