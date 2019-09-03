package domain.lot;

import domain.products.mineral.Mineral;
import util.Yield;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Mining extends Lot{

  private Mineral mineral;
  private Yield yieldPerYear;

}
