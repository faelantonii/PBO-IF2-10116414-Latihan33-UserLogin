/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO_IF2_10116414_Latihan33_UserLogin;

/**
 *
 * @author sweenutt
 * Nama       : Fael Antoni Wijaya 
 * Kelas      : PBO2/IF 2 
 * Nim        : 10116414
 * Deskripsi  : Program user login
 */
public class User {
    String username;
    String password;
    boolean status;

    public boolean cekAkun(String userName, String passWord) {
        username = "Fael";
        password = "Ganteng";
        if (userName.equals(username)) {
            status = true;           
        } else if (passWord.equals(password)) {
            status = false;
        } else {
            status = false;
        }
        return status;

    }

    public void hasilLogin(boolean status, String userName) {
        if (status) {
            System.out.println("****** HALLO " + userName.toUpperCase()
                    + " ******");
            System.out.println("Selamat Datang Aplikasi Kakak.");
        } else {
            System.out.println("Oops, Username atau Password kamu salah");
        }
    }

    public void cekLogin(String userName, String passWord) {
        System.out.println(cekAkun(userName, passWord));
        hasilLogin(status, userName);
    }
}
