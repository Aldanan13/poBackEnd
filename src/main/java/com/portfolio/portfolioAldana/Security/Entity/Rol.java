
package com.portfolio.portfolioAldana.Security.Entity;

import com.portfolio.portfolioAldana.Security.Enums.RolNom;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;



@Entity
public class Rol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull
    @Enumerated(EnumType.STRING)
    private RolNom rolNom;

    public Rol() {
    }

    public Rol(RolNom rolNom) {
        this.rolNom = rolNom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public RolNom getRolNom() {
        return rolNom;
    }

    public void setRolNom(RolNom rolNom) {
        this.rolNom = rolNom;
    }
    
    

}
    
