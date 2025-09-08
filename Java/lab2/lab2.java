public class lab2 {
    public static void main(String[] args) {
        
    }
    public class  car {
        private String brand;
        private String model;
        protected int year;
        
        public void setBrand(String b){
            brand = b;
        }
        public String getBrand(){
            return brand ;
        }
        public void setModel(String m){
            model = m ;
        }
        public String getModel(){
            return model;
        }
        public void setYear(int y){
            year = y ;
        }
        public int getYear(){
            return year;
        }
    }

}
