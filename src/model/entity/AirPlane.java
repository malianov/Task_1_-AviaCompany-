package model.entity;

    public class AirPlane {

        private String  model;
        private int     passengersCapacity;
        private double  cargoCapacity;
        private double  maxFlyDistance;
        private double  fuelTankVolume;

        public AirPlane(String model, int passengersCapacity, double cargoCapacity, double maxFlyDistance, double fuelTankVolume) {
            this.model               = model;
            this.passengersCapacity  = passengersCapacity;
            this.cargoCapacity       = cargoCapacity;
            this.maxFlyDistance      = maxFlyDistance;
            this.fuelTankVolume      = fuelTankVolume;
        }

        public double fuelPerKilometerCalculation() {
            return getFuelTankVolume() / getMaxFlyDistance();
        }

        public String getModel() {
            return model;
        }

        public int getPassengersCapacity() {
            return passengersCapacity;
        }

        public double getCargoCapacity() {
            return cargoCapacity;
        }

        public double getMaxFlyDistance() {
            return maxFlyDistance;
        }

        public double getFuelTankVolume() {
            return fuelTankVolume;
        }


        @Override
        public String toString() {
            return getModel();
        }
    }
