package Componentes;
import Principal.AppPrincipal;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.ItemCommandListener;
import javax.microedition.lcdui.StringItem;
/**
 *
 * @author Lyndemberg
 */
public class MenuPrincipal implements ItemCommandListener{
    private AppPrincipal app;
    private Form form = new Form("MENU PRINCIPAL");
    private StringItem login = new StringItem("FAZER LOGIN",null);
    private StringItem cadastro = new StringItem("CADASTRO",null);
    
    public MenuPrincipal(AppPrincipal telaRecebida){
        app = telaRecebida;
        login.addCommand(new Command("OK", Command.OK, 1));
        cadastro.addCommand(new Command("OK", Command.OK, 1));
        login.setItemCommandListener(this);
        cadastro.setItemCommandListener(this);
        form.append(login);
        form.append(cadastro);
    }
    
    public void mostrar(){
        app.getTela().setCurrent(form);
    }
    
    public void commandAction(Command c, Item item) {
        if(item == login){
            Login login = new Login(app);
            login.mostrar();
        }else if(item == cadastro){
            Cadastro cadastro = new Cadastro(app);
            cadastro.mostrar();
        }
    }
}
