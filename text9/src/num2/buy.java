package num2;

public class buy {
    public static void main(String[] args){
        shop[] arr = new shop[3];
        shop g1 = new shop("001", "手机", 1999, 100);
        shop g2 = new shop("002", "保温杯", 227, 50);
        shop g3 = new shop("003", "枸杞", 12.7, 70);
        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;
        for (int i = 0; i < arr.length; i++) {
            shop goods = arr[i];
            System.out.println(arr[i].getId() +"," + arr[i].getName() + "," + arr[i].getPrice() + "," + arr[i].getNumber());
        }
    }
}
