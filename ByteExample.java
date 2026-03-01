class ByteExample {
    public static void main(String args[]) {
        byte packetsPerSecond = 20;
        byte seconds = 5;

        byte totalPackets = (byte)(packetsPerSecond * seconds);
        System.out.println("Total packets received = " + totalPackets);
    }
}
