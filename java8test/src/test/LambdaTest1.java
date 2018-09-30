package test;

public class LambdaTest1 {

    public static void main(String[] args) {
        new Runnable(){

            @Override
            public void run() {
                System.out.println("匿名内部类实现Runnable接口");
            }
        }.run();

        int i=1;
        Runnable r=()->{
            System.out.println("使用lambda实现Runnable接口");
            System.out.println("i="+i);
        };

        r.run();
    }
}
