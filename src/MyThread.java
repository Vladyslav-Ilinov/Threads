
public class MyThread extends Thread {
    int count = 8;
    int x1=0;
    int x2=1;
    int mas[];


    @Override
    public void run() {

        System.out.println ( "Поток Thread: " );
        for(int i = 0; i<count; i++){
            mas[i] = x1+x2;
            System.out.print (mas[i] + ", ");
            try {
                Thread.sleep ( 1000 );
            } catch (InterruptedException e) {
                e.printStackTrace ();
            }
            x1 = x2;
            x2 = mas[i];
        }

        System.out.println ( "Тестовый обратный поток" );
        for(int i = count-1; i > 0; i-- ){
            mas[i] = x1+x2;
            System.out.print (mas[i] + ", ");
            try {
                Thread.sleep ( 1000 );
            } catch (InterruptedException e) {
                e.printStackTrace ();
            }

        }



    }
}
