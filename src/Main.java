public class Main {
    public static void main(String[] args) {
        BasebollPlayer baseballPlayer1 = new BasebollPlayer("長嶋茂雄", "サード");
        BasebollPlayer baseballPlayer2 = new BasebollPlayer("GG佐藤", "外野");
        System.out.println("選手の名前は" + baseballPlayer1.getName());
        System.out.println("選手のポジションは" + baseballPlayer1.getPosition());
        baseballPlayer1.setName("王貞治");
        System.out.println("選手の名前は" + baseballPlayer1.getName());

        String nam[] = {"佐藤", "田中", "山田"};
        for (String Str : nam) {
            System.out.println(Str);
        }
    }
}