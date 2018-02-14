package Componentes;
import Principal.AppPrincipal;
import java.util.TimeZone;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.DateField;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.TextField;
/**
 *
 * @author Lyndemberg
 */
public class Cadastro implements CommandListener {
    private AppPrincipal app;
    private Form form = new Form("TELA DE CADASTRO");
    private TextField nome = new TextField("Nome", null, 100, TextField.ANY);
    private TextField email = new TextField("E-mail", null, 100, TextField.EMAILADDR);
    private TextField senha = new TextField("Senha", null, 100, TextField.PASSWORD);
    private DateField nascimento = new DateField("Nascimento", DateField.DATE, TimeZone.getTimeZone("America/Recife"));
    
    public Cadastro(AppPrincipal app){
        this.app = app;
        form.append(nome);
        form.append(email);
        form.append(senha);
        form.append(nascimento);
        form.addCommand(new Command("FINALIZAR",Command.OK,1));
        form.setCommandListener(this);
    }


    public void mostrar(){
        app.getTela().setCurrent(form);
    }

    public void commandAction(Command c, Displayable d) {
        if(c.getLabel().equals("FINALIZAR")){
            
        }
    }
    

}
