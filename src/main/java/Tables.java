public class Tables {
    public String getSmallMultiplicationTable() {
        StringBuilder table = new StringBuilder();
        for (int i = 1; i <=5; i++) {
            for (int j = 1; j <=5; j++) {
                table.append(String.format("%5s", (i * j) + " |"));
            }
            table.append("\n");
        }
        return table.toString();
    }

    public String getLargeMultiplicationTable() {
        StringBuilder table = new StringBuilder();
        for (int i = 1; i <=10; i++) {
            for (int j = 1; j <=10; j++) {
                table.append(String.format("%5s", (i * j) + " |"));
            }
            table.append("\n");
        }
        return table.toString();
    }

    public String getMultiplicationTable(int tableSize) {
        StringBuilder table = new StringBuilder();
        for (int i = 1; i <=tableSize; i++) {
            for (int j = 1; j <=tableSize; j++) {
                table.append(String.format("%5s", (i * j) + " |"));
            }
            table.append("\n");
        }
        return table.toString();
    }
}
