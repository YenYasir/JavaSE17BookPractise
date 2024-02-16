package classdemo.ch9;

public class LoadSystemProps {
    public static void main(String[] args) {
        //可取得系統屬性
        var props = System.getProperties();
        System.out.println(props.getProperty("username"));
        System.out.println(props.getProperty("password"));
    }
}
