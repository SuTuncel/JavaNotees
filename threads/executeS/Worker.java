package threads.executeS;

public class Worker implements Runnable{
    private String isim;
    private int taskId;

    public Worker(String isim, int taskId){
        this.isim=isim;
        this.taskId=taskId;
    }


    @Override
    public void run() {
        try {
        System.out.println("Worker: "+ isim+ " "+ taskId+". işe başladı");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Worker: "+ isim+ " "+ taskId+". işi bitirdi");

    }
}
