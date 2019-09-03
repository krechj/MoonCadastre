package domain.lot;

import util.Yield;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WaterExtraction extends Lot {

  private Yield cubicMeterPerYear;

}
