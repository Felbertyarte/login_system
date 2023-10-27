import java.util.ArrayList;
class loginsystem{
    public static void main(String[] args){
        ArrayList<user> listofacc = new ArrayList<>();
        listofacc.add(new user("felbert", "felbert14"));
        listofacc.add(new user("felix", "felix421"));
        listofacc.add(new user("tarok", "qwerty"));

        String user_input = "tarok";
        String pass_input = "qwerty";


        for (int i = 0; i < listofacc.size();i++){
            if (user_input == listofacc.get(i).username && pass_input == listofacc.get(i).password){
                System.out.println("login succed");
                i = listofacc.size();
            }else{
                if (i == listofacc.size()-1){
                    System.out.println("Login Fail");
                }
            }

        }
    }
}