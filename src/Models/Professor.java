/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

public class Professor extends User {
    
    public Professor(String firstName, String lastName, String email, String phoneNumber, int userId, Address residence, Date birthDate, int roleId, String password) {
        super(firstName, lastName, email, phoneNumber, userId, residence, birthDate, roleId, password);
    }
}
