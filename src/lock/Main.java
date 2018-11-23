package lock;

public class Main {
    public static void main(String[] args) {
        Lock lock = new Lock(6, 5, 1);
        System.out.println(lock);

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    if(lock.isOpen()){
                        System.out.println("zamek jest otwarty: " + lock);
                        return;
                    }
                    lock.switchC();
                }
                lock.switchB();
            }
            lock.switchA();
        }
    }

}
