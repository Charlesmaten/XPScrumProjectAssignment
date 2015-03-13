/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Phill
 */
public class UserSatisfaction {
    public final Student student;
    private Boolean hasFirstPrio,hasSecondPrio;

    public UserSatisfaction(Student student) {
        this.student = student;
    }

    public UserSatisfaction(Student student, Boolean hasFirstPrio, Boolean hasSecondPrio) {
        this.student = student;
        this.hasFirstPrio = hasFirstPrio;
        this.hasSecondPrio = hasSecondPrio;
    }

    public Boolean getHasFirstPrio() {
        return hasFirstPrio;
    }

    public void setHasFirstPrio(Boolean hasFirstPrio) {
        this.hasFirstPrio = hasFirstPrio;
    }

    public Boolean getHasSecondPrio() {
        return hasSecondPrio;
    }

    public void setHasSecondPrio(Boolean hasSecondPrio) {
        this.hasSecondPrio = hasSecondPrio;
    }
    
    
    
}
