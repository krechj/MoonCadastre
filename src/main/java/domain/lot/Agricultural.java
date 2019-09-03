package domain.lot;

import domain.products.crops.Crop;
import util.Yield;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Agricultural extends Lot {

  private Crop crop;
  private Yield kilosPerYear;

}
