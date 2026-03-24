import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;


public class MiniParkingSystemTest{
    @Test
    public void testParkingLotAvailability(){
    MiniParkingSystem testing = new  MiniParkingSystem();
    int[] parkingLot = new int [20];
    boolean actualResult = testing.parkingSlot(parkingLot);
    
    assertTrue(actualResult);


    }
    @Test
    public void testThatSpecificParkingLotIsAvailable(){
    MiniParkingSystem testing = new  MiniParkingSystem();
    int[] parkingLot = new int [20];
    int slotNumber = 5;
    boolean actualResult = testing.specificParkingSlot(parkingLot,slotNumber);
    assertTrue(actualResult);

    }

    @Test
    public void testThatSlotNumberIsNotAvailable(){
    MiniParkingSystem testing = new  MiniParkingSystem();
    int[] parkingLot = new int [20];
    int slotNumber = 21;
    boolean actualResult = testing.specificParkingSlot(parkingLot,slotNumber);
    assertFalse(actualResult);
    } 
    
    @Test
    public void testThatAParkedCarIsRemoved(){
    MiniParkingSystem testing = new  MiniParkingSystem();
    int[] parkingLot = new int [20];
    int slotNumber = 5;
    testing.specificParkingSlot(parkingLot,slotNumber);
    boolean actualResult = testing.leaveParkingSlot(parkingLot,slotNumber);
    assertTrue(actualResult);
    } 
     
    @Test
    public 

    }
