import java.util.Random;

public class test {
    public static void main(String[] args) {

        Random random = new Random();
        double anInt = random.nextInt(100);
        System.out.println(anInt);
        double num = 50;
        double a = 50;
        System.out.println(num);
        for(int i = 1; i < 7; i++){
            if(num<anInt){
                a=a/2;
                double ceil = Math.ceil(a);
                num=num+ceil;
                System.out.println(num);
            }else if(num>anInt){
                a=a/2;
                double ceil = Math.ceil(a);
                num=num-ceil;
                System.out.println(num);
            }else {
                break;
            }
            if(anInt==num){
                System.out.println("恭喜阿清成功");
            }
        }
    }
}
