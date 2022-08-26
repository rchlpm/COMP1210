import java.text.DecimalFormat;
/**
*
*
*
*
* @author Rachel Meredith
* @version 4/3/2020
*
**/
public abstract class CloudStorage {
   protected String name;
   protected String baseStorageCost;
   protected static int count = 0;
  //
  //
  //
   public CloudStorage(String nameIn, String BaseStorageIn, int countIn) {
      name = nameIn;
      base = baseStorageCostIn;
      count++;
   }
      //
   public String getName() {
      return name;
   }
         //
   public void setName(String nameIn) {
      this.name = nameIn;
   }
         //
   public String getBaseStorageCost() {
      return baseStorageCost;
   }
       //
   public String setBaseStorageCost(String baseStorageCostIn) {
      this.base = baseStorageCostIn;
   }
         //
         
}