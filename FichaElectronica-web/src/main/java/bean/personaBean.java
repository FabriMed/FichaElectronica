/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import model.Persona;
import session.PersonaFacade;
import session.PersonaFacadeLocal;

/**
 *
 * @author cabldgti09
 */
@ManagedBean
@RequestScoped
public class personaBean {
    @EJB
    private PersonaFacadeLocal personaFacade;
    
    private Persona persona;

    /**
     * Creates a new instance of personaBean
     */
    public personaBean() {
       
        persona = new Persona();
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    
    public void guardar(){
        personaFacade.create(persona);
    }
}
