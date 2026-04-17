package thread_order;

public class OnlineOfflineSystem {
    public static void main(String[] args) {
        Data data = new Data();
        // Depois comentar para simular loop eterno no Sync
        data.setOutOfSync(true);
        Thread readData = new Thread(new ReadDataThread(data));
        Thread syncData = new Thread(new ReadDataThread(data));

        readData.start();
        // Corrigir loop eterno tornando a thread daemon
        syncData.setDaemon(true);
        syncData.start();
    }
}
