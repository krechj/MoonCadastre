package domain.products.mineral;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Mineral {

  private MineralEnum elementName;
  private Integer elementNumber;
  private Double density;
  private boolean radioactive;

}
