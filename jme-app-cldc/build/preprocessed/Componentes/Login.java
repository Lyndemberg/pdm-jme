package Componentes;
import Principal.AppPrincipal;
import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.AlertType;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.TextField;
/**
 *
 * @author Lyndemberg
 */
public class Login implements CommandListener{
    private AppPrincipal app;
    private Form form = new Form("TELA DE LOGIN");
    private TextField email = new TextField("E-mail", "", 100, TextField.EMAILADDR);
    private TextField senha = new TextField("Senha", "", 50, TextField.PASSWORD);
    public Login(AppPrincipal telaRecebida){
        app = telaRecebida;
        form.append("Preencha os campos abaixo para fazer login");
        form.append(email);
        form.append(senha);
        form.addCommand(new Command("LOGAR", Command.OK, 1));
        form.setCommandListener(this);
    }
    public void mostrar(){
        app.getTela().setCurrent(form);
    }

    public void commandAction(Command c, Displayable d) {
        if(c.getLabel() == "LOGAR"){
            if(email.getString().equals("a@gmail.com") && senha.getString().equals("123")){
                Alert entrou = new Alert("SUCESSO NO LOGIN", "Você será redirecionado para página inicial", 
                                    null, AlertType.CONFIRMATION);
                app.getTela().setCurrent(entrou);
                try {
                    Thread.sleep(1000);
                    TelaUsuario userTela = new TelaUsuario(app);
                    userTela.mostrar();
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }else{
                Alert erro = new Alert("ERRO AO LOGAR", "Não foi possível fazer login!", 
                                    null, AlertType.ERROR);
                app.getTela().setCurrent(erro);
            }
        }
    }
}
