public class Main {
    public static void main(String[] args) {
        System.out.print("[メニュー]1:検索 2:登録 3:削除 4:変更>");
        int selected = new java.util.Scanner(System.in).nextInt();
        
        String console = "";
        switch(selected) {
            case 1:
                console = "検索します";
                break;
            case 2:
                console = "登録します";
                break;
            case 3:
                console = "削除します";
                break;
            case 4:
                console = "変更します";
                break;
            default:
                break;
        }
        
        System.out.println(console);
        
    }
    
}
