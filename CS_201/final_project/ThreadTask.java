package final_project;

public class ThreadTask implements Runnable {
    private int id;

    public ThreadTask(int id) {
        this.id = id;
    }

    public void run() {
        System.out.println("I am task " + id);
    }
}

