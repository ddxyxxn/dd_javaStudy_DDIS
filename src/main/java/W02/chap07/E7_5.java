package W02.chap07;

class Product{
    int price;          // 제품의 가격
    int bonusPoint;     // 제품구매 시 제공하는 보너스 점수

    Product(int price){
        this.price = price;
        bonusPoint = (int) (price / 10.0);
    }
}

/*class Tv extends Product{
    Tv() {}     // 여기가 문제? 상속 받으려면 부모 생성자를 먼저 생성 후 자식 생성자 생성

    public String toString() {
        return "Tv";
    }

}*/


/*public class E7_5 {

    public static void main(String[] args) {
        Tv t = new Tv();

    }
}*/
