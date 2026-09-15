public class shangchengdazhe {
    class discount{
        protected double price = 0;
        protected double discountRate;


        public discount(double price) {


            if(price < 100){
                this.discountRate = 0;
                this.price = price;
            }
            else if(price >= 100 && price < 200){
                this.discountRate = 0.9;

                this.price = price * this.discountRate;
            }
            else if(price >= 200 && price < 300){
                this.discountRate = 0.8;
                this.price = price * this.discountRate;
            }
            else{
                this.discountRate = 0.7;
                this.price = price * this.discountRate;
            }
        }
    }

    public static void main(String[] args) {
        shangchengdazhe scdz = new shangchengdazhe();


        discount d1 = scdz.new discount(50);
        System.out.println("原价: 50元, 折扣后价格: " + d1.price + "元, 折扣率: " + d1.discountRate);

        discount d2 = scdz.new discount(150);
        System.out.println("原价: 150元, 折扣后价格: " + d2.price + "元, 折扣率: " + d2.discountRate);

        discount d3 = scdz.new discount(250);
        System.out.println("原价: 250元, 折扣后价格: " + d3.price + "元, 折扣率: " + d3.discountRate);

        discount d4 = scdz.new discount(350);
        System.out.println("原价: 350元, 折扣后价格: " + d4.price + "元, 折扣率: " + d4.discountRate);
    }
}
