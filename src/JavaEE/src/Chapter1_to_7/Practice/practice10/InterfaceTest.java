package Chapter1_to_7.Practice.practice10;

public class InterfaceTest {
    public static void main(String[] args) {

        ComparableCircle c1 = new ComparableCircle(3.4);
        ComparableCircle c2 = new ComparableCircle(3.6);

        int compareValue = c1.compareTo(c2);
        if(compareValue > 0){
            System.out.println("c1大");
        } else if (compareValue < 0) {
            System.out.println("c2大");
        }else {
            System.out.println("一样大");
        }

    }
}
