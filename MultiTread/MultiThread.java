package MultiTread;

import java.io.*;

public class MultiThread  {
    public static void main(String[] args) throws InterruptedException, IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        String name=bufferedReader.readLine();

        MyThread myThread=new MyThread();
        myThread.name="первый";
        myThread.run();
        if (name.equals(" ") || name.equals("") || name.equals("s")){
            myThread.stopRun();
        }




    }
}

class MyThread extends Thread  {
    String name;
    boolean answer = true;
    @Override
    public void run(){
        while (answer){
            System.out.println("Hello");

            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }


    }

    public void stopRun() {
        this.answer = false;


    }
}
