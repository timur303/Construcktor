package Constructor;

public class Class {
    private double num;
    private String name;
    private int[] array;

    public Class(double num, String name, int[] array) {
        this.num = num;
        this.name = name;
        this.array = array;
    }

    void info() {
        for (int j : array) {
            System.out.println("������ " + j);

        }
        System.out.println("�����: " + num + "\n��: " + name );
    }
}
