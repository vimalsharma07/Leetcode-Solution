class ParkingSystem {
int small_car, medium_car,big_car;
    
    public ParkingSystem(int big, int medium, int small) {
        this.small_car=small;
        this.medium_car=medium;
        this.big_car=big;
    }
    
    public boolean addCar(int carType) {
        if(carType==3){
            if(small_car>0){
                small_car--;
                return true;
            }
        }else if(carType==2){
            if(medium_car>0){
                medium_car--;
                return true;
            }
        }else{
            if(big_car>0){
                big_car--;
                return true;
            }
        }
        return false;
    }
    
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */