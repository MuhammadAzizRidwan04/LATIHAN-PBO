/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kelas;

/**
 *
 * @author M. Aziz Ridwan
 */
public class Session {
    
   private static String UserName, Nama, Email,Status;

   

    public static String getUserName() {
        return UserName;
    }

    public static void setUserName(String UserName) {
        Session.UserName = UserName;
    }

    public static String getNama() {
        return Nama;
    }

    public static void setNama(String Nama) {
        Session.Nama = Nama;
    }

    public static String getEmail() {
        return Email;
    }

    public static void setEmail(String Email) {
        Session.Email = Email;
    }
    
     public static String getStatus() {
        return Status;
    }

    public static void setStatus(String Status) {
        Session.Status = Status;
    }
    
    
}
