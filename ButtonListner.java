import java.awt.*;
import java.awt.event.*;
public class ButtonListner implements ActionListener {
    TextField tname,temail,tpass,tcpass,tdob,tphone;
    Choice cgender;
    TextArea taddress;
    DB db=new DB();
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
public void actionPerformed(ActionEvent e) {
    if (tpass.getText().equals(tcpass.getText())) {
        db.insert(
            tname.getText(),
            temail.getText(),
            tpass.getText(),
            cgender.getSelectedItem(),
            tdob.getText(),
            tphone.getText(),
            taddress.getText()
        );
    } else {
        System.out.println("Passwords do not match!");
    }
}

    
}