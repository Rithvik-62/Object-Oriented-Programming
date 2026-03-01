interface Callback {
    void callback(int param);
}

class Client implements Callback {
    public void callback(int p) {
        System.out.println("Callback called with " + p);
    }
}

class InterfaceDemo {
    public static void main(String args[]) {
        Client c = new Client();
        c.callback(10);
    }
}