import java.awt.event.*;
import java.awt.*;
public class ButtonListner implements ActionListener {
    TextField tname,temail,tpass,tcpass,tdob,tphone;
    Choice cgender;
    TextArea taddress;
    ButtonListner(TextField tname, TextField temail, TextField tpass, TextField tcpass, TextField tdob, TextField tphone, Choice cgender, TextArea taddress){
        this.tname = tname;
        this.temail = temail;
        this.tpass = tpass;
        this.tcpass = tcpass;
        this.tdob = tdob;
        this.tphone = tphone;
        this.cgender = cgender;
        this.taddress = taddress;
    }
   @Override
    public void actionPerformed(ActionEvent e){
        String data="Name: "+tname.getText()+"\n";
        data+="Email: "+temail.getText()+"\n";
        data+="Password: "+tpass.getText()+"\n";
        data+="Re-enter: "+tcpass.getText()+"\n";
        System.out.println(data);
    }
    
}