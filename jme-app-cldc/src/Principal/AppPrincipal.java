package Principal;
import Componentes.MenuPrincipal;
import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.AlertType;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.ItemCommandListener;
import javax.microedition.midlet.*;
/**
 * @author Lyndemberg
 */
public class AppPrincipal extends MIDlet implements ItemCommandListener,CommandListener{
    private Display tela;
    private Alert boasVindas = new Alert("PDM APP", "Seja bem vindo ao meu primeiro aplicativo JME", null, AlertType.INFO);
    private Command entrar = new Command("ENTRAR", Command.OK, 1);
    private MenuPrincipal menu;
    public AppPrincipal(){
        boasVindas.addCommand(entrar);
        boasVindas.setCommandListener(this);
        tela = Display.getDisplay(this);   
        menu = new MenuPrincipal(this);
    }
    public void startApp() {
        tela.setCurrent(boasVindas);
    }
    public void commandAction(Command comando, Displayable dis){
        if(comando == entrar){
            menu.mostrar();
        }
    }
    public void pauseApp() {
    }
    
    public void destroyApp(boolean unconditional) {
        
    }

    public void commandAction(Command c, Item item) {
        
    }

    public Display getTela() {
        return tela;
    }

    public void setTela(Display tela) {
        this.tela = tela;
    }
    
    
}
