package vue.handler;

import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.Group;

/** 
 * La classe du groupe handler pour gerer l'action sur IHM.
 * @author H4404
 * @version 1.0
 * @since 1.0
*/

public class GroupHandler implements EventHandler<MouseEvent> {
	 
    private Group monGroup;
    private double oldGroupX;
    private double oldGroupY;
    private double oldScreenX;
    private double oldScreenY;

    /**
     * Contstructeur de la classe GroupHandler.
     * @param unGroup : le groupe ou nous voulons ajouter ce handler.
     */
    public GroupHandler(Group unGroup) {
        this.monGroup = unGroup;
    }

    /**
     * Cette methode nous permet de deplacer tous les elements sur le plan en tirant par le souris. 
     */
    @Override
    public void handle(MouseEvent e) {
        if (e.getEventType() == MouseEvent.MOUSE_PRESSED) {  
            this.oldGroupX = this.monGroup.getTranslateX();
            this.oldGroupY = this.monGroup.getTranslateY();
            this.oldScreenX = e.getScreenX();
            this.oldScreenY = e.getScreenY();

        } else if (e.getEventType() == MouseEvent.MOUSE_DRAGGED) { 
            this.monGroup.setTranslateX(e.getScreenX() - this.oldScreenX + this.oldGroupX);
            this.monGroup.setTranslateY(e.getScreenY() - this.oldScreenY + this.oldGroupY);
        }
    }
}
