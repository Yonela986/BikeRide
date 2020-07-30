package bicycles.models;


//import bicycles.bicycles;

public class RoadBike implements bicycles{
       private int speed;

        public void accelerate(){

            speed += 11;
        }

        public void brake(){
            if(speed > 4){
                speed -= 4;
            }else{
                speed = 0;
            }
        }

       public int currentSpeed(){
            return  speed;}
        public void stop(){
            speed = 0;
        }
    }


