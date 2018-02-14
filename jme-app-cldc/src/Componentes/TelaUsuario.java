
package Componentes;

import Principal.AppPrincipal;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.StringItem;

/**
 *
 * @author Lyndemberg
 */
public class TelaUsuario implements CommandListener{
    private AppPrincipal app;
    private Form form = new Form("PÁGINA DO USUÁRIO");
    private StringItem novo = new StringItem("Cadastrar produto",null);
    private StringItem listar = new StringItem("Listar produtos",null);
    public TelaUsuario(AppPrincipal app) {
        this.app = app;
        novo.addCommand(new Command("OK", Command.OK, 1));
        listar.addCommand(new Command("OK", Command.OK, 1));
        form.append(novo);
        form.append(listar);
        form.addCommand(new Command("SAIR", Command.EXIT, 1));
        form.setCommandListener(this);
    }
    
    public void mostrar(){
        app.getTela().setCurrent(form);
    }

    public void commandAction(Command c, Displayable d) {
        if(c.getLabel().equals("SAIR")){
            app.notifyDestroyed();
        }
    }
    
    
    
    
}
