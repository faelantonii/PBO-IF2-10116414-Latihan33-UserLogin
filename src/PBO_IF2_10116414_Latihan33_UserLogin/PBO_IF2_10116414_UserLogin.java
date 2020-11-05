/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO_IF2_10116414_Latihan33_UserLogin;

import java.util.Scanner;

/**
 *
 * @author sweenutt
 * Nama       : Fael Antoni Wijaya 
 * Kelas      : PBO2/IF 2 
 * Nim        : 10116414
 * Deskripsi  : Program user login
 */
public class PBO_IF2_10116414_UserLogin {
     public static void main(String[] args) {

        User login = new User();
        Scanner scn = new Scanner(System.in);

        System.out.print("Masukkan Username\t: ");
        String username = scn.next();
        System.out.print("Masukkan Password\t: ");
        String password = scn.next();
        System.out.println();

        login.cekLogin(username, password);
    }
}
