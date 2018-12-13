package modele.services.exceptions;
/** 
 * La classe des exceptions lors on deplace un point.
 * @author H4404
 * @version 1.0
 * @since 1.0
*/

public class DeplacementPointDLException extends Exception {
	static String EXCEPTION_MESSAGE = "Un point de livraison ne peut pas être déplacé vers la même tournée.";
	public DeplacementPointDLException(){
        super(EXCEPTION_MESSAGE);
    }
}
