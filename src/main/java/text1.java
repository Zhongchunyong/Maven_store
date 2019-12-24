public class text1 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("连接成功");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
