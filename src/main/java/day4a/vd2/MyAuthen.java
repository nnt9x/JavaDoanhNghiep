package day4a.vd2;

public class MyAuthen extends LibAuthen{
    // Ghi de phuong thuc

    @Override
    public boolean login(String email, String password) {
        // Bo sung them logic ve kiem tra email
        if(email.contains("bkacad.edu.vn")){
            return super.login(email, password);
        }
        return false;
    }

    public boolean login(int phone, String password){
        // Logic: login...
        return true;
    }

}
