
import java.awt.*;
public class Form {
    Form(){
        Frame f=new Frame("User Registration Form");
        Label title,lname,lemail,lpass,lcpass,lgender,ldob,lphone,laddress;
        TextField tname,temail,tpass,tcpass,tdob,tphone;
        Choice cgender;
        TextArea taddress;
        Font font=new Font("Times New Roman", Font.PLAIN, 15);
        Button submit=new Button("Submit");
        submit.setFont(font);
        submit.setBounds(150, 550, 100, 30);
       //title
        title=new Label("User Registration Form", Label.CENTER);
        title.setFont(new Font("Times New Roman", Font.BOLD, 20));
        title.setBounds(50, 40, 300, 30);
       //name
        tname=new TextField();
        tname.setFont(font);
        tname.setBounds(120, 100, 200, 25);
        lname=new Label("Name:");
        lname.setBounds(40, 100, 80, 25);
        lname.setFont(font);
        //email
        temail=new TextField();
        temail.setFont(font);
        temail.setBounds(120, 150, 200, 25);
        lemail=new Label("Email:");
        lemail.setBounds(40, 150, 80, 25);
        lemail.setFont(font);
        //password
        tpass=new TextField();
        tpass.setFont(font);
        tpass.setBounds(120, 200, 200, 25);
        lpass=new Label("Password:");
        lpass.setBounds(40, 200, 80, 25);
        lpass.setFont(font);
        //Confirm Password
        tcpass=new TextField();
        tcpass.setFont(font);
        tcpass.setBounds(120, 250, 200, 25);
        lcpass=new Label("Re-enter:");
        lcpass.setBounds(40, 250, 80, 25);
        lcpass.setFont(font);
        //Gender
        lgender=new Label("Gender:");
        lgender.setFont(font);
        lgender.setBounds(40, 300, 80, 25);  // Align
        cgender=new Choice();   
        cgender.setFont(font);
        cgender.setBounds(120, 300, 200, 25);  
        cgender.add("Male");
        cgender.add("Female");
        cgender.add("Other");
        //Dob
        tdob=new TextField();
        tdob.setFont(font);
        tdob.setBounds(120, 350, 200, 25);
        ldob=new Label("DOB:");
        ldob.setBounds(40, 350, 80, 25);
        ldob.setFont(font);
         //Phone
        tphone=new TextField();
        tphone.setFont(font);
        tphone.setBounds(120, 400, 200, 25);
        lphone=new Label("Phone:");
        lphone.setBounds(40, 400, 80, 25);
        lphone.setFont(font);
        //Address
        taddress=new TextArea();
        taddress.setFont(font);
        taddress.setBounds(120, 450, 200, 75);
        laddress=new Label("Address:");
        laddress.setBounds(40, 450, 80, 25);
        laddress.setFont(font);  

        //Adding components to frame
        f.add(lname);
        f.add(tname);
        f.add(title);
        f.add(lemail);
        f.add(temail);
        f.add(lpass);
        f.add(tpass);
        f.add(lcpass);
        f.add(tcpass);
        f.add(lgender);
        f.add(cgender);
        f.add(ldob);
        f.add(tdob);
        f.add(lphone);
        f.add(tphone);
        f.add(laddress);
        f.add(taddress);
        f.add(submit);
        f.setSize(400, 650);    
        f.setLayout(null);
        f.setVisible(true);
        ButtonListner btnlistner = new ButtonListner(tname, temail, tpass, tcpass, tdob, tphone, cgender, taddress);
        submit.addActionListener(btnlistner);
    }
    public static void main(String[] args) {
        Form form = new Form();
    }
}