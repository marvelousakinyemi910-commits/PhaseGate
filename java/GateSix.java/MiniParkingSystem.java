
public class MiniParkingSystem{
    public boolean parkingSlot(int[] parkingLot){
        for(int index = 0; index < parkingLot.length; index++)
            if(parkingLot[index] == 0){
               parkingLot[index] = 1;
                return true;
        }
        return false;
        }


    
     public boolean specificParkingSlot(int[] parkingLot, int slotNumber){
        if(slotNumber < 1 || slotNumber > 20 )
            return false;
        if(parkingLot[slotNumber -1] == 0){
            parkingLot[slotNumber - 1] = 1;
        
            return true;
        }
         return false;
    
        }

      public boolean leaveParkingSlot(int[] parkingLot, int slotNumber){
        if(slotNumber < 1 || slotNumber > 20 )
            return false;
        if(parkingLot[slotNumber -1] == 1){
            parkingLot[slotNumber - 1] = 0;
        
            return true;
        }

            return false;
        }


    
}
